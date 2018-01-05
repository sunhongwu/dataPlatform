package com.service.policy.riskData.localBlack;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 本地很名单响应报文
 * @author linyang
 * @since 2017.09.26
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class LocalBlackResopnse {
	/**
	 * 响应代码 0-成功
	 */
	private String code;
	
	/**
	 * 	本地黑名单数据报文响应数据
	 */
	private LocalBlackResponseData data;
	
	/**
	 * 响应代码描述
	 */
	private String msg;
	
	/**
	 * 耗时
	 */
	private Integer useTime;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalBlackResponseData getData() {
		return data;
	}

	public void setData(LocalBlackResponseData data) {
		this.data = data;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getUseTime() {
		return useTime;
	}

	public void setUseTime(Integer useTime) {
		this.useTime = useTime;
	}
}
