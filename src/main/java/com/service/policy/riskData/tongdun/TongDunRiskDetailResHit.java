package com.service.policy.riskData.tongdun;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

/**
 * 同盾命中详情查询 命中规则信息
 * @author linyang
 * @since 2017.08.29
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@JsonIgnoreProperties(ignoreUnknown=true)
public class TongDunRiskDetailResHit {
	
	/**
	 * 命中规则id
	 */	
	private String rule_id;
	
	/**
	 * 命中得分
	 */
	private Integer score;
	
	/**
	 * 命中详情
	 */
	private Object conditions;

	public String getRule_id() {
		return rule_id;
	}

	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Object getConditions() {
		return conditions;
	}

	public void setConditions(Object conditions) {
		this.conditions = conditions;
	}
}
