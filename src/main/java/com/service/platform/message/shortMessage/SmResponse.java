package com.service.platform.message.shortMessage;

import java.io.Serializable;

/**
 * 短信服务响应信息
 * @author linyang
 * @since 2017.12.05
 */
public class SmResponse implements Serializable {

    public static final String SUCCESS = "0000";

    private String code;

    private String msg;

    private String userId;

    private String smsId;

    private String bizId;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSmsId() {
        return smsId;
    }

    public void setSmsId(String smsId) {
        this.smsId = smsId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    @Override
    public String toString() {
        return "SmResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", userId='" + userId + '\'' +
                ", smsId='" + smsId + '\'' +
                ", bizId='" + bizId + '\'' +
                '}';
    }
}
