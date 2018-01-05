package com.service.platform.handler;

import com.google.gson.Gson;
import com.service.platform.filter.FormValidater;
import com.service.platform.handler.entity.UnifiedResponseEntity;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.param.def.UnifiedCode;
import com.service.svc.AbstractSvc;
import com.service.platform.util.ApplicationContextUtil;
import com.service.platform.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;

/**
 *  统一请求处理类对象, 进行标准化请求管理
 *  @author: linyang
 *  @since: 2017/8/27 上午 11:36
 **/
@RestController
public class UnifiedRequestHandler {

    private static Logger logger = LoggerFactory.getLogger( UnifiedRequestHandler.class );

    /**
     * 数据有效性验证对象
     */
    private static FormValidater formValidater = new FormValidater();

    /**
     * json 数据解析对象
     */
    private static Gson gson = new Gson();

    /**
     * 服务后缀名称chars
     */
    private static final char[] serviceSuffixArr = AbstractSvc.svc_suffix.toCharArray();

    /**
     * 统一请求处理 全部异常都将交由统一异常管理服务处理
     * @param request
     * @param response
     * @return
     * @throws UnifiedException
     */
    @RequestMapping( name = "/", method = RequestMethod.POST )
    public void unifieldPost ( @RequestBody byte[] requestBytes, HttpServletRequest request, HttpServletResponse response )
            throws RuntimeException {

        String requestBody = new String( requestBytes, Charset.forName( "utf-8" ));
        if( StringUtils.isNullOrBlank( requestBody ) )
            throw new UnifiedException( UnifiedCode.RES_4002.getCode(), UnifiedCode.RES_4002.getDesc() );

        try {
            requestBody = URLDecoder.decode( requestBody, "utf-8" );
            logger.info( "收到请求报文:{}", requestBody );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        // 表单校验 验证标准请求数据是否合法
        UnifiedServiceDoc serviceDoc = gson.fromJson( requestBody, UnifiedServiceDoc.class );
        formValidater.validate( serviceDoc );

        // 拼接获得serviceId
        String serviceId = getServiceId( serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceHeader().getServiceId() );

        // 从beanFactory 中获取业务执行对象
        AbstractSvc svc = null;
        try{
            svc = ( AbstractSvc ) ApplicationContextUtil.getBeanByName( serviceId );
        }catch( NoSuchBeanDefinitionException e ){
            throw new UnifiedException( UnifiedCode.RES_4003.getCode(), UnifiedCode.RES_4003.getDesc() );
        }

        // 获取抽象服务的泛型在运行期间 引用的数据类型
        Class<?> clz = svc.getEntityClass();
        if( null != clz ) toType( clz, serviceDoc );

        // 表单校验 验证业务参数是否合法
        formValidater.validate( serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest() );

        // 执行业务逻辑
        Object resData = svc.doSvc( serviceDoc );

        serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().setResponse( resData );
        // 操作返回数据 抛出的异常直接交由统一异常管理器进行处理
        doResponse( serviceDoc, response );
    }

    /**
     * 将应答数据写入应答对象
     * @param serviceDoc
     * @param response
     */
    private void doResponse( UnifiedServiceDoc serviceDoc, HttpServletResponse response ){
        try {
            // 设置应答格式
            response.setHeader("content-type", "application/json;charset=UTF-8" );
            // 设置应答信息
            UnifiedResponseEntity unifiedResponseEntity =
                    serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceHeader().getServResponse();

            if( null == unifiedResponseEntity ) unifiedResponseEntity = new UnifiedResponseEntity();

            unifiedResponseEntity.setStatus( UnifiedResponseEntity.SUCCESS_STATUS );
            unifiedResponseEntity.setCode( UnifiedCode.RES_0001.name() );
            unifiedResponseEntity.setDesc( UnifiedCode.RES_0001.getDesc() );

            serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceHeader().setServResponse( unifiedResponseEntity );

            // 清理请求参数
            serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().setRequest( null );

            String jsonRes = gson.toJson( serviceDoc );
            PrintWriter writer = response.getWriter();
            writer.write( jsonRes );
        } catch ( IOException ex ) {
            logger.error( ex.getMessage(), ex );
            // 当获取response写入对象出错是 直接抛出异常
            throw new UnifiedException( UnifiedCode.RES_4001.getCode(), UnifiedCode.RES_4001.getDesc() );
        }
    }

    /**
     * 获取服务id
     * @param applyServiceId
     * @return
     */
    private String getServiceId( String applyServiceId ){
        char[] applyChars = applyServiceId.toCharArray();
        char[] serviceId = new char[ serviceSuffixArr.length + applyChars.length ];
        // 判断第一个字符是否为大写 如果是 则转化为小写
        if( Character.isUpperCase( applyChars[0] ) ) applyChars[0] = Character.toLowerCase( applyChars[0] );

        System.arraycopy( applyChars, 0, serviceId, 0, applyChars.length );
        System.arraycopy( serviceSuffixArr, 0, serviceId, applyChars.length, serviceSuffixArr.length );
        return String.valueOf( serviceId );
    }

    /**
     * 将请求内容信息反序列化为服务指定的运行对象类型数据
     * @param clz < T >     服务入参泛型
     * @param serviceDoc    请求报文
     */
    private <T> void toType( Class<T> clz, UnifiedServiceDoc serviceDoc ){
        Object request = serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest();
        if( null == request ) return;

        String json = gson.toJson( request );
        T data = gson.fromJson( json, clz );
        serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().setRequest( data );
    }

}
