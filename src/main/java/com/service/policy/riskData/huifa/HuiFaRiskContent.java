package com.service.policy.riskData.huifa;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 汇法命中信息列表
 * @author linyang
 * @since 2017.08.28
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class HuiFaRiskContent {
	
	/**
	 * 执行公开信息
	 */
	private List<HuiFaRiskContentDetail> zhixing;
	
	/**
	 * 失信老赖名单
	 */
	private List<HuiFaRiskContentDetail> shixin;
	
	/**
	 * 限制高消费名单
	 */
	private List<HuiFaRiskContentDetail> xiangao;
	
	/**
	 * 限制出入境名单
	 */
	private List<HuiFaRiskContentDetail> xianchu;
	
	/**
	 * 民商事裁判文书
	 */
	private List<HuiFaRiskContentDetail> caipan;
	
	/**
	 * 民商事审判流程
	 */
	private List<HuiFaRiskContentDetail> shenpan;
	
	/**
	 * 罪犯及嫌疑人名单
	 */
	private List<HuiFaRiskContentDetail> zuifan;
	
	/**
	 * 行政违法记录
	 */
	private List<HuiFaRiskContentDetail> weifa;
	
	/**
	 * 欠税名单
	 */
	private List<HuiFaRiskContentDetail> qianshui;
	
	/**
	 * 纳税非正常户
	 */
	private List<HuiFaRiskContentDetail> feizheng;
	
	/**
	 * 欠款欠费名单
	 */
	private List<HuiFaRiskContentDetail> qiankuan;

	public List<HuiFaRiskContentDetail> getZhixing() {
		return zhixing;
	}

	public void setZhixing(List<HuiFaRiskContentDetail> zhixing) {
		this.zhixing = zhixing;
	}

	public List<HuiFaRiskContentDetail> getShixin() {
		return shixin;
	}

	public void setShixin(List<HuiFaRiskContentDetail> shixin) {
		this.shixin = shixin;
	}

	public List<HuiFaRiskContentDetail> getXiangao() {
		return xiangao;
	}

	public void setXiangao(List<HuiFaRiskContentDetail> xiangao) {
		this.xiangao = xiangao;
	}

	public List<HuiFaRiskContentDetail> getXianchu() {
		return xianchu;
	}

	public void setXianchu(List<HuiFaRiskContentDetail> xianchu) {
		this.xianchu = xianchu;
	}

	public List<HuiFaRiskContentDetail> getCaipan() {
		return caipan;
	}

	public void setCaipan(List<HuiFaRiskContentDetail> caipan) {
		this.caipan = caipan;
	}

	public List<HuiFaRiskContentDetail> getShenpan() {
		return shenpan;
	}

	public void setShenpan(List<HuiFaRiskContentDetail> shenpan) {
		this.shenpan = shenpan;
	}

	public List<HuiFaRiskContentDetail> getZuifan() {
		return zuifan;
	}

	public void setZuifan(List<HuiFaRiskContentDetail> zuifan) {
		this.zuifan = zuifan;
	}

	public List<HuiFaRiskContentDetail> getWeifa() {
		return weifa;
	}

	public void setWeifa(List<HuiFaRiskContentDetail> weifa) {
		this.weifa = weifa;
	}

	public List<HuiFaRiskContentDetail> getQianshui() {
		return qianshui;
	}

	public void setQianshui(List<HuiFaRiskContentDetail> qianshui) {
		this.qianshui = qianshui;
	}

	public List<HuiFaRiskContentDetail> getFeizheng() {
		return feizheng;
	}

	public void setFeizheng(List<HuiFaRiskContentDetail> feizheng) {
		this.feizheng = feizheng;
	}

	public List<HuiFaRiskContentDetail> getQiankuan() {
		return qiankuan;
	}

	public void setQiankuan(List<HuiFaRiskContentDetail> qiankuan) {
		this.qiankuan = qiankuan;
	}
	
	
	
	
}
