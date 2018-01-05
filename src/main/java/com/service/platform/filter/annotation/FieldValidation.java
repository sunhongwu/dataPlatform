package com.service.platform.filter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  值对象校验注解  </br>
 *  用于标注需要进行校验的值对象  </br>
 *  进行表单校验时不能与 @See{@link com.service.platform.filter.annotation.FormValidation} 同时使用
 *  @author: linyang
 *  @since: 2017/8/27 下午 10:57
 **/
@Target( ElementType.FIELD )
@Retention( RetentionPolicy.RUNTIME )
public @interface FieldValidation {

    /**
     * 长度默认值 0 当为默认值时 将不进行校验
     */
    public static final int Length_0 = 0;

    /**
     * 是否必填 default false
     * @return
     */
    public boolean required() default false;

    /**
     * 内容最大长度 仅对String 类型生效
     * @return
     */
    public int length() default Length_0;

}
