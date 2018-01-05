package com.service.policy.riskData.tongdun;

import com.service.platform.util.beanUtils.BeanUtils;
import com.service.platform.util.beanUtils.ValueTransHelper;

import java.util.List;

/**
 * 同盾请求流水号返回结果接口
 * @author linyang
 * @since 2017.07.19
 */
public class TongDunRiskResponse {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 *  Accept、Review、Reject三种值 风险决策结果
	 */
	@BeanUtils.BeanCopySettings( asTransName = "finalDecision" )
	private String final_decision;
	
	/**
	 *  范围1~65535 风险决策分数
	 */
	@BeanUtils.BeanCopySettings( asTransName = "finalScore" )
	private Integer final_score;
	
	/** 
	 * 最长30字，含中文字 与policy_set中的policy_name内容相同，为了向前兼容
	 */
	@BeanUtils.BeanCopySettings( asTransName = "policyName" )
	private String policy_name;
	
	/**
	 *  包含所有的命中规则详见后面hit_rules字段
	 */
	private List<TongDunRiskResHit> hit_rules;
	
	/**
	 *  策略集名称
	 */
	@BeanUtils.BeanCopySettings( asTransName = "policySetName" )
	private String policy_set_name;
	
	/**
	 *  风险类型 最长300字，只含英文字符特殊符号
	 */
	@BeanUtils.BeanCopySettings( asTransName = "riskType" )
	private String risk_type;
	
	/**
	 *  本次调用产生的唯一性SequenceID 最长32个字，只有英文字母和数字
	 */
	@BeanUtils.BeanCopySettings( asTransName = "seqId" )
	private String seq_id;
	
	/**
	 *  本次调用在服务端的执行时间 单位为毫秒
	 */
	@BeanUtils.BeanCopySettings( asTransName = "spendTime" )
	private Integer spend_time;
	
	/**
	 *  提交是否成功
	 */
	@BeanUtils.BeanCopySettings( transMethod = ValueTransHelper.boolean2Success_method )
	private Boolean success;
	
	/**
	 *  success为false的情况下对应错误码,详见错误代码表
	 */
	@BeanUtils.BeanCopySettings( asTransName = "reasonCode" )
	private String reason_code;

	public String getFinal_decision() {
		return final_decision;
	}

	public void setFinal_decision(String final_decision) {
		this.final_decision = final_decision;
	}

	public Integer getFinal_score() {
		return final_score;
	}

	public void setFinal_score(Integer final_score) {
		this.final_score = final_score;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public List<TongDunRiskResHit> getHit_rules() {
		return hit_rules;
	}

	public void setHit_rules(List<TongDunRiskResHit> hit_rules) {
		this.hit_rules = hit_rules;
	}

	public String getPolicy_set_name() {
		return policy_set_name;
	}

	public void setPolicy_set_name(String policy_set_name) {
		this.policy_set_name = policy_set_name;
	}

	public String getRisk_type() {
		return risk_type;
	}

	public void setRisk_type(String risk_type) {
		this.risk_type = risk_type;
	}

	public String getSeq_id() {
		return seq_id;
	}

	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}

	public Integer getSpend_time() {
		return spend_time;
	}

	public void setSpend_time(Integer spend_time) {
		this.spend_time = spend_time;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getReason_code() {
		return reason_code;
	}

	public void setReason_code(String reason_code) {
		this.reason_code = reason_code;
	}
}
