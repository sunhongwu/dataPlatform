package com.service.platform.message.shortMessage;

import com.google.gson.annotations.SerializedName;
import com.service.platform.http.HttpRequestBase;
import com.service.platform.util.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 短信服务请求信息
 * @author linyang
 * @since 2017.12.05
 */
public class SmRequest extends HttpRequestBase {

    @SerializedName( "userId" )
    private String userId = "";

    @SerializedName( "mac" )
    private String mac = "";

    @SerializedName( "bizId" )
    private String bizId = "";

    @SerializedName( "mobiles" )
    private String mobiles = "";

    @SerializedName( "timestamp" )
    private String timestamp = "";

    @SerializedName( "sendTime" )
    private String sendTime = "20171205111111";

    @SerializedName( "content" )
    private String content = "";

    @SerializedName( "hasSign" )
    private String hasSign = "";

    @SerializedName( "extend" )
    private String extend = "";

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getMobiles() {
        return mobiles;
    }

    public void setMobiles(String mobiles) {
        this.mobiles = mobiles;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHasSign() {
        return hasSign;
    }

    public void setHasSign(String hasSign) {
        this.hasSign = hasSign;
    }

    public String getExtend() {
        return extend;
    }

    public SmRequest(String userId) {
        this.userId = userId;
    }

    public SmRequest(String userId, String mobiles, String content ) {
        this.userId = userId;
        this.mobiles = mobiles;
        this.content = content;
        this.timestamp = DateUtils.date2String( new Date(), DateUtils.yyyyMMddHHmmss );
    }

    public void setExtend( String extend ) {
        this.extend = extend;
    }

    public Map<String, String> covertToMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("userId", this.userId);
        map.put("mac", this.mac);
        map.put("mobiles", this.mobiles);
        map.put("content", this.content);
        map.put("timestamp", this.timestamp.toString());
        map.put("bizId", this.bizId == null ? "" : this.bizId);
        map.put("extend", this.extend == null ? "" : this.extend);
        map.put("sendTime", this.sendTime == null ? "" : this.sendTime.toString());
        map.put("hasSign", this.hasSign == null ? "" : this.hasSign);
        return map;
    }
}
