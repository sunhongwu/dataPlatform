package com.service.policy.riskData.huifa;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 汇法网查询相应信息
 * @author linyang
 * @since 2017.08.28
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class HuiFaRiskResponse {
	
	/**
	 * 查询结果 S: 成功; E: 失败
	 */
	private String success;
	
	/**
	 * 返回信息描述
	 */
	private String message;
	
	/**
	 * 调用耗时
	 */
	private String seconds;
	
	/**
	 * 风险信息条数
	 */
	private String fxmsgnum;
	
	/**
	 * 风险信息页数
	 */
	private Integer fxpgnum;
	
	/**
	 * 风险内容模块
	 */
	private HuiFaRiskContent fxcontent;
	
	/**
	 * 风险分页模块
	 */
	private Object fxpgturn;
	
	/**
	 * 导航参数
	 */
	private Object fxnavigate;

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSeconds() {
		return seconds;
	}

	public void setSeconds(String seconds) {
		this.seconds = seconds;
	}

	public String getFxmsgnum() {
		return fxmsgnum;
	}

	public void setFxmsgnum(String fxmsgnum) {
		this.fxmsgnum = fxmsgnum;
	}

	public Integer getFxpgnum() {
		return fxpgnum;
	}

	public void setFxpgnum(Integer fxpgnum) {
		this.fxpgnum = fxpgnum;
	}

	public HuiFaRiskContent getFxcontent() {
		return fxcontent;
	}

	public void setFxcontent(HuiFaRiskContent fxcontent) {
		this.fxcontent = fxcontent;
	}

	public Object getFxpgturn() {
		return fxpgturn;
	}

	public void setFxpgturn(Object fxpgturn) {
		this.fxpgturn = fxpgturn;
	}

	public Object getFxnavigate() {
		return fxnavigate;
	}

	public void setFxnavigate(Object fxnavigate) {
		this.fxnavigate = fxnavigate;
	}
}
