package com.service.param.def;

/**
 * 风控结果
 * @author linyang
 * @since 2017.11.16
 */
public enum PolicyStatus {
	
	/**
	 * 未执行
	 */
	UNDO( "未执行" ),
	
	/**
	 * 通过
	 */
	PASS( "通过" ),
	
	/**
	 * 未通过
	 */
	REJECT( "未通过" )
	;
	
	/**
	 * 编码描述
	 */
	private String desc;
	
	private PolicyStatus( String desc ){
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	/**
	 * 根据编码获取编码描述
	 * @return
	 */
	public static String getDescByCode( String code ){
		String desc = "";
		PolicyStatus[] policyStatuss = PolicyStatus.values();
		for( PolicyStatus policyStatus : policyStatuss ) {
			if( policyStatus.name().toString().equalsIgnoreCase( code ) ) {
				desc = policyStatus.getDesc();
				break;
			}
		}
		return desc;
	}
}
