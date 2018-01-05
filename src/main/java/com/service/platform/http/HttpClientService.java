package com.service.platform.http;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.service.param.def.UnifiedCode;
import com.service.platform.handler.UnifiedException;
import com.service.platform.util.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

/**
 * http 请求服务
 * @author linyang
 * @since 2017.12.05
 */
@Service
public class HttpClientService {

    private static final Logger logger = LoggerFactory.getLogger( HttpClientService.class );

    /** 等待数据响应超时时间 30s */
    private static final int socketTimeout = 30000;
    /** 等待建立连接超时时间 5s */
    private static final int connectTimeout = 5000;
    /** 请求配置属性 */
    private static RequestConfig requestConfig;

    public HttpClientService(){
        super();
        HttpPost httppost = new HttpPost();
        RequestConfig.Builder configBuilder = RequestConfig.custom();
        configBuilder.setConnectTimeout( connectTimeout );
        configBuilder.setSocketTimeout( socketTimeout );
        requestConfig = configBuilder.build();
    }

    /**
     * 使用post 方式请求指定url 服务 数据类型为默认数据类型
     * @param url               请求访问地址
     * @param requestParams     请求参数
     * @param returnType        请求正确完成时的返回结果类型 如果为空 或 为 {@link java.lang.String } 则默认转化为
     *                           {@link java.lang.String } 类型数据
     * @return
     */
    public <T> T sendPostKV( String url, HttpRequestBase requestParams, Class<T> returnType ) {

        if( StringUtils.isNullOrBlank( url ) ) return null;

        // 初始化httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost( url );

        Gson gson = new Gson();

        // 设置请求报文
        UrlEncodedFormEntity stringEntity = null;
        try {
            stringEntity = new UrlEncodedFormEntity( requestParams.getRequestParams(),"utf-8" );
            stringEntity.setContentEncoding( "UTF-8" );
            postMethod.setEntity( stringEntity );
            // 发送请求
            return post( url, httpClient, postMethod, gson, returnType );
        } catch ( UnsupportedEncodingException e ) {
            throw  new UnifiedException( UnifiedCode.RES_4004.name(), UnifiedCode.RES_4004.getDesc(), e.getCause() );
        }
    }

    /**
     * 使用post 方式请求指定url 服务 数据类型为默认数据类型
     * @param url               请求访问地址
     * @param requestParams     请求参数
     * @param returnType        请求正确完成时的返回结果类型 如果为空 或 为 {@link java.lang.String } 则默认转化为
     *                           {@link java.lang.String } 类型数据
     * @return
     */
    public <T> T sendPostKV( String url, List<NameValuePair> requestParams, Class<T> returnType ) {

        if( StringUtils.isNullOrBlank( url ) ) return null;

        // 初始化httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost( url );

        Gson gson = new Gson();

        // 设置请求报文
        UrlEncodedFormEntity stringEntity = null;
        try {
            stringEntity = new UrlEncodedFormEntity( requestParams, "utf-8" );
            stringEntity.setContentEncoding( "UTF-8" );
            postMethod.setEntity( stringEntity );

            // 发送请求
            return post( url, httpClient, postMethod, gson, returnType );
        } catch ( UnsupportedEncodingException e ) {
            throw  new UnifiedException( UnifiedCode.RES_4004.name(), UnifiedCode.RES_4004.getDesc(), e.getCause() );
        }
    }

    /**
     * 使用post 方式请求指定url 服务 数据类型为Json
     * @param url               请求访问地址
     * @param requestParams     请求参数
     * @param returnType        请求正确完成时的返回结果类型 如果为空 或 为 {@link java.lang.String } 则默认转化为
     *                           {@link java.lang.String } 类型数据
     * @return
     */
    public <T> T sendPostJson( String url, HttpRequestBase requestParams, Class<T> returnType ) {

        if( StringUtils.isNullOrBlank( url ) ) return null;

        // 初始化httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost( url );

        Gson gson = new Gson();

        // 设置请求报文
        StringEntity stringEntity = null;
        stringEntity = new StringEntity( gson.toJson( requestParams ), "utf-8" );
        stringEntity.setContentEncoding( "UTF-8" );
        stringEntity.setContentType( "application/json" );
        postMethod.setEntity( stringEntity );
        // 发送请求
        return post( url, httpClient, postMethod, gson, returnType );
    }

    /**
     * 使用post 方式请求指定url 服务 数据类型为Json
     * @param url               请求访问地址
     * @param requestParams     请求参数
     * @param returnType        请求正确完成时的返回结果类型 如果为空 或 为 {@link java.lang.String } 则默认转化为
     *                           {@link java.lang.String } 类型数据
     * @return
     */
    public <T> T sendPostJson( String url, JsonObject requestParams, Class<T> returnType ) {

        if( StringUtils.isNullOrBlank( url ) ) return null;

        // 初始化httpclient 对象
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postMethod = new HttpPost( url );

        Gson gson = new Gson();

        // 设置请求报文
        StringEntity stringEntity = new StringEntity( requestParams.toString(), "utf-8");
        stringEntity.setContentEncoding( "UTF-8" );
        stringEntity.setContentType( "application/json" );
        postMethod.setEntity( stringEntity );

        // 发送请求
        return post( url, httpClient, postMethod, gson, returnType );
    }

    /**
     * 发送post 请求
     * @param url           请求地址
     * @param httpClient    http 客户端
     * @param postMethod    post 请求对象
     * @param gson
     * @param returnType    返回数据类型
     * @param <T>
     * @return
     */
    private <T> T post( String url, HttpClient httpClient, HttpPost postMethod, Gson gson, Class<T> returnType ){
        try {
            // 发送http 请求
            HttpResponse response = httpClient.execute( postMethod );
            // 如果响应码为 200 正确响应
            if ( response.getStatusLine().getStatusCode() == HttpStatus.SC_OK ) {
                // 请求相应结果
                String res = null;
                res = EntityUtils.toString( response.getEntity(), "UTF-8" );
                T resObject = transRes2Object( res, returnType, gson );
                return resObject;
            }else{
                logger.error("post请求提交失败:[{}],响应状态：[{}]" , url, response.getStatusLine().getStatusCode());
                return null;
            }
        } catch ( UnsupportedEncodingException e ) {
            throw  new UnifiedException( UnifiedCode.RES_4004.name(), UnifiedCode.RES_4004.getDesc(), e.getCause() );
        } catch ( ClientProtocolException e ) {
            throw  new UnifiedException( UnifiedCode.RES_4005.name(), UnifiedCode.RES_4005.getDesc(), e.getCause() );
        } catch ( IOException e ) {
            throw  new UnifiedException( UnifiedCode.RES_9999.name(), UnifiedCode.RES_9999.getDesc(), e.getCause() );
        }
    }

    /**
     * 将http 请求结果转化为指定的类型数据
     * @param res           json 格式的字符串数据
     * @param returnType    数据转化的目标类型 如果为空 或 为 {@link java.lang.String } 则默认转化为
     *                      {@link java.lang.String } 类型数据
     * @param <T>
     * @return
     */
    private <T> T transRes2Object( String res, Class<T> returnType, Gson gson ){
        if( StringUtils.isNullOrBlank( res ) ) return  null;
        if( String.class == returnType || null == returnType ) {
            return ( T ) res;
        }else {
            T resObj = gson.fromJson( res, (Class<T>) returnType );
            return resObj;
        }
    }
}
