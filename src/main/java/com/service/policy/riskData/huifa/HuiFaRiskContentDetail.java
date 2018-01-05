package com.service.policy.riskData.huifa;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 汇法命中详情
 * @author linyang
 * @since 2017.08.28
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class HuiFaRiskContentDetail {
	
	/**
	 * 数据主键Id
	 */
	private String keyid;
	
	/**
	 * 数据类型编号
	 */
	private String typet;
	
	/**
	 * 数据类型
	 */
	private String typetname;
	
	/**
	 * 标题
	 */
	private String title;
	
	/**
	 * 时间
	 */
	private String sslong;
	
	/**
	 * 执行标的
	 */
	private String money;
	
	/**
	 * 未履行金额
	 */
	private String wlmoney;

	public String getKeyid() {
		return keyid;
	}

	public void setKeyid(String keyid) {
		this.keyid = keyid;
	}

	public String getTypet() {
		return typet;
	}

	public void setTypet(String typet) {
		this.typet = typet;
	}

	public String getTypetname() {
		return typetname;
	}

	public void setTypetname(String typetname) {
		this.typetname = typetname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSslong() {
		return sslong;
	}

	public void setSslong(String sslong) {
		this.sslong = sslong;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getWlmoney() {
		return wlmoney;
	}

	public void setWlmoney(String wlmoney) {
		this.wlmoney = wlmoney;
	}
}
