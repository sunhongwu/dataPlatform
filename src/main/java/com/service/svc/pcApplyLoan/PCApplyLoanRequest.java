package com.service.svc.pcApplyLoan;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.service.platform.filter.annotation.FieldValidation;
import com.service.platform.filter.annotation.FormValidation;
import com.service.platform.util.beanUtils.BeanUtils;
import com.service.platform.util.beanUtils.ValueTransHelper;

/**
 * 美易车PC端进件接口请求参数报文
 * @author linyang
 * @since 2017.12.21
 */
public class PCApplyLoanRequest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/**
	 * 申请单编号
	 */
	@FieldValidation( length = 20, required = true )
	@SerializedName( value = "APP_NO" )
	private String appNo;

	/**
	 * 统一客户号
	 */
	@FieldValidation( length = 50, required = true )
	@SerializedName( value = "UNIQUE_ID" )
	private String uniqueId;
	
	/**
	 * 产品
	 */
	@FieldValidation( length = 50, required = true )
	@SerializedName( value = "PRODUCT_CD" )
	private String productCd;
	
	/**
	 * 服务网点编号
	 */
	@FieldValidation( length = 20, required = true )
	@SerializedName( value = "STORE_NO" )
	private String storeNo;
	
	/**
	 * 进件节点
	 */
	@FieldValidation( length = 1, required = true )
	@SerializedName( value = "APP_NODE" )
	private String appNode;
	/**
	 * 操作类型
	 */
	@FieldValidation( length = 10, required = true )
	@SerializedName( value = "APP_ACTION" )
	private String appAction;
	/**
	 * 申请贷款金额
	 * 原:申请贷款金额
	 */
	@SerializedName( value = "APPLY_LOAN_AMOUNT" )
	private BigDecimal applyLoanAmount;
	
	/**
	 * 借款期限
	 */
	@FieldValidation( length = 3, required = false )
	@SerializedName( value = "LOAN_TERM" )
	@BeanUtils.BeanCopySettings( asTransName = "longTerm", transMethod = ValueTransHelper.string2Integer_method )
	private String loanTerm;
	
	/**
	 * 住房状况
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "HOUSE_CONDITION" )
	private String houseCondition;
	/**
	 * 婚姻状况
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "MARITAL_STATUS" )
	private String maritalStatus;

	/**
	 * 申请人姓名
	 */
	@FieldValidation( length = 80, required = true )
	@SerializedName( value = "APP_NAME" )
	@BeanUtils.BeanCopySettings( asTransName = "name" )
	private String appName;
	
	/**
	 *性别
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "GENDER" )
	private String gender;
	
	/**
	 * 身份证号码 
	 */
	@FieldValidation( length = 30, required = true )
	@SerializedName( value = "PERSONAL_ID" )
	private String personalId;
	
	/**
	 * 最高学历
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "EDUCATION" )
	@BeanUtils.BeanCopySettings( asTransName = "qualification" )
	private String education;
	
	/**
	 * 是否有驾照
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "DRIVER_LISCENCE" )
	private String driverLiscence;
	
	
	/**
	 * 户籍省CODE
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "RESIDENCE_STATE" )
	@BeanUtils.BeanCopySettings( asTransName = "residenceProvince" )
	private String residenceState;
	
	/**
	 * 户籍省CITY
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "RESIDENCE_CITY" )
	private String residenceCity;
	
	/**
	 * 户籍区ZONE
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "RESIDENCE_ZONE" )
	private String residenceZone;
	
	/**
	 * 户籍所在地详细地址
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "RESIDENCE_ADDRESS" )
	@BeanUtils.BeanCopySettings( asTransName = "residenceAddr" )
	private String residenceAddress;
	
	/**
	 * 手机号
	 */
	@FieldValidation( length = 30, required = false )
	@SerializedName( value = "MOBILE" )
	@BeanUtils.BeanCopySettings( asTransName = "cellphone" )
	private String mobile;
	/**
	 * 电子邮箱
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "EMAIL" )
	private String email;
	
	/**
	 * 微信
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "WECHAT_NBR" )
	private String wechatNbr;
	

	/**
	 * 居住地址（省code）
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "ABODE_STATE" )
	@BeanUtils.BeanCopySettings( asTransName = "abodeProvince" )
	private String abodeState;
	
	/**
	 * 居住地址（市code）
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "ABODE_CITY" )
	private String abodeCity;
	
	/**
	 * 居住地址（区/县）
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "ABODE_ZONE" )
	@BeanUtils.BeanCopySettings( asTransName = "abodeArea" )
	private String abodeZone;
	
	/**
	 * 详细地址
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "ABODE_DETAIL" )
	@BeanUtils.BeanCopySettings( asTransName = "abodeAddr" )
	private String abodeDetail;
	
	/**
	 * 贷款产品类型
	 * 原:申请付款方式
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "APPLY_LOAN_WAY" )
	private String applyLoanWay;
	
	/**
	 * 学校名称/工作单位
	 */
	@FieldValidation( length = 64, required = false )
	@SerializedName( value = "UNIT_NAME" )
	private String unitName;


	/**
	 * 单位性质
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "EMP_STRUCTURE" )
	private String empStructure;
	

	/**
	 * 任职部门
	 */
	@FieldValidation( length = 32, required = false )
	@SerializedName( value = "EMP_DEPAPMENT" )
	@BeanUtils.BeanCopySettings( asTransName = "empDepartment" )
	private String empDepartment;
	
	/**
	 * 职务
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "EMP_POST" )
	private String empPost;
	
	/**
	 *入学时间/入职日期
	 */
	@FieldValidation( length = 8, required = false )
	@SerializedName( value = "EMP_STAND_FROM" )
	private String empStandFrom;
	
	/**
	 * 行业类别
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "EMP_TYPE" )
	private String empType;
	
	/**
	 *单位电话
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "EMP_PHONE" )
	private String empPhone;
	/**
	 *单位所在省
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "EMP_PROVINCE" )
	private String empProvince;
	
	
	/**
	 *单位所在市
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "EMP_CITY" )
	private String empCity;
	
	/**
	 *单位所在区/县
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "EMP_ZONE" )
	@BeanUtils.BeanCopySettings( asTransName = "empArea" )
	private String empZone;
	
	/**
	 *单位地址（详细地址）
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "EMP_ADD" )
	@BeanUtils.BeanCopySettings( asTransName = "empAddr" )
	private String empAdd;
	
	/**
	 *月收入
	 */
	@SerializedName( value = "MONTHLY_SALARY" )
	private BigDecimal monthlySalary;
	
	/**
	 *供养人数
	 */
	@FieldValidation( length = 3, required = false )
	@SerializedName( value = "SUPPORT_PEOPLE" )
	private String supportPeople;

	/**
	 *其它贷款名称
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "OTHER_LOAN_NAME" )
	private String otherLoanName;
	
	/**
	 *其它贷款金额
	 */
	@SerializedName( value = "MONTHLY_OTHER_LOAN_PAYMENT" )
	private BigDecimal monthlyOtherLoanPayment;
	
	/**
	 *月供
	 */
	@SerializedName( value = "MONTHLY_PAYMENT" )
	private BigDecimal monthlyPayment;
	
	/**
	 * 申请人配偶姓名
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "MATE_NAME" )
	private String mateName;
	
	/**
	 * 申请人配偶身份证号码 
	 */
	@FieldValidation( length = 30, required = false )
	@SerializedName( value = "MATE_PERSONAL_ID" )
	@BeanUtils.BeanCopySettings( asTransName = "idNo" )
	private String matePersonalId;
	
	/**
	 * 配偶手机号码
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "MATE_MOBILE" )
	private String mateMobile;
	
	/**
	 *配偶月收入
	 */
	@SerializedName( value = "MATE_MONTHLY_SALARY" )
	private BigDecimal mateMonthlySalary;
	
	/**
	 * 配偶工作单位所在省
	 */
	@SerializedName( value = "MATE_EMP_PROVINCE" )
	private String mateEmpProvince;
	
	/**
	 * 配偶工作单位所在市
	 */
	@SerializedName( value = "MATE_EMP_CITY" )
	private String mateEmpCity;
	
	/**
	 * 配偶工作单位所在区
	 */
	@SerializedName( value = "MATE_EMP_ZONE" )
	private String mateEmpZone;
	
	/**
	 * 配偶工作地址
	 */
	@SerializedName( value = "MATE_EMP_ADD" )
	private String mateEmpAdd;
	
	/**
	 * 配偶工作单位
	 */
	@SerializedName( value = "CONTACT_WORKNAME" )
	private String contactWorkname;
	
	/**
	 * 配偶所在部门
	 */
	@SerializedName( value = "CONTACT_EMP_DEPARTMENT" )
	private String contactEmpDepartment;
	
	/**
	 * 配偶单位职务
	 */
	@SerializedName( value = "CONTACT_EMP_POST" )
	private String contactEmpPost;
	
	/**
	 *是否有共借人
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "HAVE_COBORROWER" )
	private String haveCoborrower;
	
	/**
	 *共借人姓名
	 */
	@FieldValidation( length = 80, required = false )
	@SerializedName( value = "COBORROWER_NAME" )
	private String coborrowerName;
	
	/**
	 *共借人身份证号码
	 */
	@FieldValidation( length = 30, required = false )
	@SerializedName( value = "COBORROWER_PER_ID" )
	private String coborrowerPerId;
	
	/**
	 *共借人联系电话
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "COBORROWER_MOBILE" )
	private String coborrowerMobile;
	
	/**
	 * 共借人所住地
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "COBORROWER_ADDRESS" )
	private String coborrowerAddress;
	
	/**
	 * 共借人工作单位名称
	 */
	@FieldValidation( length = 64, required = false )
	@SerializedName( value = "COBORROWER_UNIT_NAME" )
	private String coborrowerUnitName;
	
	/**
	 * 共借人任职部门
	 */
	@FieldValidation( length = 50, required = false )
	@SerializedName( value = "COBORROWER_EMP_DEPARTMENT" )
	private String coborrowerEmpDepartment;

	/**
	 * 共借人职位
	 */
	@FieldValidation( length = 50, required = false )
	@SerializedName( value = "COBORROWER_EMP_POST" )
	private String coborrowerEmpPost;

	/**
	 * 联系人list
	 */
	@FormValidation
	@SerializedName( value = "CONTACT_LIST" )
	private List<ContactInfo> contactList;

	/**
	 * 制作商
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_COMPANY" )
	private String vehicleCompany;
	
	/**
	 * 车系
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_BRAND" )
	private String vehicleBrand;
	
	/**
	 * 车辆型号
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_MODEL" )
	private String vehicleModel;
	
	/**
	 * 购车用途
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "CAR_USE" )
	private String carUse;
	
	/**
	 * 车辆类型
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "VEHICLE_TYPE" )
	private String vehicleType;
	
	/**
	 * 原车主
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "VEHICLE_OLD_MASTER" )
	private String vehicleOldMaster;
	
	/**
	 * 制作商CODE
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_COMPANY_CODE" )
	private String vehicleCompanyCode;
	
	/**
	 * 车系CODE
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_BRAND_CODE" )
	private String vehicleBrandCode;
	
	/**
	 * 车辆型号CODE
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "VEHICLE_MODEL_CODE" )
	private String vehicleModelCode;
	
	/**
	 * 车牌号码
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "PLATE_NBR" )
	private String plateNbr;
	
	/**
	 * 过户次数
	 */
	@FieldValidation( length = 40, required = false )
	@SerializedName( value = "TRANSFER_TIMES" )
	private String transferTimes;
	
	/**
	 * 车架号
	 */
	@FieldValidation( length = 30, required = false )
	@SerializedName( value = "VIN_NO" )
	private String vinNo;
	
	/**
	 * 发动机号
	 */
	@FieldValidation( length = 30, required = false )
	@SerializedName( value = "ENGINE_NO" )
	private String engineNo;
	
	

	/**
	 * 行驶里程
	 */
	@SerializedName( value = "VEHICLE_USAGE" )
	private BigDecimal vehicleUsage;
	
	/**
	 * 登记时间
	 */
	@FieldValidation( length = 8, required = false )
	@SerializedName( value = "FIRST_BUY_TIME" )
	private String firstBuyTime;
	
	/**
	 * 放款/还款卡号
	 */
	@FieldValidation( length = 32, required = false )
	@SerializedName( value = "BANK_CARD_NBR" )
	private String bankCardNbr;
	
	/**
	 * 银行卡开户人 名称
	 */
	@FieldValidation( length = 32, required = false )
	@SerializedName( value = "BANK_CARD_NAME" )
	private String bankCardName;
	
	/**
	 * 开户行code
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "BANK_CODE" )
	private String bankCode;
	
	/**
	 * 开户行名称
	 */
	@FieldValidation( length = 32, required = false )
	@SerializedName( value = "BANK_NAME" )
	private String bankName;
	
	/**
	 * 交易流水号
	 */
	@SerializedName( value = "SERVICESN" )
	private String serviceSn;

	/**
	 * 保险金额
	 */
	@FieldValidation( length = 50, required = false )
	@SerializedName( value = "INSURANCE_AMOUNT" )
	@BeanUtils.BeanCopySettings( transMethod = ValueTransHelper.string2Bigdecimal_method)
	private String insuranceAmount;
	
	
	/**
	 * 是否选择保险
	 */
	@FieldValidation( length = 1, required = false )
	@SerializedName( value = "IS_INSURANCE" )
	private String isInsurance;
	
	/**
	 * GPS金额
	 */
	@SerializedName( value = "GPS_AMOUNT" )
	private BigDecimal gpsAmount;
	
	/**
	 * 经销商联系人
	 */
	@FieldValidation( length = 80, required = true )
	@SerializedName( value = "DEALER_NAME" )
	@BeanUtils.BeanCopySettings( asTransName = "dealerClerkName" )
	private String dealerName;
	
	
	
	/**
	 * 经销商公司ID
	 */
	@FieldValidation( length = 40, required = true )
	@SerializedName( value = "DEALER_COMPANY_ID" )
	private String dealerCompanyId;
	
	/**
	 * 经销商公司名称
	 */
	@FieldValidation( length = 80, required = true )
	@SerializedName( value = "DEALER_COMPANY_NAME" )
	private String dealerCompanyName;
	
	/**
	 * 经销商联系电话
	 */
	@FieldValidation( length = 20, required = true )
	@SerializedName( value = "DEALER_MOBILE" )
	private String dealerMobile;
	
	/**
	 * 经销商放款/还款卡号
	 */
	@FieldValidation( length = 32, required = true )
	@SerializedName( value = "DEALER_BANK_CARD_NBR" )
	private String dealerBankCardNbr;
	
	/**
	 * 经销商银行卡开户人 名称
	 */
	@FieldValidation( length = 32, required = true )
	@SerializedName( value = "DEALER_BANK_CARD_NAME" )
	private String dealerBankCardName;
	
	/**
	 * 经销商开户行code
	 */
	@FieldValidation( length = 30, required = true )
	@SerializedName( value = "DEALER_BANK_CODE" )
	private String dealerBankCode;
	
	/**
	 * 经销商开户行联行号
	 */
	@FieldValidation( length = 200, required = false )
	@SerializedName( value = "DEALER_ASSOCIATED_NO" )
	private String dealerAssociatedNo;
	
	/**
	 * 是否绑卡鉴权
	 */
	@FieldValidation( length = 1, required = true )
	@SerializedName( value = "IS_BINDING_CARD" )
	private String isBindingCard;
	
	
	/**
	 * GPS数量
	 */
	@SerializedName( value = "GPS_COUNT" )
	private int gpsCount;

	/**
	 * 车辆品牌
	 */
	@FieldValidation( length = 80, required = true )
	@SerializedName( value = "VEHICLE_OTHER_BRAND" )
	private String vehicleOtherBrand;
	
	/**
	 * 平台服务费分期方式
	 */
	@FieldValidation( length = 10, required = false )
	@SerializedName( value = "SERVICE_FEE_TYPE" )
	private String serviceFeeType;
	
	/**
	 * 月利率
	 */
	@SerializedName( value = "MONTHLY_FEE_RATE" )
	private BigDecimal monthlyFeeRate;
	
	/**
	 * 机构简称
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "ORG_ABBREVIATION" )
	private String orgAbbreviation;
	
	/**
	 * 车辆配置
	 */
	@FieldValidation( length = 20, required = false )
	@SerializedName( value = "VEHICLE_LEVEL" )
	private String vehicleLevel;
	
	/**
	 * 申请首付比例
	 */
	@SerializedName( value = "APPLY_DOWN_PAYMENT_PERCENTAGE" )
	private BigDecimal applyDownPaymentPercentage;
	
	/**
	 * 申请车辆价格
	 */
	@SerializedName( value = "APPLY_CAR_LOAN" )
	private BigDecimal applyCarLoan;
	
	/**
	 * 共借人工作地址（省）
	 */
	@SerializedName( value = "COBORROWER_EMP_PROVINCE" )
	private String coborrowerEmpProvince;
	
	/**
	 * 共借人工作地址（市）
	 */
	@SerializedName( value = "COBORROWER_EMP_CITY" )
	private String coborrowerEmpCity;
	
	/**
	 * 共借人工作地址（区）
	 */
	@SerializedName( value = "COBORROWER_EMP_ZONE" )
	@BeanUtils.BeanCopySettings( asTransName = "coborrowerEmpArea" )
	private String coborrowerEmpZone;
	
	/**
	 * 共借人工作地址
	 */
	@SerializedName( value = "COBORROWER_EMP_ADD" )
	@BeanUtils.BeanCopySettings( asTransName = "coborrowerEmpAddr" )
	private String coborrowerEmpAdd;
	
	/**
	 * 抵押城市
	 */
	@SerializedName( value = "MORTGAGE_CITY" )
	private String mortgageCity;
	
	/**
	 * 进件模式
	 */
	@SerializedName( value = "INCOME_MODEL" )
	private String incomeModel;
	
	/**
	 * 管理费费率
	 */
	@SerializedName( value = "MANAGEMENT_FEE_RATE" )
	private BigDecimal managementFeeRate;
	
	/**
	 * 子产品编号
	 */
	@SerializedName( value = "LOAN_FEE_DEF_ID" )
	private String loanFeeDefId;
	
	/**
	 * 申请管理费
	 */
	@SerializedName( value = "APPLY_MANAGEMENT_FEE" )
	private BigDecimal applyManagementFee;
	
	/**
	 * 经销商开户行所在省
	 */
	@SerializedName( value = "DEALER_BANK_STATE" )
    private String dealerBankProvince;
	
	/**
	 * 经销商开户行所在市
	 */
	@SerializedName( value = "DEALER_BANK_CITY" )
    private String dealerBankCity;
	
	/**
	 * 经销商开户行支行
	 */
	@SerializedName( value = "DEALER_BANK_BRANCH" )
    private String dealerBankBranch;
	
	/**
	 * 进件类型
	 */
	@SerializedName( value = "INCOME_TYPE" )
	private String incomeType;
	
	/**
	 * 是否有购置税
	 */
	@SerializedName( value = "IS_PURCHASE_TAX" )
	private String isPurchaseTax;
	
	/**
	 * 购置税税率
	 */
	@SerializedName( value = "PURCHASE_TAX_RATE" )
	private BigDecimal purchaseTaxRate;
	
	/**
	 * 购置税系数
	 */
//	@SerializedName( value = "PURCHASE_TAX_COEFFICIENT" )
//	private BigDecimal purchaseTaxCoefficient; 
	
	/**
	 * 汽车排量
	 */
	@SerializedName( value = "DISPLACEMENT" )
	private String displacement;
	
	/**
	 * 进件城市名称
	 */
	@SerializedName( value = "STORE_NAME" )
	private String storeName;
	
	/**
	 * 抵押城市名称
	 */
	@SerializedName( value = "MORTGAGE_CITY_NAME" )
	private String mortgageCityName;
	
	/**
	 * 驾驶证档案编号
	 */
	@SerializedName( value = "DRIVING_LICENSE_NO" )
	private String drivingLicenseNo;

	/**
	 * 驾驶证发证省份(明文)
	 */
	@SerializedName( value = "DRIVING_LICENSE_PROVINCE" )
	private String drivingLicenseProvince;
	
	/**
	 * 驾驶证发证城市(明文)
	 */
	@SerializedName( value = "DRIVING_LICENSE_CITY" )
	private String drivingLicenseCity;
	
	/**
	 * 驾照核查结果(明文)
	 */
	@SerializedName( value = "DRIVING_LICENSE_CHECK_RES" )
	private String drivingLicenseCheckRes;
	
	/**
	 * 车辆出厂日期（生产年份）
	 */
	@SerializedName( value = "PRODUCT_YEAR" )
	private String productYear;
	
	/**
	 * 车辆挂靠公司
	 */
	@FieldValidation( length = 200, required = false )
	@SerializedName( value = "AFFILIATED_COMPANY" )
	private String affiliatedCompany;
	
	/**
	 * 是否反贷
	 */
	@FieldValidation( length = 2, required = true )
	@SerializedName( value = "IS_ANTI_LOAN" )
	private String isAntiLoan;
	
	/**
	 * 上牌过户时间
	 */
	@SerializedName( value = "TRANS_LICENSE_TIME" )
	@BeanUtils.BeanCopySettings( transMethod = ValueTransHelper.long2TimeStamp_method )
	private Long transLicenseTime;
	
	/**
	 * 共借人与借款人关系
	 */
	@SerializedName( value = "COBORROWER_RELATION" )
	private String coborrowerRelation;
	
	/**
	 * 借款人所属民族
	 */
	@SerializedName( value = "NATION" )
	private String nation;
	
	/**
	 * 挂靠公司法人代表
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_LEGAL_PERSON" )
    private String affiliatedCompanyLegalPerson;
	
	/**
	 * 挂靠公司联系电话
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_MOBILE" )
    private String affiliatedCompanyMobile;

	/**
	 * 挂靠公司省
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_PROVINCE" )
    private String affiliatedCompanyProvince;
	
	/**
	 * 挂靠公司市
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_CITY" )
    private String affiliatedCompanyCity;
	
	/**
	 * 挂靠公司区
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_AREA" )
    private String affiliatedCompanyArea;
	
	/**
	 * 挂靠公司详细地址
	 */
	@SerializedName( value = "AFFILIATED_COMPANY_ADDR" )
    private String affiliatedCompanyAddr;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getAppNo() {
		return appNo;
	}

	public void setAppNo(String appNo) {
		this.appNo = appNo;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getProductCd() {
		return productCd;
	}

	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public String getAppNode() {
		return appNode;
	}

	public void setAppNode(String appNode) {
		this.appNode = appNode;
	}

	public String getAppAction() {
		return appAction;
	}

	public void setAppAction(String appAction) {
		this.appAction = appAction;
	}

	public BigDecimal getApplyLoanAmount() {
		return applyLoanAmount;
	}

	public void setApplyLoanAmount(BigDecimal applyLoanAmount) {
		this.applyLoanAmount = applyLoanAmount;
	}

	public String getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getHouseCondition() {
		return houseCondition;
	}

	public void setHouseCondition(String houseCondition) {
		this.houseCondition = houseCondition;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDriverLiscence() {
		return driverLiscence;
	}

	public void setDriverLiscence(String driverLiscence) {
		this.driverLiscence = driverLiscence;
	}

	public String getResidenceState() {
		return residenceState;
	}

	public void setResidenceState(String residenceState) {
		this.residenceState = residenceState;
	}

	public String getResidenceCity() {
		return residenceCity;
	}

	public void setResidenceCity(String residenceCity) {
		this.residenceCity = residenceCity;
	}

	public String getResidenceZone() {
		return residenceZone;
	}

	public void setResidenceZone(String residenceZone) {
		this.residenceZone = residenceZone;
	}

	public String getResidenceAddress() {
		return residenceAddress;
	}

	public void setResidenceAddress(String residenceAddress) {
		this.residenceAddress = residenceAddress;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWechatNbr() {
		return wechatNbr;
	}

	public void setWechatNbr(String wechatNbr) {
		this.wechatNbr = wechatNbr;
	}

	public String getAbodeState() {
		return abodeState;
	}

	public void setAbodeState(String abodeState) {
		this.abodeState = abodeState;
	}

	public String getAbodeCity() {
		return abodeCity;
	}

	public void setAbodeCity(String abodeCity) {
		this.abodeCity = abodeCity;
	}

	public String getAbodeZone() {
		return abodeZone;
	}

	public void setAbodeZone(String abodeZone) {
		this.abodeZone = abodeZone;
	}

	public String getAbodeDetail() {
		return abodeDetail;
	}

	public void setAbodeDetail(String abodeDetail) {
		this.abodeDetail = abodeDetail;
	}

	public String getApplyLoanWay() {
		return applyLoanWay;
	}

	public void setApplyLoanWay(String applyLoanWay) {
		this.applyLoanWay = applyLoanWay;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getEmpStructure() {
		return empStructure;
	}

	public void setEmpStructure(String empStructure) {
		this.empStructure = empStructure;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpPost() {
		return empPost;
	}

	public void setEmpPost(String empPost) {
		this.empPost = empPost;
	}

	public String getEmpStandFrom() {
		return empStandFrom;
	}

	public void setEmpStandFrom(String empStandFrom) {
		this.empStandFrom = empStandFrom;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpProvince() {
		return empProvince;
	}

	public void setEmpProvince(String empProvince) {
		this.empProvince = empProvince;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpZone() {
		return empZone;
	}

	public void setEmpZone(String empZone) {
		this.empZone = empZone;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public BigDecimal getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(BigDecimal monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getSupportPeople() {
		return supportPeople;
	}

	public void setSupportPeople(String supportPeople) {
		this.supportPeople = supportPeople;
	}

	public String getOtherLoanName() {
		return otherLoanName;
	}

	public void setOtherLoanName(String otherLoanName) {
		this.otherLoanName = otherLoanName;
	}

	public BigDecimal getMonthlyOtherLoanPayment() {
		return monthlyOtherLoanPayment;
	}

	public void setMonthlyOtherLoanPayment(BigDecimal monthlyOtherLoanPayment) {
		this.monthlyOtherLoanPayment = monthlyOtherLoanPayment;
	}

	public BigDecimal getMonthlyPayment() {
		return monthlyPayment;
	}

	public void setMonthlyPayment(BigDecimal monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}

	public String getMateName() {
		return mateName;
	}

	public void setMateName(String mateName) {
		this.mateName = mateName;
	}

	public String getMatePersonalId() {
		return matePersonalId;
	}

	public void setMatePersonalId(String matePersonalId) {
		this.matePersonalId = matePersonalId;
	}

	public String getMateMobile() {
		return mateMobile;
	}

	public void setMateMobile(String mateMobile) {
		this.mateMobile = mateMobile;
	}

	public BigDecimal getMateMonthlySalary() {
		return mateMonthlySalary;
	}

	public void setMateMonthlySalary(BigDecimal mateMonthlySalary) {
		this.mateMonthlySalary = mateMonthlySalary;
	}

	public String getMateEmpProvince() {
		return mateEmpProvince;
	}

	public void setMateEmpProvince(String mateEmpProvince) {
		this.mateEmpProvince = mateEmpProvince;
	}

	public String getMateEmpCity() {
		return mateEmpCity;
	}

	public void setMateEmpCity(String mateEmpCity) {
		this.mateEmpCity = mateEmpCity;
	}

	public String getMateEmpZone() {
		return mateEmpZone;
	}

	public void setMateEmpZone(String mateEmpZone) {
		this.mateEmpZone = mateEmpZone;
	}

	public String getMateEmpAdd() {
		return mateEmpAdd;
	}

	public void setMateEmpAdd(String mateEmpAdd) {
		this.mateEmpAdd = mateEmpAdd;
	}

	public String getContactWorkname() {
		return contactWorkname;
	}

	public void setContactWorkname(String contactWorkname) {
		this.contactWorkname = contactWorkname;
	}

	public String getContactEmpDepartment() {
		return contactEmpDepartment;
	}

	public void setContactEmpDepartment(String contactEmpDepartment) {
		this.contactEmpDepartment = contactEmpDepartment;
	}

	public String getContactEmpPost() {
		return contactEmpPost;
	}

	public void setContactEmpPost(String contactEmpPost) {
		this.contactEmpPost = contactEmpPost;
	}

	public String getHaveCoborrower() {
		return haveCoborrower;
	}

	public void setHaveCoborrower(String haveCoborrower) {
		this.haveCoborrower = haveCoborrower;
	}

	public String getCoborrowerName() {
		return coborrowerName;
	}

	public void setCoborrowerName(String coborrowerName) {
		this.coborrowerName = coborrowerName;
	}

	public String getCoborrowerPerId() {
		return coborrowerPerId;
	}

	public void setCoborrowerPerId(String coborrowerPerId) {
		this.coborrowerPerId = coborrowerPerId;
	}

	public String getCoborrowerMobile() {
		return coborrowerMobile;
	}

	public void setCoborrowerMobile(String coborrowerMobile) {
		this.coborrowerMobile = coborrowerMobile;
	}

	public String getCoborrowerAddress() {
		return coborrowerAddress;
	}

	public void setCoborrowerAddress(String coborrowerAddress) {
		this.coborrowerAddress = coborrowerAddress;
	}

	public String getCoborrowerUnitName() {
		return coborrowerUnitName;
	}

	public void setCoborrowerUnitName(String coborrowerUnitName) {
		this.coborrowerUnitName = coborrowerUnitName;
	}

	public String getCoborrowerEmpDepartment() {
		return coborrowerEmpDepartment;
	}

	public void setCoborrowerEmpDepartment(String coborrowerEmpDepartment) {
		this.coborrowerEmpDepartment = coborrowerEmpDepartment;
	}

	public String getCoborrowerEmpPost() {
		return coborrowerEmpPost;
	}

	public void setCoborrowerEmpPost(String coborrowerEmpPost) {
		this.coborrowerEmpPost = coborrowerEmpPost;
	}

	public List<ContactInfo> getContactList() {
		return contactList;
	}

	public void setContactList(List<ContactInfo> contactList) {
		this.contactList = contactList;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getVehicleBrand() {
		return vehicleBrand;
	}

	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public String getCarUse() {
		return carUse;
	}

	public void setCarUse(String carUse) {
		this.carUse = carUse;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleOldMaster() {
		return vehicleOldMaster;
	}

	public void setVehicleOldMaster(String vehicleOldMaster) {
		this.vehicleOldMaster = vehicleOldMaster;
	}

	public String getVehicleCompanyCode() {
		return vehicleCompanyCode;
	}

	public void setVehicleCompanyCode(String vehicleCompanyCode) {
		this.vehicleCompanyCode = vehicleCompanyCode;
	}

	public String getVehicleBrandCode() {
		return vehicleBrandCode;
	}

	public void setVehicleBrandCode(String vehicleBrandCode) {
		this.vehicleBrandCode = vehicleBrandCode;
	}

	public String getVehicleModelCode() {
		return vehicleModelCode;
	}

	public void setVehicleModelCode(String vehicleModelCode) {
		this.vehicleModelCode = vehicleModelCode;
	}

	public String getPlateNbr() {
		return plateNbr;
	}

	public void setPlateNbr(String plateNbr) {
		this.plateNbr = plateNbr;
	}

	public String getTransferTimes() {
		return transferTimes;
	}

	public void setTransferTimes(String transferTimes) {
		this.transferTimes = transferTimes;
	}

	public String getVinNo() {
		return vinNo;
	}

	public void setVinNo(String vinNo) {
		this.vinNo = vinNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public BigDecimal getVehicleUsage() {
		return vehicleUsage;
	}

	public void setVehicleUsage(BigDecimal vehicleUsage) {
		this.vehicleUsage = vehicleUsage;
	}

	public String getFirstBuyTime() {
		return firstBuyTime;
	}

	public void setFirstBuyTime(String firstBuyTime) {
		this.firstBuyTime = firstBuyTime;
	}

	public String getBankCardNbr() {
		return bankCardNbr;
	}

	public void setBankCardNbr(String bankCardNbr) {
		this.bankCardNbr = bankCardNbr;
	}

	public String getBankCardName() {
		return bankCardName;
	}

	public void setBankCardName(String bankCardName) {
		this.bankCardName = bankCardName;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getServiceSn() {
		return serviceSn;
	}

	public void setServiceSn(String serviceSn) {
		this.serviceSn = serviceSn;
	}

	public String getInsuranceAmount() {
		return insuranceAmount;
	}

	public void setInsuranceAmount(String insuranceAmount) {
		this.insuranceAmount = insuranceAmount;
	}

	public String getIsInsurance() {
		return isInsurance;
	}

	public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

	public BigDecimal getGpsAmount() {
		return gpsAmount;
	}

	public void setGpsAmount(BigDecimal gpsAmount) {
		this.gpsAmount = gpsAmount;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerCompanyId() {
		return dealerCompanyId;
	}

	public void setDealerCompanyId(String dealerCompanyId) {
		this.dealerCompanyId = dealerCompanyId;
	}

	public String getDealerCompanyName() {
		return dealerCompanyName;
	}

	public void setDealerCompanyName(String dealerCompanyName) {
		this.dealerCompanyName = dealerCompanyName;
	}

	public String getDealerMobile() {
		return dealerMobile;
	}

	public void setDealerMobile(String dealerMobile) {
		this.dealerMobile = dealerMobile;
	}

	public String getDealerBankCardNbr() {
		return dealerBankCardNbr;
	}

	public void setDealerBankCardNbr(String dealerBankCardNbr) {
		this.dealerBankCardNbr = dealerBankCardNbr;
	}

	public String getDealerBankCardName() {
		return dealerBankCardName;
	}

	public void setDealerBankCardName(String dealerBankCardName) {
		this.dealerBankCardName = dealerBankCardName;
	}

	public String getDealerBankCode() {
		return dealerBankCode;
	}

	public void setDealerBankCode(String dealerBankCode) {
		this.dealerBankCode = dealerBankCode;
	}

	public String getDealerAssociatedNo() {
		return dealerAssociatedNo;
	}

	public void setDealerAssociatedNo(String dealerAssociatedNo) {
		this.dealerAssociatedNo = dealerAssociatedNo;
	}

	public String getIsBindingCard() {
		return isBindingCard;
	}

	public void setIsBindingCard(String isBindingCard) {
		this.isBindingCard = isBindingCard;
	}

	public int getGpsCount() {
		return gpsCount;
	}

	public void setGpsCount(int gpsCount) {
		this.gpsCount = gpsCount;
	}

	public String getVehicleOtherBrand() {
		return vehicleOtherBrand;
	}

	public void setVehicleOtherBrand(String vehicleOtherBrand) {
		this.vehicleOtherBrand = vehicleOtherBrand;
	}

	public String getServiceFeeType() {
		return serviceFeeType;
	}

	public void setServiceFeeType(String serviceFeeType) {
		this.serviceFeeType = serviceFeeType;
	}

	public BigDecimal getMonthlyFeeRate() {
		return monthlyFeeRate;
	}

	public void setMonthlyFeeRate(BigDecimal monthlyFeeRate) {
		this.monthlyFeeRate = monthlyFeeRate;
	}

	public String getOrgAbbreviation() {
		return orgAbbreviation;
	}

	public void setOrgAbbreviation(String orgAbbreviation) {
		this.orgAbbreviation = orgAbbreviation;
	}

	public String getVehicleLevel() {
		return vehicleLevel;
	}

	public void setVehicleLevel(String vehicleLevel) {
		this.vehicleLevel = vehicleLevel;
	}

	public BigDecimal getApplyDownPaymentPercentage() {
		return applyDownPaymentPercentage;
	}

	public void setApplyDownPaymentPercentage(BigDecimal applyDownPaymentPercentage) {
		this.applyDownPaymentPercentage = applyDownPaymentPercentage;
	}

	public BigDecimal getApplyCarLoan() {
		return applyCarLoan;
	}

	public void setApplyCarLoan(BigDecimal applyCarLoan) {
		this.applyCarLoan = applyCarLoan;
	}

	public String getCoborrowerEmpProvince() {
		return coborrowerEmpProvince;
	}

	public void setCoborrowerEmpProvince(String coborrowerEmpProvince) {
		this.coborrowerEmpProvince = coborrowerEmpProvince;
	}

	public String getCoborrowerEmpCity() {
		return coborrowerEmpCity;
	}

	public void setCoborrowerEmpCity(String coborrowerEmpCity) {
		this.coborrowerEmpCity = coborrowerEmpCity;
	}

	public String getCoborrowerEmpZone() {
		return coborrowerEmpZone;
	}

	public void setCoborrowerEmpZone(String coborrowerEmpZone) {
		this.coborrowerEmpZone = coborrowerEmpZone;
	}

	public String getCoborrowerEmpAdd() {
		return coborrowerEmpAdd;
	}

	public void setCoborrowerEmpAdd(String coborrowerEmpAdd) {
		this.coborrowerEmpAdd = coborrowerEmpAdd;
	}

	public String getMortgageCity() {
		return mortgageCity;
	}

	public void setMortgageCity(String mortgageCity) {
		this.mortgageCity = mortgageCity;
	}

	public String getIncomeModel() {
		return incomeModel;
	}

	public void setIncomeModel(String incomeModel) {
		this.incomeModel = incomeModel;
	}

	public BigDecimal getManagementFeeRate() {
		return managementFeeRate;
	}

	public void setManagementFeeRate(BigDecimal managementFeeRate) {
		this.managementFeeRate = managementFeeRate;
	}

	public String getLoanFeeDefId() {
		return loanFeeDefId;
	}

	public void setLoanFeeDefId(String loanFeeDefId) {
		this.loanFeeDefId = loanFeeDefId;
	}

	public BigDecimal getApplyManagementFee() {
		return applyManagementFee;
	}

	public void setApplyManagementFee(BigDecimal applyManagementFee) {
		this.applyManagementFee = applyManagementFee;
	}

	public String getDealerBankProvince() {
		return dealerBankProvince;
	}

	public void setDealerBankProvince(String dealerBankProvince) {
		this.dealerBankProvince = dealerBankProvince;
	}

	public String getDealerBankCity() {
		return dealerBankCity;
	}

	public void setDealerBankCity(String dealerBankCity) {
		this.dealerBankCity = dealerBankCity;
	}

	public String getDealerBankBranch() {
		return dealerBankBranch;
	}

	public void setDealerBankBranch(String dealerBankBranch) {
		this.dealerBankBranch = dealerBankBranch;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public String getIsPurchaseTax() {
		return isPurchaseTax;
	}

	public void setIsPurchaseTax(String isPurchaseTax) {
		this.isPurchaseTax = isPurchaseTax;
	}

	public BigDecimal getPurchaseTaxRate() {
		return purchaseTaxRate;
	}

	public void setPurchaseTaxRate(BigDecimal purchaseTaxRate) {
		this.purchaseTaxRate = purchaseTaxRate;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getMortgageCityName() {
		return mortgageCityName;
	}

	public void setMortgageCityName(String mortgageCityName) {
		this.mortgageCityName = mortgageCityName;
	}

	public String getDrivingLicenseNo() {
		return drivingLicenseNo;
	}

	public void setDrivingLicenseNo(String drivingLicenseNo) {
		this.drivingLicenseNo = drivingLicenseNo;
	}

	public String getDrivingLicenseProvince() {
		return drivingLicenseProvince;
	}

	public void setDrivingLicenseProvince(String drivingLicenseProvince) {
		this.drivingLicenseProvince = drivingLicenseProvince;
	}

	public String getDrivingLicenseCity() {
		return drivingLicenseCity;
	}

	public void setDrivingLicenseCity(String drivingLicenseCity) {
		this.drivingLicenseCity = drivingLicenseCity;
	}

	public String getDrivingLicenseCheckRes() {
		return drivingLicenseCheckRes;
	}

	public void setDrivingLicenseCheckRes(String drivingLicenseCheckRes) {
		this.drivingLicenseCheckRes = drivingLicenseCheckRes;
	}

	public String getProductYear() {
		return productYear;
	}

	public void setProductYear(String productYear) {
		this.productYear = productYear;
	}

	public String getAffiliatedCompany() {
		return affiliatedCompany;
	}

	public void setAffiliatedCompany(String affiliatedCompany) {
		this.affiliatedCompany = affiliatedCompany;
	}

	public String getIsAntiLoan() {
		return isAntiLoan;
	}

	public void setIsAntiLoan(String isAntiLoan) {
		this.isAntiLoan = isAntiLoan;
	}

	public Long getTransLicenseTime() {
		return transLicenseTime;
	}

	public void setTransLicenseTime(Long transLicenseTime) {
		this.transLicenseTime = transLicenseTime;
	}

	public String getCoborrowerRelation() {
		return coborrowerRelation;
	}

	public void setCoborrowerRelation(String coborrowerRelation) {
		this.coborrowerRelation = coborrowerRelation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getAffiliatedCompanyLegalPerson() {
		return affiliatedCompanyLegalPerson;
	}

	public void setAffiliatedCompanyLegalPerson(String affiliatedCompanyLegalPerson) {
		this.affiliatedCompanyLegalPerson = affiliatedCompanyLegalPerson;
	}

	public String getAffiliatedCompanyMobile() {
		return affiliatedCompanyMobile;
	}

	public void setAffiliatedCompanyMobile(String affiliatedCompanyMobile) {
		this.affiliatedCompanyMobile = affiliatedCompanyMobile;
	}

	public String getAffiliatedCompanyProvince() {
		return affiliatedCompanyProvince;
	}

	public void setAffiliatedCompanyProvince(String affiliatedCompanyProvince) {
		this.affiliatedCompanyProvince = affiliatedCompanyProvince;
	}

	public String getAffiliatedCompanyCity() {
		return affiliatedCompanyCity;
	}

	public void setAffiliatedCompanyCity(String affiliatedCompanyCity) {
		this.affiliatedCompanyCity = affiliatedCompanyCity;
	}

	public String getAffiliatedCompanyArea() {
		return affiliatedCompanyArea;
	}

	public void setAffiliatedCompanyArea(String affiliatedCompanyArea) {
		this.affiliatedCompanyArea = affiliatedCompanyArea;
	}

	public String getAffiliatedCompanyAddr() {
		return affiliatedCompanyAddr;
	}

	public void setAffiliatedCompanyAddr(String affiliatedCompanyAddr) {
		this.affiliatedCompanyAddr = affiliatedCompanyAddr;
	}
}
