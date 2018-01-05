package com.service.param.def;

/**
 * 订单操作类型
 * @author linyang
 * @since 2018.01.04
 */
public enum AppAction {
	/**
	 *	保存
	 */
	S( "保存" ),
	/**
	 *	提交
	 */
	N( "提交" ),
	/**
	 *	拒绝
	 */
	R( "拒绝" );

	/** 中文描述 */
	private String desc;

	AppAction( String desc ) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}