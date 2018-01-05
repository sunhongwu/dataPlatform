package com.service.policy.riskData;

/**
 * 被查询风控数据的人员信息
 * @author linyang
 * @since 2017.09.28
 */
public class PoliciedPersonInfo {
	
	// 被查询人姓名
	private String name;
	
	// 被查询人手机号
	private String mobile;
	
	// 被查询人身份证号
	private String idNo;
	
	// 联系人关系
	private String linkRelation;
	
	// 被查询人银行卡号
	private String bankCardNbr;

	/**
	 * 风控统一查询参数
	 */
	public PoliciedPersonInfo(){}

	/**
	 * 
	 * 风控统一查询参数
	 * @param name 			姓名
	 * @param mobile 			手机号
	 * @param idNo 			身份证号
	 * @param linkRelation		联系人与主借人关系 I: 本人; C: 共借人;  M: 配偶
	 * @param bankCardNbr		银行卡号
	 */
	public PoliciedPersonInfo( String name, String mobile, String idNo, String linkRelation, String bankCardNbr ) {
		this.name = name;
		this.mobile = mobile;
		this.idNo = idNo;
		this.linkRelation = linkRelation;
		this.bankCardNbr = bankCardNbr;
	}



	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile( String mobile ) {
		this.mobile = mobile;
	}

	public String getIdNo() {
		return idNo;
	}

	public void setIdNo( String idNo ) {
		this.idNo = idNo;
	}

	public String getLinkRelation() {
		return linkRelation;
	}

	public void setLinkRelation( String linkRelation ) {
		this.linkRelation = linkRelation;
	}

	public String getBankCardNbr() {
		return bankCardNbr;
	}

	public void setBankCardNbr( String bankCardNbr ) {
		this.bankCardNbr = bankCardNbr;
	}
}
