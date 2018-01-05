package com.service.platform.filter.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  表单校验注解                          </br>
 *  用于标注Field, 表示当前被标注对象需要被当作一个表单进行递归校验 </br>
 *  进行表单校验时不能与 @See {@link com.service.platform.filter.annotation.FieldValidation } 同时使用
 *  @author: linyang
 *  @since: 2017/8/27 下午 10:53
 **/
@Target( ElementType.FIELD )
@Retention( RetentionPolicy.RUNTIME )
public @interface FormValidation {

    /**
     * 是否必填 default false
     * @return
     */
    public boolean required() default false;

}
