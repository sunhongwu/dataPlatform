package com.service.svc;

import com.service.platform.handler.entity.UnifiedServiceDoc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 *  抽象业务类对象 所有的对外服务接口 都需要直接集成当前抽象类
 *  @author: linyang
 *  @since: 2017/8/27 下午 1:41
 **/
public abstract class AbstractSvc<T> {

    // 日志记录对象
    protected Logger logger = LoggerFactory.getLogger( getClass() );

    /** 服务接口名称后缀 */
    public static final String svc_suffix = "Svc";

    /** 抽象服务的泛型在运行期间 引用的数据类型 */
    private Class<T> entityClass;

    public AbstractSvc(){
        Type type = this.getClass().getGenericSuperclass();
        if( type instanceof ParameterizedType ) entityClass = ( Class <T> ) ( ( ParameterizedType) type ).getActualTypeArguments()[0];
    }

    /**
     * 抽象方法 执行业务
     * @return
     */
    public abstract Object doSvc( UnifiedServiceDoc<T> params );

    /**
     * 获取抽象服务的泛型在运行期间 引用的数据类型
     * @return class < T >
     */
    public Class<T> getEntityClass(){
        return entityClass;
    }
}
