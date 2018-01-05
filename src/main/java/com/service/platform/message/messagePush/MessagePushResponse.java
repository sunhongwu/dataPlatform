package com.service.platform.message.messagePush;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * 消息推送响应结果
 * @author linyang
 * @since 2017.12.14
 */
public class MessagePushResponse implements Serializable {
    /**
     * 响应数据
     */
    @SerializedName( "data" )
    private Object data;

    /**
     * 结果 success
     */
    @SerializedName( "msg" )
    private String msg;

    /**
     * 结果描述
     */
    @SerializedName( "showMsg" )
    private String showMsg;

    /**
     * 响应状态码 0: 成功
     */
    @SerializedName( "code" )
    private Integer code;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getShowMsg() {
        return showMsg;
    }

    public void setShowMsg(String showMsg) {
        this.showMsg = showMsg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
