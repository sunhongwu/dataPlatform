package com.service.param.def;


/**
 * 消息类型
*  @author linyang
 * @since 2017.12.14
 *
 */
public enum MsgType {

	/**
	 * 状态同步
	 */
	S("状态同步"),
	/**
	 * 站内信通知
	 */
	M("站内信通知"),
	/**
	 * 任务推送
	 */
	T("任务推送");
	
	private String displayName;
	
	private MsgType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	
}
