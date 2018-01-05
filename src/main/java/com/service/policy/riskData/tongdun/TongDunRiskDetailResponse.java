package com.service.policy.riskData.tongdun;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 同盾详情查询接口应答对象
 * @author linyang
 * @since 2017.08.29
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TongDunRiskDetailResponse {
	
	/**
	 * 请求是否成功
	 */
	private boolean success;
	
	/**
	 * 响应码
	 */
	private String reason_code;
	
	/**
	 * 相应原因
	 */
	private String reason_desc;
	
	/**
	 * 命中规则
	 */
	private List<TongDunRiskDetailResHit> rules;

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getReason_code() {
		return reason_code;
	}

	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}

	public String getReason_desc() {
		return reason_desc;
	}

	public void setReason_desc(String reason_desc) {
		this.reason_desc = reason_desc;
	}

	public List<TongDunRiskDetailResHit> getRules() {
		return rules;
	}

	public void setRules(List<TongDunRiskDetailResHit> rules) {
		this.rules = rules;
	}
}
