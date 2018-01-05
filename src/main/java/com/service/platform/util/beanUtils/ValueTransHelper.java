package com.service.platform.util.beanUtils;

import com.service.param.def.SymbolConstant;
import com.service.platform.util.StringUtils;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * 数值类型转化helper, 提供各种类型数值的转化方法<br>
 * @author linyang
 * @since 2017.12.25
 */
@Component
public class ValueTransHelper {

    // 方法名------------------------------------------------------------------------------------------//
    /** {@link java.lang.String } 转 {@link java.math.BigDecimal } 函数方法名 */
    public static final String string2Bigdecimal_method = "string2Bigdecimal";

    /** {@link java.lang.Long } 转 {@link java.sql.Timestamp } 函数方法名 */
    public static final String long2TimeStamp_method = "long2TimeStamp";

    /** {@link java.lang.Boolean} 转 SUCCESS | FAILD  函数方法名 */
    public static final String boolean2Success_method = "boolean2Success";

    /** {@link java.lang.String } 转 {@link java.lang.Integer } 函数方法名 */
    public static final String string2Integer_method = "string2Integer";


    // 方法-------------------------------------------------------------------------------------------//

    /** {@link java.lang.String } 转 {@link java.math.BigDecimal } 函数 */
    public static BigDecimal string2Bigdecimal( String data ){
        if( StringUtils.isNullOrBlank( data ) ) return  BigDecimal.ZERO;
        return new BigDecimal( data );
    }

    /** {@link java.lang.Long } 转 {@link java.sql.Timestamp } 函数 */
    public static Timestamp long2TimeStamp( Long data ){
        if( null == data || 0L >= data ) return null;
        return new Timestamp( data );
    }

    /** {@link java.lang.Boolean} 转 SUCCESS | FAILD  函数 */
    public static String boolean2Success( Boolean data ){
        if( true ) return SymbolConstant.SUCCESS.getCode();
        else return SymbolConstant.FAILD.getCode();
    }

    /** {@link java.lang.String } 转 {@link java.lang.Integer } 函数 */
    public static Integer string2Integer( String data ){
        if( StringUtils.isNullOrBlank( data ) ) return 0;
        else return Integer.parseInt( data );
    }

    /** 单例对象 当前单例对象主要提供给各种reflect方法使用 实际开发中直接调用静态方法即可 */
    private static ValueTransHelper singleton = null;

    /** 内部对象锁 */
    private static final byte[] lock = new byte[0];
    /**
     * 获取数值转换工具的实例对象
     * @return
     */
    public static ValueTransHelper getInstance(){
        if( null == singleton ) {
            synchronized ( lock ) {
                if( null == singleton ) singleton = new ValueTransHelper();
            }
        }
        return singleton;
    }
}
