package com.service.param.def;

/**
 * 风控规则信息
 * @author linyang
 * @since 2017.11.06
 */
public enum PolicyEnum {
	
	tongdun( "同盾", "tongdunRefuse", "同盾风控规则拒绝", false ),
	huifa( "汇法", "huifaRefuse", "汇法网风控规则拒绝", false ),
	localBlack( "本地黑名单", "localBlackRefuse", "本地黑名单风控规则拒绝", true ),
	bairong( "百融", "bairongRefuse", "百融风控规则拒绝", false ),
	;
	
	/**
	 * 编码说明
	 */
	private String desc;
	
	/**
	 * 拒绝编码
	 */
	private String refuseCode;
	
	/**
	 * 拒绝说明
	 */
	private String refuseDesc;
	
	/**
	 * 是否本地黑名单
	 */
	private boolean isInnerBlackList;
	
	private PolicyEnum( String desc, String refuseCode, String refuseDesc, boolean isInnerBlackList ){
		this.desc = desc;
		this.refuseCode = refuseCode;
		this.refuseDesc = refuseDesc;
		this.isInnerBlackList = isInnerBlackList;
	}
	
	/**
	 * 根据拒绝原因编码获取对应枚举对象
	 * @param name
	 */
	public static PolicyEnum getEnumByRefuseCode( String refuseCode ){
		
		PolicyEnum target = null;
		
		PolicyEnum[] policyEnums = PolicyEnum.values();
		for( PolicyEnum policyEnum : policyEnums ){
			if( policyEnum.getRefuseCode().equals( refuseCode ) ) {
				target = policyEnum;
				break;
			}
		}
		return target;
	}
	
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getRefuseCode() {
		return refuseCode;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}

	public String getRefuseDesc() {
		return refuseDesc;
	}

	public void setRefuseDesc(String refuseDesc) {
		this.refuseDesc = refuseDesc;
	}

	public boolean isInnerBlackList() {
		return isInnerBlackList;
	}

	public void setInnerBlackList(boolean isInnerBlackList) {
		this.isInnerBlackList = isInnerBlackList;
	}
}
