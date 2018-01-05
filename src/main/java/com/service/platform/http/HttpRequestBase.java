package com.service.platform.http;

import com.google.gson.annotations.SerializedName;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * http 请求自定义实体抽象类
 * @author linyang
 * @since 2017.12.06
 */
public abstract class HttpRequestBase implements Serializable {

    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * 将当前类对象转化为地址请求参数形式 如: param1=aaa&param2=bbb <br>
     * 需要被转化为参数的对象需要使用 @See {@link com.google.gson.annotations.SerializedName} 进行标记
     * @return
     */
    public List<NameValuePair> getRequestParams(){
        Field[] fields = getClass().getDeclaredFields();
        List<NameValuePair> kvList = new ArrayList<NameValuePair>();

        for( int i = 0; i < fields.length; i++ ) {
            SerializedName serializedName = fields[i].getAnnotation( com.google.gson.annotations.SerializedName.class );
            if( null != serializedName ) {
                try {
                    Object fieldValue = null;
                    if( !fields[i].isAccessible() ){
                        fields[i].setAccessible( true );
                        fieldValue = fields[i].get( this );
                        fields[i].setAccessible( false );
                    }else
                        fieldValue = fields[i].get( this );

                    String fieldName = serializedName.value();
                    kvList.add( new BasicNameValuePair( fieldName, String.valueOf( fieldValue ) ) );
                } catch ( IllegalAccessException e ) {
                    logger.error( "[{}] 序列化名称SerializedName[{}] 的对象在转化为请求参数形式时发生异常", fields[i].getName(),
                            serializedName.value(), e );
                }
            }
        }
        return kvList;
    }
}
