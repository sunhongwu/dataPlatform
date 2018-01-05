package com.service.platform.handler.entity;

import com.google.gson.annotations.SerializedName;
import com.service.platform.filter.annotation.FormValidation;
import com.service.platform.http.HttpRequestBase;

import java.io.Serializable;

/**
 * 统一数据交互报文
 * @author linyang
 * @since 2017.12.07
 */
public class UnifiedServiceDoc<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 数据交互报文详情
     */
    @SerializedName( "SERVICE" )
    @FormValidation( required = true )
    private UnifiedServiceDocInfo<T> unifiedServiceDocInfo;

    public UnifiedServiceDocInfo<T> getUnifiedServiceDocInfo() {
        return unifiedServiceDocInfo;
    }

    public void setUnifiedServiceDocInfo(UnifiedServiceDocInfo<T> unifiedServiceDocInfo) {
        this.unifiedServiceDocInfo = unifiedServiceDocInfo;
    }
}
