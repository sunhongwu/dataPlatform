package com.service.platform.message.messagePush;

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
     * 服务编号
     */
    @SerializedName( "SERVICE_ID" )
    public String serviceId = "SunlineCallback";

    /**
     * 发送时间
     */
    @SerializedName( "SEND_TIME" )
    public String sendTime;
    /**
     * 申请编号
     */
    @SerializedName( "APPLY_NO" )
    public String applyNo;
    /**
     * 合同号
     */
    @SerializedName( "CONTRA_NBR" )
    public String contraNbr;

    /**
     * 客户号
     */
    @SerializedName( "UUID" )
    public String uuid;

    /**
     * 原始交易流水号
     */
    @SerializedName( "SERVICE_SN" )
    public String serviceSn;

    /**
     * 消息类型
     */
    @SerializedName( "MSG_TYPE" )
    public String msgType;
    /**
     * 状态
     */
    @SerializedName( "STATUS" )
    public String status;
    /**
     * 消息内容
     */
    @SerializedName( "MSG_CONTENT" )
    public String msgContent;
    /**
     * 内容扩展
     */
    @SerializedName( "EXTRA" )
    public Map<String, Object> extra;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getApplyNo() {
        return applyNo;
    }

    public void setApplyNo(String applyNo) {
        this.applyNo = applyNo;
    }

    public String getContraNbr() {
        return contraNbr;
    }

    public void setContraNbr(String contraNbr) {
        this.contraNbr = contraNbr;
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

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Map<String, Object> getExtra() {
        return extra;
    }

    public void setExtra(Map<String, Object> extra) {
        this.extra = extra;
    }
}
