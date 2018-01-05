package com.service.policy.riskData.huifa;

/**
 * 汇法规则枚举
 * @author linyang
 * @since 2017.09.11
 */
public enum HuiFaRuleEnum {
	
	HUIFA_ZHIXING("zhixing", "汇法网执行公开信息"), 
	HUIFA_SHIXIN("shixin", "汇法网失信老赖名单"), 
	HUIFA_XIANGAO("xiangao", "汇法网限制高消费名单"), 
	HUIFA_XIANCHU("xianchu", "汇法网限制出入境名单"), 
	HUIFA_CAIPAN("caipan", "汇法网民商事裁判文书"), 
	HUIFA_SHENPAN("shenpan", "汇法网民商事审判流程信息"), 
	HUIFA_ZUIFAN("zuifan", "汇法网罪犯及嫌疑人名单"), 
	HUIFA_WEIFA("weifa", "汇法网行政违法记录"), 
	HUIFA_QIANSHUI("qianshui", "汇法网欠税名单"), 
	HUIFA_FEIZHENG("feizheng", "汇法网纳税非正常户"), 
	HUIFA_QIANKUAN("qiankuan", "汇法网欠款欠费名单");
	
	public String ruleId;
	private String ruleName;
	
	private HuiFaRuleEnum(String ruleId, String ruleName) {
		this.ruleId = ruleId;
		this.ruleName = ruleName;
	}
	
	public String getRuleId() {
		return ruleId;
	}
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}
	public String getRuleName() {
		return ruleName;
	}
	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	/**
	 * 根据规则id 获取规则名称
	 * @param ruleId
	 * @return
	 */
	public static String getRuleNameById( String ruleId ){
		HuiFaRuleEnum[] rules = HuiFaRuleEnum.values();
		for( HuiFaRuleEnum rule : rules ) {
			if( rule.ruleId.equals( ruleId ) ) return rule.ruleName;
		}
		return "";
	}
}
