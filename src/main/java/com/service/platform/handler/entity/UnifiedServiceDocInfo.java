package com.service.platform.handler.entity;

import com.google.gson.annotations.SerializedName;
import com.service.platform.filter.annotation.FormValidation;

import java.io.Serializable;

/**
 * 数据交互报文详情
 * @author linyang
 * @since 2017.12.07
 */
public class UnifiedServiceDocInfo<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据交互报文头部信息
     */
    @SerializedName( "SERVICE_HEADER" )
    @FormValidation( required = true )
    private UnifiedServiceHeader unifiedServiceHeader;

    /**
     * 数据交互报文内容信息
     */
    @SerializedName( "SERVICE_BODY" )
    @FormValidation( required = true )
    private UnifiedServiceBody<T> unifiedServiceBody;

    public UnifiedServiceHeader getUnifiedServiceHeader() {
        return unifiedServiceHeader;
    }

    public void setUnifiedServiceHeader(UnifiedServiceHeader unifiedServiceHeader) {
        this.unifiedServiceHeader = unifiedServiceHeader;
    }

    public UnifiedServiceBody<T> getUnifiedServiceBody() {
        return unifiedServiceBody;
    }

    public void setUnifiedServiceBody(UnifiedServiceBody<T> unifiedServiceBody) {
        this.unifiedServiceBody = unifiedServiceBody;
    }
}
