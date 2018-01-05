package com.service.platform.handler.entity;

import com.google.gson.annotations.SerializedName;
import com.service.platform.filter.annotation.FieldValidation;

import java.io.Serializable;

/**
 *  统一报文头部                      </br>
 *  用于服务间通信, 由基础服务负责解析
 *  @author: linyang
 *  @since: 2017/8/27 上午 10:35
 **/
public class UnifiedServiceHeader implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 交易服务码
     */
    @SerializedName(value="SERVICE_ID")
    @FieldValidation( required = true )
    private String serviceId;

    /**
     * 本系统机构编号
     */
    @SerializedName(value="ORG")
    private String org;

    /**
     * 服务渠道编号
     */
    @SerializedName(value="CHANNEL_ID")
    private String channelId;

    /**
     * 收单机构编号
     */
    @SerializedName(value="ACQ_ID")
    private String  acqId;

    /**
     * 终端类型
     */
    @SerializedName(value="SUB_TERMINAL_TYPE")
    @FieldValidation( required = true )
    private String subTerminalType;

    /**
     * 请求交易流水号
     */
    @SerializedName(value="SERVICESN")
    @FieldValidation( required = true )
    private String serviceSn;
    /**
     * 操作员号
     */
    @SerializedName(value="OP_ID")
    private String opId;

    /**
     * 交易响应时间
     * YYYYMMDDHHMMSS
     */
    @SerializedName(value="REQUEST_TIME")
    private String requstTime;

    /**
     * 版本号
     */
    @SerializedName(value="VERSION_ID")
    private String  versionId;

    /**
     * 信息安全码MAC
     *
     */
    @SerializedName(value="MAC")
    private String mac;

    /**
     * 响应状态信息
     */
    @SerializedName(value="SERV_RESPONSE")
    private UnifiedResponseEntity servResponse;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getAcqId() {
        return acqId;
    }

    public void setAcqId(String acqId) {
        this.acqId = acqId;
    }

    public String getSubTerminalType() {
        return subTerminalType;
    }

    public void setSubTerminalType(String subTerminalType) {
        this.subTerminalType = subTerminalType;
    }

    public String getServiceSn() {
        return serviceSn;
    }

    public void setServiceSn(String serviceSn) {
        this.serviceSn = serviceSn;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getRequstTime() {
        return requstTime;
    }

    public void setRequstTime(String requstTime) {
        this.requstTime = requstTime;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public UnifiedResponseEntity getServResponse() {
        return servResponse;
    }

    public void setServResponse(UnifiedResponseEntity servResponse) {
        this.servResponse = servResponse;
    }
}
