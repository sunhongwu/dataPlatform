package com.service.platform.filter;

import com.service.platform.filter.annotation.FieldValidation;
import com.service.platform.filter.annotation.FormValidation;
import com.service.param.def.UnifiedCode;
import com.service.platform.handler.UnifiedException;
import com.service.platform.util.StringUtils;

import java.lang.reflect.Field;

/**
 *  表单校验器   </br>
 *  用于校验使用 被 @See {@link com.service.platform.filter.annotation.FieldValidation } 或
 *  {@link com.service.platform.filter.annotation.FormValidation } 标注的表单对象
 *  @author: linyang
 *  @since: 2017/8/27 下午 11:17
 **/
public class FormValidater {

    /**
     * 表单校验         </br>
     * @param data
     * @return
     */
    public boolean validate( Object data ) throws UnifiedException {
        formValid( null, data, null  );
        return true;
    }

    /**
     * 表单对象校验
     * @param anno  注解对象
     * @param data  数值
     * @return
     */
    private boolean formValid( FormValidation anno, Object data, Field formField ) throws UnifiedException {

        // 非空校验
        if( null != anno && anno.required() && null == data ) throwRequiredException( formField );

        // 当数值为空时不进行校验
        if( null == data ) return true;

        Class<?> clz = data.getClass();
        Field[] fields = clz.getDeclaredFields();

        for( Field field : fields ){
            // 获取递归校验注解 如果有则进行递归校验
            FormValidation formValidation = field.getAnnotation( FormValidation.class );
            // 获取对象校验注解 如果有则进行校验
            FieldValidation fieldValidation = field.getAnnotation( FieldValidation.class );

            // 同时包含 FormValidation 与 FieldValidation
            // 两种标签时 返回验证失败
            if( null != formValidation && null != fieldValidation )
                throw new UnifiedException( UnifiedCode.RES_4001.getCode(), "对象[".concat( field.getName() )
                        .concat( "]不能同时使用 FormValidation 与 FieldValidation 进行注解" ) );

            // 当两种标签都不存在时 跳过当前循环
            if( null == formValidation && null == fieldValidation ) continue;

            // 当前 field 的对象数值
            Object fieldValue = null;
            try{
                if( !field.isAccessible() ) {
                    field.setAccessible( true );
                    fieldValue = field.get( data );
                    field.setAccessible( false );
                }else fieldValue = field.get( data );
            }catch ( IllegalAccessException ex ) {
                throw new UnifiedException( UnifiedCode.RES_4002.getCode(), UnifiedCode.RES_4001.getDesc(), ex );
            }

            // field 类型校验
            if( null != fieldValidation ) fieldValid( fieldValidation, fieldValue, field );
            // 表单类数据校验
            else if( null != formValidation ) formValid( formValidation, fieldValue, field );
        }
        return  true;
    }

    /**
     * 变量对象校验
     * @param anno  注解对象
     * @param data  数值
     * @return
     */
    private boolean fieldValid( FieldValidation anno, Object data, Field field ) throws UnifiedException {
        // 当注解为空时 不进行校验
        if( null == anno ) return true;

        // 非空校验
        if( anno.required() && null == data ) throwRequiredException( field );

        // 当数值为空时不进行校验
        if( null == data ) return true;

        // 获取数值对象的定义类型
        Class<?> clz = data.getClass();

        // 内容长度校验
        if( anno.length() > FieldValidation.Length_0 ) {
            // java.util.Collection 类对象长度判断
            if( java.util.Collection.class == clz ) {
                java.util.Collection collection = ( java.util.Collection ) data;
                if( collection.size() > anno.length() ) throwLengthException( field );
            }
            // java.util.Map 类对象长度判断
            else if( java.util.Map.class == clz ){
                java.util.Map map = ( java.util.Map ) data;
                if( map.size() > anno.length() ) throwLengthException( field );
            }
            // 其他类型对象判断
            else{
                String strVal = String.valueOf( data );
                if( !StringUtils.isNullOrBlank( strVal ) && strVal.length() > anno.length() ) throwLengthException( field );
            }
        }
        return true;
    }

    /**
     * 抛出长度校验异常
     * @param field
     */
    private void throwLengthException( Field field ) throws UnifiedException {
    	
        throw new UnifiedException( UnifiedCode.RES_4002.getCode(), StringUtils.formatStringAsLog4J( "对象[{}]格式错误", field.getName() ) );
    }

    /**
     * 抛出必填校验异常
     * @param field
     */
    private void throwRequiredException( Field field ){
        throw new UnifiedException( UnifiedCode.RES_4002.getCode(), StringUtils.formatStringAsLog4J( "对象[{}]不能为空", field.getName() ) );
    }
}
