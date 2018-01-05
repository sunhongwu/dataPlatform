package com.service.svc.pcApplyLoan;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
import com.service.platform.filter.annotation.FieldValidation;

/**
 * 联系人信息
 * @author linyang
 * @since 2017.12.21
 */
public class ContactInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 *联系人关系
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "CONTACT_RELATION" )
	private String contactRelation;

	/**
	 *联系人中文姓名
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "CONTACT_NAME" )
	private String contactName;
	
	/**
	 *联系人移动电话
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "CONTACT_MOBILE" )
	private String contactMobile;

	public String getContactRelation() {
		return contactRelation;
	}

	public void setContactRelation(String contactRelation) {
		this.contactRelation = contactRelation;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactMobile() {
		return contactMobile;
	}

	public void setContactMobile(String contactMobile) {
		this.contactMobile = contactMobile;
	}
}
