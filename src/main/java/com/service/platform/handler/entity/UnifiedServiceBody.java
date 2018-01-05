package com.service.platform.handler.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.reflect.Type;

/**
 *  统一报文内容                  </br>
 *  主要用于面向业务， 开发时解析
 *  @author: linyang
 *  @since: 2017/8/27 上午 10:45
 **/
public class UnifiedServiceBody<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 接受报文信息
     */
    @SerializedName( value= "REQUEST" )
    private T request;

    /**
     * 返回报文信息
     */
    @SerializedName( value= "RESPONSE" )
    private Object response;

    public T getRequest() {
        return request;
    }

    public void setRequest(T request) {
        this.request = request;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }
}
