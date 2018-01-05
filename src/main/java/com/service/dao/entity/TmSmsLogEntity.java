package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/12/7.
 */
@Entity
@Table(name = "tm_sms_log", schema = "rmpsdb_che", catalog = "")
public class TmSmsLogEntity {
    private long id;
    private String appNo;
    private String mobileNumber;
    private String msgParam;
    private String message;
    private Timestamp createTime;
    private String smsTemplateCode;
    private String sendResult;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "APP_NO")
    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    @Basic
    @Column(name = "MOBILE_NUMBER")
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "MSG_PARAM")
    public String getMsgParam() {
        return msgParam;
    }

    public void setMsgParam(String msgParam) {
        this.msgParam = msgParam;
    }

    @Basic
    @Column(name = "MESSAGE")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "SMS_TEMPLATE_CODE")
    public String getSmsTemplateCode() {
        return smsTemplateCode;
    }

    public void setSmsTemplateCode(String smsTemplateCode) {
        this.smsTemplateCode = smsTemplateCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmSmsLogEntity that = (TmSmsLogEntity) o;

        if (id != that.id) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (mobileNumber != null ? !mobileNumber.equals(that.mobileNumber) : that.mobileNumber != null) return false;
        if (msgParam != null ? !msgParam.equals(that.msgParam) : that.msgParam != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (smsTemplateCode != null ? !smsTemplateCode.equals(that.smsTemplateCode) : that.smsTemplateCode != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (msgParam != null ? msgParam.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (smsTemplateCode != null ? smsTemplateCode.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "SEND_RESULT")
    public String getSendResult() {
        return sendResult;
    }

    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }
}
