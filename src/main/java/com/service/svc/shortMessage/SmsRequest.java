package com.service.svc.shortMessage;

import com.google.gson.annotations.SerializedName;
import com.service.param.def.SmsTemplateCode;

import java.io.Serializable;
import java.util.List;

/**
 * 短信服务请求对象
 * @author linyang
 * @since 2017.12.14
 */
public class SmsRequest implements Serializable {

    /**
     * 申请单编号
     */
    @SerializedName( "APP_NO" )
    private String appNo;

    /**
     * 短信模板编码 <br>
     * {@link SmsTemplateCode}
     */
    @SerializedName( "TEMPLATE_CODE" )
    private String templateCode;

    /**
     * 短信模板填充内容
     */
    @SerializedName( "PARAMS" )
    private List<String> params;

    /**
     * 手机号
     */
    @SerializedName( "MOBILE" )
    private String mobile;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public List<String> getParams() {
        return params;
    }

    public void setParams(List<String> params) {
        this.params = params;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
