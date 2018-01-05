package com.service.platform.handler.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 *  统一数据交互格式 标准化应答格式
 *  @author: linyang
 *  @since: 2017/8/24 下午 11:58
 **/
public class UnifiedResponseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 服务执行成功
     */
    public static final String SUCCESS_STATUS = "S";

    /**
     * 服务执行失败
     */
    public static final String FAILD_STATUS = "F";

    /**
     * 服务状态
     * S代表服务成功.F代表失败。
     */
    @SerializedName( value="STATUS" )
    private String status;

    /**
     * 处理状态
     */
    @SerializedName( value="CODE" )
    private String code;

    /**
     * 状态描述
     */
    @SerializedName( value="DESC" )
    private String desc;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
