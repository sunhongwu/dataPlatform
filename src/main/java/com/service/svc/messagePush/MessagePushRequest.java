package com.service.svc.messagePush;

import com.google.gson.annotations.SerializedName;
import com.service.platform.http.HttpRequestBase;

import java.util.Map;

/**
 * 消息推送请求信息对象
 * @author linyang
 * @since 2017.12.07
 */
public class MessagePushRequest extends HttpRequestBase {

    /**
     * 进件编号
     */
    @SerializedName( "APP_NO" )
    private String appNo;

    /**
     * 合同编号
     */
    @SerializedName( "CONTRACT_NO" )
    private String contractNo;

    /**
     * appService 服务号
     */
    @SerializedName( "APPSERVER_NO" )
    private String appServerNo;

    /**
     * 发送的消息类型
     */
    @SerializedName( "MSG_TYPE" )
    private String msgType;

    /**
     * 当前订单状态
     */
    @SerializedName( "STATUS" )
    private String status;

    /**
     * 消息内容体
     */
    @SerializedName( "MSG_CONTENT" )
    private String msgContent;

    /**
     * 消息模板类型
     */
    @SerializedName( "TEMPLATE_TYPE" )
    private String templateType;

    /**
     * 当前订单的用户uuid
     */
    @SerializedName( "UUID" )
    private String uuid;

    /**
     * 交易流水号
     */
    @SerializedName( "SERVICE_SN" )
    private String serviceSn;

    /**
     * 推送消息请求参数
     */
    @SerializedName( "PARAMS" )
    private Map<String, Object> params;

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getAppServerNo() {
        return appServerNo;
    }

    public void setAppServerNo(String appServerNo) {
        this.appServerNo = appServerNo;
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getServiceSn() {
        return serviceSn;
    }

    public void setServiceSn(String serviceSn) {
        this.serviceSn = serviceSn;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }
}
