package com.service.policy.riskData.localBlack;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 本地黑名单数据报文响应结果集
 * @author linyang
 * @since 2017.09.26
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class LocalBlackResponseResult {
	
	/**
	 * 是否命中本地黑名单
	 */
	private String isBlackList;
	
	/**
	 * 命中详情
	 */
	private Object details;

	public String getIsBlackList() {
		return isBlackList;
	}

	public void setIsBlackList(String isBlackList) {
		this.isBlackList = isBlackList;
	}

	public Object getDetails() {
		return details;
	}

	public void setDetails(Object details) {
		this.details = details;
	}
}
