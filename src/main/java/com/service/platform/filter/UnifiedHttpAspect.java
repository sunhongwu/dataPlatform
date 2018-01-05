package com.service.platform.filter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 *  统一Http请求拦截器
 *  @author: linyang
 *  @since: 2017/8/21 0021 下午 8:55 
 **/
@Aspect
@Component
public class UnifiedHttpAspect {

    private static Logger logger = LoggerFactory.getLogger( UnifiedHttpAspect.class );

    @Pointcut( "execution( public * com.service.platform.handler.UnifiedRequestHandler.*(..) )" )
    public void pointcut(){
        logger.info( "" );
    }

    @Before( value = "pointcut()")
    public void doBefore( JoinPoint joinPoint ){

//        ServletRequestAttributes attributes = ( ServletRequestAttributes ) RequestContextHolder.getRequestAttributes();
//        HttpServletRequest request = attributes.getRequest();
//
//        // url
//        logger.info( "url={}", request.getRequestURL() );
//
//        // method
//        logger.info( "method={}", request.getMethod() );
//
//        // ip
//        logger.info( "ip={}", request.getRemoteAddr() );
//
//        // 类方法
//        logger.info( "class_method={}", joinPoint.getSignature().getDeclaringTypeName() +
//                "." + joinPoint.getSignature().getName() );
//
//        // 参数
//        logger.info( "args={}", joinPoint.getArgs() );
//
//        logger.info( "@@@@@@@@@@@@@@@before" );
    }

    @After( "pointcut()" )
    public void doAfter(){
//        logger.info( "@@@@@@@@@@@@@@@doAfter" );
    }

    @AfterReturning( returning = "object", pointcut = "pointcut()")
    public void doAfterReturning( Object object ){
//        logger.info( "response={}", object );
    }

}
