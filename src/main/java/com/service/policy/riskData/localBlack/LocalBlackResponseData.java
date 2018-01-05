package com.service.policy.riskData.localBlack;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 本地黑名单数据报文响应数据
 * @author linyang
 * @since 2017.09.26
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class LocalBlackResponseData {
	
	/**
	 * 业务编号
	 */
	private String bizNo;
	
	/**
	 * 服务编码吗
	 */
	private String serviceCode;
	
	/**
	 * 本地黑名单数据报文响应结果集
	 */
	private LocalBlackResponseResult result;

	public String getBizNo() {
		return bizNo;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public LocalBlackResponseResult getResult() {
		return result;
	}

	public void setResult(LocalBlackResponseResult result) {
		this.result = result;
	}
}
