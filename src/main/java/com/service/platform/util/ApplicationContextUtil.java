package com.service.platform.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 *  应用上下文对象
 *  @author: linyang
 *  @since: 2017/8/27 下午 1:11
 **/
@Component
public class ApplicationContextUtil implements ApplicationContextAware {

    /**
     * 应用上下文
     */
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext( ApplicationContext applicationContext ) throws BeansException {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext(){
        return applicationContext;
    }

    /**
     * 根据class全限定名称获取 对应的 bean 实例对象
     * @param name bean 名称
     * @return
     */
    public static Object getBeanByName( String name ) throws BeansException {
        return applicationContext.getBean( name );
    }

    /**
     * 根据class 对象类型 获取 bean 实例对象
     * @param clz
     * @return
     * @throws BeansException
     */
    public static Object getBeanByClass( Class<?> clz )throws BeansException {
        return applicationContext.getBean( clz );
    }
}
