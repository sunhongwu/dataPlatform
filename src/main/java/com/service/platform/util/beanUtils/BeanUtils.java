package com.service.platform.util.beanUtils;

import com.service.param.def.UnifiedCode;
import com.service.platform.handler.UnifiedException;
import com.service.platform.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * bean 对象操作补充工具类 <br>
 * 提供对bean对象的补充操作支持
 * @author linyang
 * @since 2017.12.18
 */
public class BeanUtils {

    /** 日志记录对象 */
    private static final Logger logger = LoggerFactory.getLogger( BeanUtils.class );

    /**
     * 将一个 bean 对象中成员变量的内容 拷贝到另外一个对象的成员变量中 <br>
     * 仅当 成员变量名称相同时才会进行拷贝操作, 如需忽略成员变量的大小写或其他拷贝配置 <br>
     * 请在该成员变量上使用{@link BeanCopySettings } 注解进行标记, <br>
     * 如果未使用 {@link BeanCopySettings } 注解的对象, 则严格按照成员变量的名称进行匹配 <br>
     *
     * <H1>如果 数据源对象(from 对象) 与 目标对象(to 对象) 中 对忽略大小写后名称相同的成员对象进行注解, 将以 目标对象(to 对象)为准</H1>
     *
     * @param from  数据源对象 不能为空
     * @param to    目标对象   不能为空
     */
    public static void copy( Object from, Object to ){
        // 当对象为空时结束当前拷贝操作
        if( null == from ||  null == to ) return ;

        // 数据源对象field map
        Map<String, Field> fromObjFieldMap = getStandardFieldMap( from.getClass() );
        // 转化目标对象 field map
        Map<String, Field> toObjFieldMap = getStandardFieldMap( to.getClass() );

        for( Map.Entry<String, Field> entry : toObjFieldMap.entrySet() ){
            // 目标 成员变量的转化名称
            String toFieldName = entry.getKey();

            // 数据源成员变量
            Field fromField = null;
            // 拷贝目标成员变量
            Field toField = null;

            if( fromObjFieldMap.containsKey( toFieldName ) ){
                fromField = fromObjFieldMap.get( toFieldName );
                toField = entry.getValue();
                // 数据拷贝
                copyFieldValue( from, to, fromField, toField );
            }
        }
    }

    /**
     * 拷贝对象的成员变量内容到另外对象的成员变量中
     * @param from          数据来源对象
     * @param to            拷贝目标对象
     * @param fromField     数据来源对象成员变量定义
     * @param toField       拷贝目标对象成员变量定义
     */
    private static void copyFieldValue( Object from, Object to, Field fromField, Field toField ){
        // 记录数据来源成员变量的可读取状态
        boolean fromFieldAccessable = fromField.isAccessible();
        // 记录拷贝目标成员变量的可读取状态
        boolean toFieldAccessable = toField.isAccessible();

        // 获取 from Object 中的 BeanCopySettings 注解信息
        BeanCopySettings beanCopySettings = fromField.getAnnotation( BeanCopySettings.class );

        fromField.setAccessible( true );
        toField.setAccessible( true );
        try {
            // 当from 对象的Field 指定了转化方法时, 使用其指定的方法进行格式转化
            if( null != beanCopySettings && !StringUtils.isNullOrBlank( beanCopySettings.transMethod() ) ) {
                Method transMethod = ValueTransHelper.class.getDeclaredMethod( beanCopySettings.transMethod(), fromField.getType() );
                toField.set( to, transMethod.invoke( ValueTransHelper.getInstance(), fromField.get( from ) ) );
            }else
                toField.set( to, fromField.get( from ) );
        } catch ( Exception e ) {
            logger.error( "变量拷贝失败fromFieldName[{}], toFieldName[{}]", fromField.getName(), toField.getName(), e );
            throw new UnifiedException( UnifiedCode.RES_4001.getCode(),
                        StringUtils.formatStringAsLog4J( "对象数据类型不匹配, from[{}] to[{}] 成员变量名称 from[{}] to[{}]",
                                from.getClass().getCanonicalName(), to.getClass().getCanonicalName(), fromField, toField ) );
        }

        fromField.setAccessible( fromFieldAccessable );
        toField.setAccessible( toFieldAccessable );
    }

    /**
     * 解析传入类对象的成员变量信息, 并以Map<String, Field> 的标准解析形式返回, <br>
     * 当成员变量包含 {@link BeanCopySettings} 注解时 将按照注解中配置的变量名称生成 <br>
     * 结果集的key值
     * @param clz 目标类型
     * @return
     */
    private static Map<String, Field> getStandardFieldMap( Class<?> clz ){

        Map<String, Field> standardFieldMap = new HashMap<String, Field>();
        Field[] fields = clz.getDeclaredFields();

        // 将field 对象的名称全部转化为小写
        for( Field field : fields ){

            // 获取 BeanCopySettings 注解信息
            BeanCopySettings beanCopySettings = field.getAnnotation( BeanCopySettings.class );

            // 拷贝数据时的匹配名称
            String transName = StringUtils.nullString;

            // 当变量被 BeanCopySettings 注解标记时
            if( null != beanCopySettings ) {

                // 当指定数据拷贝时使用的匹配名称时
                if( !StringUtils.isNullOrBlank( beanCopySettings.asTransName() ) )
                    transName = beanCopySettings.asTransName();
                else {
                    transName = field.getName();

                    // 当名称设置为忽略大小写时
                    boolean isSetted = beanCopySettings.ignoreCase();
                    if( isSetted ) transName = transName.toLowerCase();

                    // 当名称设置为忽略下划线时
                    isSetted = beanCopySettings.ignoreUnderLine();
                    if( isSetted ) transName = transName.replaceAll( "_", StringUtils.blankString );
                }
            }
            else transName = field.getName();

            // 如果当前对象同时包含两个相同转化名称的成员变量 则抛出异常
            if( standardFieldMap.containsKey( transName ) )
                throw new UnifiedException( UnifiedCode.RES_4001.getCode(),
                        clz.getCanonicalName().concat( " 对象中同时包含两个拷贝名称为[" ).concat( transName ).concat( "] 的成员变量" )  );

            standardFieldMap.put( transName, field );
        }

        return standardFieldMap;
    }

    /**
     * 在复制bean内容时 设置详细的拷贝信息 <br>
     * {@link BeanCopySettings} 注解信息 在进行对象内容拷贝时 将按照注解内容解析对象成员变量的name值 <br>
     * 1.是否忽略被注解成员变量名称中的大小写 <br>
     * 2.是否忽略被注解成员变量名称中的下划线 <br>
     * 3.指定在变量数据拷贝时的名称 在数据拷贝时 将仅按照变量指定名称进行匹配拷贝 <br>
     * <br>
     * ps: <br>
     * 1.{@link BeanCopySettings} 注解目前仅在 {@link BeanUtils } 类提供的方法中生效 <br>
     * 2.配置信息生效优先级 asTransName > ( ignoreUnderLine | ignoreCase ) <br>
     * 当包含 asTransName 参数时 将忽略  ignoreUnderLine 与 ignoreCase 两个参数配置 <br>
     * 3.ignoreUnderLine 与 ignoreCase 两个参数配置 可以同时生效 <br>
     * 4.{@link BeanCopySettings} 注解在 数据源对象 或 目标对象中都会生效
     */
    @Target( ElementType.FIELD )
    @Retention( RetentionPolicy.RUNTIME )
    public @interface BeanCopySettings {

        /**
         * 当前 {@link java.lang.reflect.Field } 是否需要忽略大小写进行数值拷贝
         * @return
         */
        boolean ignoreCase() default false;

        /**
         * 当前 {@link java.lang.reflect.Field } 是否需要忽略名称中的下划线
         * @return
         */
        boolean ignoreUnderLine() default false;

        /**
         * 当前 {@link java.lang.reflect.Field } 在进行数据拷贝时使用匹配的名称
         * @return
         */
        String asTransName() default StringUtils.blankString;

        /**
         * 当前 {@link java.lang.reflect.Field } 在进行数据拷贝时用来进行数值转化的方法名称, 仅在from 对象中的配置生效 <br>
         * 取值范围为 {@link com.service.platform.util.beanUtils.ValueTransHelper } 中声明的方法名称常量
         * @return
         */
        String transMethod() default StringUtils.blankString;
    }

}
