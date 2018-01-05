package com.service.platform.handler;

import com.google.gson.Gson;
import com.service.platform.handler.entity.UnifiedResponseEntity;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.platform.handler.entity.UnifiedServiceDocHelper;
import com.service.param.def.UnifiedCode;
import com.service.platform.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *  统一异常处理
 *  @author: linyang
 *  @since: 2017/8/22 上午 12:02
 **/
@ControllerAdvice
public class UnifiedExceptionHandler {

    /**
     * 当前服务名称
     */
    private static final String thisServiceName = "Unified Exception Service";

    // 日志记录对象
    private static Logger logger = LoggerFactory.getLogger( UnifiedExceptionHandler.class );

    private static Gson gson = new Gson();

    /**
     * 异常响应
     * @param httpEntity
     * @param e
     * @param request
     * @param response
     */
    @ExceptionHandler( value = { Exception.class } )
    public void exceptionHandler( Exception e, HttpServletRequest request, HttpServletResponse response ) {

        // 异常响应对象
        UnifiedServiceDoc unifiedServiceDoc = null;

        response.setHeader("content-type", "application/json;charset=UTF-8");

        String mess = e.getMessage();
        if( StringUtils.isNullOrBlank( mess ) ) mess = UnifiedCode.RES_9999.getDesc();

        if( e instanceof UnifiedException ) {                       // 如果为已捕捉异常 则将捕捉后的异常信息整理返回
            UnifiedException ex = (UnifiedException) e;
            unifiedServiceDoc = UnifiedServiceDocHelper.newUnifiedServiceDoc_response(
                    thisServiceName, UnifiedResponseEntity.FAILD_STATUS, ex.getCode(), mess );
            logger.error( ex.getMessage(), ex );
        } else {                                                    // 未进行捕捉的异常 则返回执行失败
            unifiedServiceDoc = UnifiedServiceDocHelper.newUnifiedServiceDoc_response(
                    thisServiceName, UnifiedResponseEntity.FAILD_STATUS, UnifiedCode.RES_9999.getCode(), mess );
            logger.error( e.getMessage(), e );
        }

        try {
            // 输出返回结果
            PrintWriter writer = response.getWriter();
            writer.write( gson.toJson( unifiedServiceDoc ) );
        } catch ( IOException ex ) {
            logger.error( ex.getMessage(), ex );
            // 当获取response写入对象出错是 直接抛出异常
            throw new UnifiedException( UnifiedCode.RES_4001.getCode(), UnifiedCode.RES_4001.getDesc() );
        }
    }
}
