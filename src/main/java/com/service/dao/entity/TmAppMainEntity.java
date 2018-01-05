package com.service.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/12/26.
 */
@Entity
@Table(name = "tm_app_main", schema = "rmpsdb_che", catalog = "" )
public class TmAppMainEntity {
    private String org;
    private String appNo;
    private String appSerialNo;
    private String uniqueId;
    private String channel;
    private String productCd;
    private String workflowFlag;
    private String appType;
    private BigDecimal appLmt;
    private Integer appLoanTerm;
    private Integer longTerm;
    private BigDecimal accLmt;
    private String contractNo;
    private String rtfState;
    private String proNum;
    private String nodeId;
    private String nodeName;
    private String refuseCode;
    private String refuseDesc;
    private String status;
    private String memo;
    private String remark;
    private Timestamp compTime;
    private Timestamp confirmDate;
    private String cooperatorId;
    private String acqId;
    private String subTerminalType;
    private String saveFlag;
    private String taskDefKey;
    private String taskDefName;
    private String oldCustFlag;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lstUpdTime;
    private String lstUpdUser;
    private int jpaVersion;
    private String ifFraud;
    private BigDecimal feeRate;
    private String trfSuperFlag;
    private BigDecimal feeAmount;
    private BigInteger patchNum;
    private Timestamp clientContractSignTime;
    private String customType;
    private String servicesn;
    private String dealerClerkId;
    private String dealerClerkName;
    private String dealerId;
    private String dealerName;
    private String clerkId;
    private String appNode;
    private String appAction;
    private String storeNo;
    private BigDecimal applyLoanAmount;
    private String dealerCompanyId;
    private BigDecimal downPaymentPercentage;
    private String businessCirclesInfo;
    private String courtDishonesty;
    private String courtExecute;
    private BigDecimal availLoanAmount;
    private String notarization;
    private String dealerMobile;
    private String dealerCompanyName;
    private String appStatus;
    private String debtRatio;
    private String contractStatus;
    private String isFace;
    private String applyLoanWay;
    private BigDecimal insuranceAmount;
    private BigDecimal gpsAmount;
    private String isInsurance;
    private String dealerBankCardNbr;
    private String dealerBankCardName;
    private String dealerBankCode;
    private String dealerAssociatedNo;
    private String isBindingCard;
    private String externalResult;
    private String lstNodeName;
    private String lstNodeId;
    private String serviceFeeType;
    private BigDecimal monthlyFeeRate;
    private String orgAbbreviation;
    private String reason;
    private String returnReason;
    private String isCourtDishonesty;
    private String isCourtExecute;
    private String isBusinessCirclesInfo;
    private BigDecimal applyDownPaymentPercentage;
    private BigDecimal applyFeeAmount;
    private BigDecimal applyInsuranceAmount;
    private BigDecimal applyAccLmt;
    private String acsContractNo;
    private BigDecimal lastMonthlyAmount;
    private BigDecimal monthlyAmount;
    private String incomeModel;
    private String incomeType;
    private BigDecimal managementFeeRate;
    private BigDecimal managementFee;
    private BigDecimal applyManagementFee;
    private String loanFeeDefId;
    private BigDecimal loanAmount;
    private String dealerBankCity;
    private String dealerBankBranch;
    private BigDecimal purchaseTaxRate;
    private String isPurchaseTax;
    private Timestamp commitTime;
    private String leavingMessageTemp;
    private BigDecimal purchaseTax;
    private BigDecimal applyPurchaseTax;
    private BigDecimal accessedValue;
    private String lastFinalCheckNode;
    private Timestamp lastFinalCheckTime;
    private String storeName;
    private BigDecimal maxLoanValue;
    private String mortgageCity;
    private String dealerBankProvince;
    private String affiliatedCompany;
    private String policyRes;
    private String matePolicyRes;
    private String coborrowerPolicyRes;
    private String isAntiLoan;
    private Timestamp transLicenseTime;
    private String affiliatedCompanyLegalPerson;
    private String affiliatedCompanyMobile;
    private String affiliatedCompanyProvince;
    private String affiliatedCompanyCity;
    private String affiliatedCompanyArea;
    private String affiliatedCompanyAddr;

    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Id
    @Column(name = "APP_NO")
    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    @Basic
    @Column(name = "APP_SERIAL_NO")
    public String getAppSerialNo() {
        return appSerialNo;
    }

    public void setAppSerialNo(String appSerialNo) {
        this.appSerialNo = appSerialNo;
    }

    @Basic
    @Column(name = "UNIQUE_ID")
    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Basic
    @Column(name = "CHANNEL")
    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Basic
    @Column(name = "PRODUCT_CD")
    public String getProductCd() {
        return productCd;
    }

    public void setProductCd(String productCd) {
        this.productCd = productCd;
    }

    @Basic
    @Column(name = "WORKFLOW_FLAG")
    public String getWorkflowFlag() {
        return workflowFlag;
    }

    public void setWorkflowFlag(String workflowFlag) {
        this.workflowFlag = workflowFlag;
    }

    @Basic
    @Column(name = "APP_TYPE")
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    @Basic
    @Column(name = "APP_LMT")
    public BigDecimal getAppLmt() {
        return appLmt;
    }

    public void setAppLmt(BigDecimal appLmt) {
        this.appLmt = appLmt;
    }

    @Basic
    @Column(name = "APP_LOAN_TERM")
    public Integer getAppLoanTerm() {
        return appLoanTerm;
    }

    public void setAppLoanTerm(Integer appLoanTerm) {
        this.appLoanTerm = appLoanTerm;
    }

    @Basic
    @Column(name = "LONG_TERM")
    public Integer getLongTerm() {
        return longTerm;
    }

    public void setLongTerm(Integer longTerm) {
        this.longTerm = longTerm;
    }

    @Basic
    @Column(name = "ACC_LMT")
    public BigDecimal getAccLmt() {
        return accLmt;
    }

    public void setAccLmt(BigDecimal accLmt) {
        this.accLmt = accLmt;
    }

    @Basic
    @Column(name = "CONTRACT_NO")
    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    @Basic
    @Column(name = "RTF_STATE")
    public String getRtfState() {
        return rtfState;
    }

    public void setRtfState(String rtfState) {
        this.rtfState = rtfState;
    }

    @Basic
    @Column(name = "PRO_NUM")
    public String getProNum() {
        return proNum;
    }

    public void setProNum(String proNum) {
        this.proNum = proNum;
    }

    @Basic
    @Column(name = "NODE_ID")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "NODE_NAME")
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    @Basic
    @Column(name = "REFUSE_CODE")
    public String getRefuseCode() {
        return refuseCode;
    }

    public void setRefuseCode(String refuseCode) {
        this.refuseCode = refuseCode;
    }

    @Basic
    @Column(name = "REFUSE_DESC")
    public String getRefuseDesc() {
        return refuseDesc;
    }

    public void setRefuseDesc(String refuseDesc) {
        this.refuseDesc = refuseDesc;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "MEMO")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "REMARK")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "COMP_TIME")
    public Timestamp getCompTime() {
        return compTime;
    }

    public void setCompTime(Timestamp compTime) {
        this.compTime = compTime;
    }

    @Basic
    @Column(name = "CONFIRM_DATE")
    public Timestamp getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Timestamp confirmDate) {
        this.confirmDate = confirmDate;
    }

    @Basic
    @Column(name = "COOPERATOR_ID")
    public String getCooperatorId() {
        return cooperatorId;
    }

    public void setCooperatorId(String cooperatorId) {
        this.cooperatorId = cooperatorId;
    }

    @Basic
    @Column(name = "ACQ_ID")
    public String getAcqId() {
        return acqId;
    }

    public void setAcqId(String acqId) {
        this.acqId = acqId;
    }

    @Basic
    @Column(name = "SUB_TERMINAL_TYPE")
    public String getSubTerminalType() {
        return subTerminalType;
    }

    public void setSubTerminalType(String subTerminalType) {
        this.subTerminalType = subTerminalType;
    }

    @Basic
    @Column(name = "SAVE_FLAG")
    public String getSaveFlag() {
        return saveFlag;
    }

    public void setSaveFlag(String saveFlag) {
        this.saveFlag = saveFlag;
    }

    @Basic
    @Column(name = "TASK_DEF_KEY")
    public String getTaskDefKey() {
        return taskDefKey;
    }

    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey;
    }

    @Basic
    @Column(name = "TASK_DEF_NAME")
    public String getTaskDefName() {
        return taskDefName;
    }

    public void setTaskDefName(String taskDefName) {
        this.taskDefName = taskDefName;
    }

    @Basic
    @Column(name = "OLD_CUST_FLAG")
    public String getOldCustFlag() {
        return oldCustFlag;
    }

    public void setOldCustFlag(String oldCustFlag) {
        this.oldCustFlag = oldCustFlag;
    }

    @Basic
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "CREATE_USER")
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    @Basic
    @Column(name = "LST_UPD_TIME")
    public Timestamp getLstUpdTime() {
        return lstUpdTime;
    }

    public void setLstUpdTime(Timestamp lstUpdTime) {
        this.lstUpdTime = lstUpdTime;
    }

    @Basic
    @Column(name = "LST_UPD_USER")
    public String getLstUpdUser() {
        return lstUpdUser;
    }

    public void setLstUpdUser(String lstUpdUser) {
        this.lstUpdUser = lstUpdUser;
    }

    @Basic
    @Column(name = "JPA_VERSION")
    public int getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(int jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    @Basic
    @Column(name = "IF_FRAUD")
    public String getIfFraud() {
        return ifFraud;
    }

    public void setIfFraud(String ifFraud) {
        this.ifFraud = ifFraud;
    }

    @Basic
    @Column(name = "FEE_RATE")
    public BigDecimal getFeeRate() {
        return feeRate;
    }

    public void setFeeRate(BigDecimal feeRate) {
        this.feeRate = feeRate;
    }

    @Basic
    @Column(name = "TRF_SUPER_FLAG")
    public String getTrfSuperFlag() {
        return trfSuperFlag;
    }

    public void setTrfSuperFlag(String trfSuperFlag) {
        this.trfSuperFlag = trfSuperFlag;
    }

    @Basic
    @Column(name = "FEE_AMOUNT")
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    @Basic
    @Column(name = "PATCH_NUM")
    public BigInteger getPatchNum() {
        return patchNum;
    }

    public void setPatchNum(BigInteger patchNum) {
        this.patchNum = patchNum;
    }

    @Basic
    @Column(name = "CLIENT_CONTRACT_SIGN_TIME")
    public Timestamp getClientContractSignTime() {
        return clientContractSignTime;
    }

    public void setClientContractSignTime(Timestamp clientContractSignTime) {
        this.clientContractSignTime = clientContractSignTime;
    }

    @Basic
    @Column(name = "CUSTOM_TYPE")
    public String getCustomType() {
        return customType;
    }

    public void setCustomType(String customType) {
        this.customType = customType;
    }

    @Basic
    @Column(name = "SERVICESN")
    public String getServicesn() {
        return servicesn;
    }

    public void setServicesn(String servicesn) {
        this.servicesn = servicesn;
    }

    @Basic
    @Column(name = "DEALER_CLERK_ID")
    public String getDealerClerkId() {
        return dealerClerkId;
    }

    public void setDealerClerkId(String dealerClerkId) {
        this.dealerClerkId = dealerClerkId;
    }

    @Basic
    @Column(name = "DEALER_CLERK_NAME")
    public String getDealerClerkName() {
        return dealerClerkName;
    }

    public void setDealerClerkName(String dealerClerkName) {
        this.dealerClerkName = dealerClerkName;
    }

    @Basic
    @Column(name = "DEALER_ID")
    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    @Basic
    @Column(name = "DEALER_NAME")
    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    @Basic
    @Column(name = "CLERK_ID")
    public String getClerkId() {
        return clerkId;
    }

    public void setClerkId(String clerkId) {
        this.clerkId = clerkId;
    }

    @Basic
    @Column(name = "APP_NODE")
    public String getAppNode() {
        return appNode;
    }

    public void setAppNode(String appNode) {
        this.appNode = appNode;
    }

    @Basic
    @Column(name = "APP_ACTION")
    public String getAppAction() {
        return appAction;
    }

    public void setAppAction(String appAction) {
        this.appAction = appAction;
    }

    @Basic
    @Column(name = "STORE_NO")
    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    @Basic
    @Column(name = "APPLY_LOAN_AMOUNT")
    public BigDecimal getApplyLoanAmount() {
        return applyLoanAmount;
    }

    public void setApplyLoanAmount(BigDecimal applyLoanAmount) {
        this.applyLoanAmount = applyLoanAmount;
    }

    @Basic
    @Column(name = "DEALER_COMPANY_ID")
    public String getDealerCompanyId() {
        return dealerCompanyId;
    }

    public void setDealerCompanyId(String dealerCompanyId) {
        this.dealerCompanyId = dealerCompanyId;
    }

    @Basic
    @Column(name = "DOWN_PAYMENT_PERCENTAGE")
    public BigDecimal getDownPaymentPercentage() {
        return downPaymentPercentage;
    }

    public void setDownPaymentPercentage(BigDecimal downPaymentPercentage) {
        this.downPaymentPercentage = downPaymentPercentage;
    }

    @Basic
    @Column(name = "Business_Circles_Info")
    public String getBusinessCirclesInfo() {
        return businessCirclesInfo;
    }

    public void setBusinessCirclesInfo(String businessCirclesInfo) {
        this.businessCirclesInfo = businessCirclesInfo;
    }

    @Basic
    @Column(name = "Court_Dishonesty")
    public String getCourtDishonesty() {
        return courtDishonesty;
    }

    public void setCourtDishonesty(String courtDishonesty) {
        this.courtDishonesty = courtDishonesty;
    }

    @Basic
    @Column(name = "Court_Execute")
    public String getCourtExecute() {
        return courtExecute;
    }

    public void setCourtExecute(String courtExecute) {
        this.courtExecute = courtExecute;
    }

    @Basic
    @Column(name = "AVAIL_LOAN_AMOUNT")
    public BigDecimal getAvailLoanAmount() {
        return availLoanAmount;
    }

    public void setAvailLoanAmount(BigDecimal availLoanAmount) {
        this.availLoanAmount = availLoanAmount;
    }

    @Basic
    @Column(name = "NOTARIZATION")
    public String getNotarization() {
        return notarization;
    }

    public void setNotarization(String notarization) {
        this.notarization = notarization;
    }

    @Basic
    @Column(name = "DEALER_MOBILE")
    public String getDealerMobile() {
        return dealerMobile;
    }

    public void setDealerMobile(String dealerMobile) {
        this.dealerMobile = dealerMobile;
    }

    @Basic
    @Column(name = "DEALER_COMPANY_NAME")
    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
    }

    @Basic
    @Column(name = "APP_STATUS")
    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    @Basic
    @Column(name = "DEBT_RATIO")
    public String getDebtRatio() {
        return debtRatio;
    }

    public void setDebtRatio(String debtRatio) {
        this.debtRatio = debtRatio;
    }

    @Basic
    @Column(name = "CONTRACT_STATUS")
    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    @Basic
    @Column(name = "IS_FACE")
    public String getIsFace() {
        return isFace;
    }

    public void setIsFace(String isFace) {
        this.isFace = isFace;
    }

    @Basic
    @Column(name = "APPLY_LOAN_WAY")
    public String getApplyLoanWay() {
        return applyLoanWay;
    }

    public void setApplyLoanWay(String applyLoanWay) {
        this.applyLoanWay = applyLoanWay;
    }

    @Basic
    @Column(name = "INSURANCE_AMOUNT")
    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    @Basic
    @Column(name = "GPS_AMOUNT")
    public BigDecimal getGpsAmount() {
        return gpsAmount;
    }

    public void setGpsAmount(BigDecimal gpsAmount) {
        this.gpsAmount = gpsAmount;
    }

    @Basic
    @Column(name = "IS_INSURANCE")
    public String getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(String isInsurance) {
        this.isInsurance = isInsurance;
    }

    @Basic
    @Column(name = "DEALER_BANK_CARD_NBR")
    public String getDealerBankCardNbr() {
        return dealerBankCardNbr;
    }

    public void setDealerBankCardNbr(String dealerBankCardNbr) {
        this.dealerBankCardNbr = dealerBankCardNbr;
    }

    @Basic
    @Column(name = "DEALER_BANK_CARD_NAME")
    public String getDealerBankCardName() {
        return dealerBankCardName;
    }

    public void setDealerBankCardName(String dealerBankCardName) {
        this.dealerBankCardName = dealerBankCardName;
    }

    @Basic
    @Column(name = "DEALER_BANK_CODE")
    public String getDealerBankCode() {
        return dealerBankCode;
    }

    public void setDealerBankCode(String dealerBankCode) {
        this.dealerBankCode = dealerBankCode;
    }

    @Basic
    @Column(name = "DEALER_ASSOCIATED_NO")
    public String getDealerAssociatedNo() {
        return dealerAssociatedNo;
    }

    public void setDealerAssociatedNo(String dealerAssociatedNo) {
        this.dealerAssociatedNo = dealerAssociatedNo;
    }

    @Basic
    @Column(name = "IS_BINDING_CARD")
    public String getIsBindingCard() {
        return isBindingCard;
    }

    public void setIsBindingCard(String isBindingCard) {
        this.isBindingCard = isBindingCard;
    }

    @Basic
    @Column(name = "EXTERNAL_RESULT")
    public String getExternalResult() {
        return externalResult;
    }

    public void setExternalResult(String externalResult) {
        this.externalResult = externalResult;
    }

    @Basic
    @Column(name = "LST_NODE_NAME")
    public String getLstNodeName() {
        return lstNodeName;
    }

    public void setLstNodeName(String lstNodeName) {
        this.lstNodeName = lstNodeName;
    }

    @Basic
    @Column(name = "LST_NODE_ID")
    public String getLstNodeId() {
        return lstNodeId;
    }

    public void setLstNodeId(String lstNodeId) {
        this.lstNodeId = lstNodeId;
    }

    @Basic
    @Column(name = "SERVICE_FEE_TYPE")
    public String getServiceFeeType() {
        return serviceFeeType;
    }

    public void setServiceFeeType(String serviceFeeType) {
        this.serviceFeeType = serviceFeeType;
    }

    @Basic
    @Column(name = "MONTHLY_FEE_RATE")
    public BigDecimal getMonthlyFeeRate() {
        return monthlyFeeRate;
    }

    public void setMonthlyFeeRate(BigDecimal monthlyFeeRate) {
        this.monthlyFeeRate = monthlyFeeRate;
    }

    @Basic
    @Column(name = "ORG_ABBREVIATION")
    public String getOrgAbbreviation() {
        return orgAbbreviation;
    }

    public void setOrgAbbreviation(String orgAbbreviation) {
        this.orgAbbreviation = orgAbbreviation;
    }

    @Basic
    @Column(name = "REASON")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Basic
    @Column(name = "RETURN_REASON")
    public String getReturnReason() {
        return returnReason;
    }

    public void setReturnReason(String returnReason) {
        this.returnReason = returnReason;
    }

    @Basic
    @Column(name = "IS_COURT_DISHONESTY")
    public String getIsCourtDishonesty() {
        return isCourtDishonesty;
    }

    public void setIsCourtDishonesty(String isCourtDishonesty) {
        this.isCourtDishonesty = isCourtDishonesty;
    }

    @Basic
    @Column(name = "IS_COURT_EXECUTE")
    public String getIsCourtExecute() {
        return isCourtExecute;
    }

    public void setIsCourtExecute(String isCourtExecute) {
        this.isCourtExecute = isCourtExecute;
    }

    @Basic
    @Column(name = "IS_BUSINESS_CIRCLES_INFO")
    public String getIsBusinessCirclesInfo() {
        return isBusinessCirclesInfo;
    }

    public void setIsBusinessCirclesInfo(String isBusinessCirclesInfo) {
        this.isBusinessCirclesInfo = isBusinessCirclesInfo;
    }

    @Basic
    @Column(name = "APPLY_DOWN_PAYMENT_PERCENTAGE")
    public BigDecimal getApplyDownPaymentPercentage() {
        return applyDownPaymentPercentage;
    }

    public void setApplyDownPaymentPercentage(BigDecimal applyDownPaymentPercentage) {
        this.applyDownPaymentPercentage = applyDownPaymentPercentage;
    }

    @Basic
    @Column(name = "APPLY_FEE_AMOUNT")
    public BigDecimal getApplyFeeAmount() {
        return applyFeeAmount;
    }

    public void setApplyFeeAmount(BigDecimal applyFeeAmount) {
        this.applyFeeAmount = applyFeeAmount;
    }

    @Basic
    @Column(name = "APPLY_INSURANCE_AMOUNT")
    public BigDecimal getApplyInsuranceAmount() {
        return applyInsuranceAmount;
    }

    public void setApplyInsuranceAmount(BigDecimal applyInsuranceAmount) {
        this.applyInsuranceAmount = applyInsuranceAmount;
    }

    @Basic
    @Column(name = "APPLY_ACC_LMT")
    public BigDecimal getApplyAccLmt() {
        return applyAccLmt;
    }

    public void setApplyAccLmt(BigDecimal applyAccLmt) {
        this.applyAccLmt = applyAccLmt;
    }

    @Basic
    @Column(name = "ACS_CONTRACT_NO")
    public String getAcsContractNo() {
        return acsContractNo;
    }

    public void setAcsContractNo(String acsContractNo) {
        this.acsContractNo = acsContractNo;
    }

    @Basic
    @Column(name = "LAST_MONTHLY_AMOUNT")
    public BigDecimal getLastMonthlyAmount() {
        return lastMonthlyAmount;
    }

    public void setLastMonthlyAmount(BigDecimal lastMonthlyAmount) {
        this.lastMonthlyAmount = lastMonthlyAmount;
    }

    @Basic
    @Column(name = "MONTHLY_AMOUNT")
    public BigDecimal getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(BigDecimal monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    @Basic
    @Column(name = "INCOME_MODEL")
    public String getIncomeModel() {
        return incomeModel;
    }

    public void setIncomeModel(String incomeModel) {
        this.incomeModel = incomeModel;
    }

    @Basic
    @Column(name = "INCOME_TYPE")
    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    @Basic
    @Column(name = "MANAGEMENT_FEE_RATE")
    public BigDecimal getManagementFeeRate() {
        return managementFeeRate;
    }

    public void setManagementFeeRate(BigDecimal managementFeeRate) {
        this.managementFeeRate = managementFeeRate;
    }

    @Basic
    @Column(name = "MANAGEMENT_FEE")
    public BigDecimal getManagementFee() {
        return managementFee;
    }

    public void setManagementFee(BigDecimal managementFee) {
        this.managementFee = managementFee;
    }

    @Basic
    @Column(name = "APPLY_MANAGEMENT_FEE")
    public BigDecimal getApplyManagementFee() {
        return applyManagementFee;
    }

    public void setApplyManagementFee(BigDecimal applyManagementFee) {
        this.applyManagementFee = applyManagementFee;
    }

    @Basic
    @Column(name = "LOAN_FEE_DEF_ID")
    public String getLoanFeeDefId() {
        return loanFeeDefId;
    }

    public void setLoanFeeDefId(String loanFeeDefId) {
        this.loanFeeDefId = loanFeeDefId;
    }

    @Basic
    @Column(name = "LOAN_AMOUNT")
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Basic
    @Column(name = "DEALER_BANK_CITY")
    public String getDealerBankCity() {
        return dealerBankCity;
    }

    public void setDealerBankCity(String dealerBankCity) {
        this.dealerBankCity = dealerBankCity;
    }

    @Basic
    @Column(name = "DEALER_BANK_BRANCH")
    public String getDealerBankBranch() {
        return dealerBankBranch;
    }

    public void setDealerBankBranch(String dealerBankBranch) {
        this.dealerBankBranch = dealerBankBranch;
    }

    @Basic
    @Column(name = "PURCHASE_TAX_RATE")
    public BigDecimal getPurchaseTaxRate() {
        return purchaseTaxRate;
    }

    public void setPurchaseTaxRate(BigDecimal purchaseTaxRate) {
        this.purchaseTaxRate = purchaseTaxRate;
    }

    @Basic
    @Column(name = "IS_PURCHASE_TAX")
    public String getIsPurchaseTax() {
        return isPurchaseTax;
    }

    public void setIsPurchaseTax(String isPurchaseTax) {
        this.isPurchaseTax = isPurchaseTax;
    }

    @Basic
    @Column(name = "COMMIT_TIME")
    public Timestamp getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(Timestamp commitTime) {
        this.commitTime = commitTime;
    }

    @Basic
    @Column(name = "LEAVING_MESSAGE_TEMP")
    public String getLeavingMessageTemp() {
        return leavingMessageTemp;
    }

    public void setLeavingMessageTemp(String leavingMessageTemp) {
        this.leavingMessageTemp = leavingMessageTemp;
    }

    @Basic
    @Column(name = "PURCHASE_TAX")
    public BigDecimal getPurchaseTax() {
        return purchaseTax;
    }

    public void setPurchaseTax(BigDecimal purchaseTax) {
        this.purchaseTax = purchaseTax;
    }

    @Basic
    @Column(name = "APPLY_PURCHASE_TAX")
    public BigDecimal getApplyPurchaseTax() {
        return applyPurchaseTax;
    }

    public void setApplyPurchaseTax(BigDecimal applyPurchaseTax) {
        this.applyPurchaseTax = applyPurchaseTax;
    }

    @Basic
    @Column(name = "ACCESSED_VALUE")
    public BigDecimal getAccessedValue() {
        return accessedValue;
    }

    public void setAccessedValue(BigDecimal accessedValue) {
        this.accessedValue = accessedValue;
    }

    @Basic
    @Column(name = "LAST_FINAL_CHECK_NODE")
    public String getLastFinalCheckNode() {
        return lastFinalCheckNode;
    }

    public void setLastFinalCheckNode(String lastFinalCheckNode) {
        this.lastFinalCheckNode = lastFinalCheckNode;
    }

    @Basic
    @Column(name = "LAST_FINAL_CHECK_TIME")
    public Timestamp getLastFinalCheckTime() {
        return lastFinalCheckTime;
    }

    public void setLastFinalCheckTime(Timestamp lastFinalCheckTime) {
        this.lastFinalCheckTime = lastFinalCheckTime;
    }

    @Basic
    @Column(name = "STORE_NAME")
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    @Basic
    @Column(name = "MAX_LOAN_VALUE")
    public BigDecimal getMaxLoanValue() {
        return maxLoanValue;
    }

    public void setMaxLoanValue(BigDecimal maxLoanValue) {
        this.maxLoanValue = maxLoanValue;
    }

    @Basic
    @Column(name = "MORTGAGE_CITY")
    public String getMortgageCity() {
        return mortgageCity;
    }

    public void setMortgageCity(String mortgageCity) {
        this.mortgageCity = mortgageCity;
    }

    @Basic
    @Column(name = "DEALER_BANK_PROVINCE")
    public String getDealerBankProvince() {
        return dealerBankProvince;
    }

    public void setDealerBankProvince(String dealerBankProvince) {
        this.dealerBankProvince = dealerBankProvince;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY")
    public String getAffiliatedCompany() {
        return affiliatedCompany;
    }

    public void setAffiliatedCompany(String affiliatedCompany) {
        this.affiliatedCompany = affiliatedCompany;
    }

    @Basic
    @Column(name = "POLICY_RES")
    public String getPolicyRes() {
        return policyRes;
    }

    public void setPolicyRes(String policyRes) {
        this.policyRes = policyRes;
    }

    @Basic
    @Column(name = "MATE_POLICY_RES")
    public String getMatePolicyRes() {
        return matePolicyRes;
    }

    public void setMatePolicyRes(String matePolicyRes) {
        this.matePolicyRes = matePolicyRes;
    }

    @Basic
    @Column(name = "COBORROWER_POLICY_RES")
    public String getCoborrowerPolicyRes() {
        return coborrowerPolicyRes;
    }

    public void setCoborrowerPolicyRes(String coborrowerPolicyRes) {
        this.coborrowerPolicyRes = coborrowerPolicyRes;
    }

    @Basic
    @Column(name = "IS_ANTI_LOAN")
    public String getIsAntiLoan() {
        return isAntiLoan;
    }

    public void setIsAntiLoan(String isAntiLoan) {
        this.isAntiLoan = isAntiLoan;
    }

    @Basic
    @Column(name = "TRANS_LICENSE_TIME")
    public Timestamp getTransLicenseTime() {
        return transLicenseTime;
    }

    public void setTransLicenseTime(Timestamp transLicenseTime) {
        this.transLicenseTime = transLicenseTime;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_LEGAL_PERSON")
    public String getAffiliatedCompanyLegalPerson() {
        return affiliatedCompanyLegalPerson;
    }

    public void setAffiliatedCompanyLegalPerson(String affiliatedCompanyLegalPerson) {
        this.affiliatedCompanyLegalPerson = affiliatedCompanyLegalPerson;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_MOBILE")
    public String getAffiliatedCompanyMobile() {
        return affiliatedCompanyMobile;
    }

    public void setAffiliatedCompanyMobile(String affiliatedCompanyMobile) {
        this.affiliatedCompanyMobile = affiliatedCompanyMobile;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_PROVINCE")
    public String getAffiliatedCompanyProvince() {
        return affiliatedCompanyProvince;
    }

    public void setAffiliatedCompanyProvince(String affiliatedCompanyProvince) {
        this.affiliatedCompanyProvince = affiliatedCompanyProvince;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_CITY")
    public String getAffiliatedCompanyCity() {
        return affiliatedCompanyCity;
    }

    public void setAffiliatedCompanyCity(String affiliatedCompanyCity) {
        this.affiliatedCompanyCity = affiliatedCompanyCity;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_AREA")
    public String getAffiliatedCompanyArea() {
        return affiliatedCompanyArea;
    }

    public void setAffiliatedCompanyArea(String affiliatedCompanyArea) {
        this.affiliatedCompanyArea = affiliatedCompanyArea;
    }

    @Basic
    @Column(name = "AFFILIATED_COMPANY_ADDR")
    public String getAffiliatedCompanyAddr() {
        return affiliatedCompanyAddr;
    }

    public void setAffiliatedCompanyAddr(String affiliatedCompanyAddr) {
        this.affiliatedCompanyAddr = affiliatedCompanyAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmAppMainEntity that = (TmAppMainEntity) o;

        if (jpaVersion != that.jpaVersion) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (appSerialNo != null ? !appSerialNo.equals(that.appSerialNo) : that.appSerialNo != null) return false;
        if (uniqueId != null ? !uniqueId.equals(that.uniqueId) : that.uniqueId != null) return false;
        if (channel != null ? !channel.equals(that.channel) : that.channel != null) return false;
        if (productCd != null ? !productCd.equals(that.productCd) : that.productCd != null) return false;
        if (workflowFlag != null ? !workflowFlag.equals(that.workflowFlag) : that.workflowFlag != null) return false;
        if (appType != null ? !appType.equals(that.appType) : that.appType != null) return false;
        if (appLmt != null ? !appLmt.equals(that.appLmt) : that.appLmt != null) return false;
        if (appLoanTerm != null ? !appLoanTerm.equals(that.appLoanTerm) : that.appLoanTerm != null) return false;
        if (longTerm != null ? !longTerm.equals(that.longTerm) : that.longTerm != null) return false;
        if (accLmt != null ? !accLmt.equals(that.accLmt) : that.accLmt != null) return false;
        if (contractNo != null ? !contractNo.equals(that.contractNo) : that.contractNo != null) return false;
        if (rtfState != null ? !rtfState.equals(that.rtfState) : that.rtfState != null) return false;
        if (proNum != null ? !proNum.equals(that.proNum) : that.proNum != null) return false;
        if (nodeId != null ? !nodeId.equals(that.nodeId) : that.nodeId != null) return false;
        if (nodeName != null ? !nodeName.equals(that.nodeName) : that.nodeName != null) return false;
        if (refuseCode != null ? !refuseCode.equals(that.refuseCode) : that.refuseCode != null) return false;
        if (refuseDesc != null ? !refuseDesc.equals(that.refuseDesc) : that.refuseDesc != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (compTime != null ? !compTime.equals(that.compTime) : that.compTime != null) return false;
        if (confirmDate != null ? !confirmDate.equals(that.confirmDate) : that.confirmDate != null) return false;
        if (cooperatorId != null ? !cooperatorId.equals(that.cooperatorId) : that.cooperatorId != null) return false;
        if (acqId != null ? !acqId.equals(that.acqId) : that.acqId != null) return false;
        if (subTerminalType != null ? !subTerminalType.equals(that.subTerminalType) : that.subTerminalType != null)
            return false;
        if (saveFlag != null ? !saveFlag.equals(that.saveFlag) : that.saveFlag != null) return false;
        if (taskDefKey != null ? !taskDefKey.equals(that.taskDefKey) : that.taskDefKey != null) return false;
        if (taskDefName != null ? !taskDefName.equals(that.taskDefName) : that.taskDefName != null) return false;
        if (oldCustFlag != null ? !oldCustFlag.equals(that.oldCustFlag) : that.oldCustFlag != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (lstUpdTime != null ? !lstUpdTime.equals(that.lstUpdTime) : that.lstUpdTime != null) return false;
        if (lstUpdUser != null ? !lstUpdUser.equals(that.lstUpdUser) : that.lstUpdUser != null) return false;
        if (ifFraud != null ? !ifFraud.equals(that.ifFraud) : that.ifFraud != null) return false;
        if (feeRate != null ? !feeRate.equals(that.feeRate) : that.feeRate != null) return false;
        if (trfSuperFlag != null ? !trfSuperFlag.equals(that.trfSuperFlag) : that.trfSuperFlag != null) return false;
        if (feeAmount != null ? !feeAmount.equals(that.feeAmount) : that.feeAmount != null) return false;
        if (patchNum != null ? !patchNum.equals(that.patchNum) : that.patchNum != null) return false;
        if (clientContractSignTime != null ? !clientContractSignTime.equals(that.clientContractSignTime) : that.clientContractSignTime != null)
            return false;
        if (customType != null ? !customType.equals(that.customType) : that.customType != null) return false;
        if (servicesn != null ? !servicesn.equals(that.servicesn) : that.servicesn != null) return false;
        if (dealerClerkId != null ? !dealerClerkId.equals(that.dealerClerkId) : that.dealerClerkId != null)
            return false;
        if (dealerClerkName != null ? !dealerClerkName.equals(that.dealerClerkName) : that.dealerClerkName != null)
            return false;
        if (dealerId != null ? !dealerId.equals(that.dealerId) : that.dealerId != null) return false;
        if (dealerName != null ? !dealerName.equals(that.dealerName) : that.dealerName != null) return false;
        if (clerkId != null ? !clerkId.equals(that.clerkId) : that.clerkId != null) return false;
        if (appNode != null ? !appNode.equals(that.appNode) : that.appNode != null) return false;
        if (appAction != null ? !appAction.equals(that.appAction) : that.appAction != null) return false;
        if (storeNo != null ? !storeNo.equals(that.storeNo) : that.storeNo != null) return false;
        if (applyLoanAmount != null ? !applyLoanAmount.equals(that.applyLoanAmount) : that.applyLoanAmount != null)
            return false;
        if (dealerCompanyId != null ? !dealerCompanyId.equals(that.dealerCompanyId) : that.dealerCompanyId != null)
            return false;
        if (downPaymentPercentage != null ? !downPaymentPercentage.equals(that.downPaymentPercentage) : that.downPaymentPercentage != null)
            return false;
        if (businessCirclesInfo != null ? !businessCirclesInfo.equals(that.businessCirclesInfo) : that.businessCirclesInfo != null)
            return false;
        if (courtDishonesty != null ? !courtDishonesty.equals(that.courtDishonesty) : that.courtDishonesty != null)
            return false;
        if (courtExecute != null ? !courtExecute.equals(that.courtExecute) : that.courtExecute != null) return false;
        if (availLoanAmount != null ? !availLoanAmount.equals(that.availLoanAmount) : that.availLoanAmount != null)
            return false;
        if (notarization != null ? !notarization.equals(that.notarization) : that.notarization != null) return false;
        if (dealerMobile != null ? !dealerMobile.equals(that.dealerMobile) : that.dealerMobile != null) return false;
        if (dealerCompanyName != null ? !dealerCompanyName.equals(that.dealerCompanyName) : that.dealerCompanyName != null)
            return false;
        if (appStatus != null ? !appStatus.equals(that.appStatus) : that.appStatus != null) return false;
        if (debtRatio != null ? !debtRatio.equals(that.debtRatio) : that.debtRatio != null) return false;
        if (contractStatus != null ? !contractStatus.equals(that.contractStatus) : that.contractStatus != null)
            return false;
        if (isFace != null ? !isFace.equals(that.isFace) : that.isFace != null) return false;
        if (applyLoanWay != null ? !applyLoanWay.equals(that.applyLoanWay) : that.applyLoanWay != null) return false;
        if (insuranceAmount != null ? !insuranceAmount.equals(that.insuranceAmount) : that.insuranceAmount != null)
            return false;
        if (gpsAmount != null ? !gpsAmount.equals(that.gpsAmount) : that.gpsAmount != null) return false;
        if (isInsurance != null ? !isInsurance.equals(that.isInsurance) : that.isInsurance != null) return false;
        if (dealerBankCardNbr != null ? !dealerBankCardNbr.equals(that.dealerBankCardNbr) : that.dealerBankCardNbr != null)
            return false;
        if (dealerBankCardName != null ? !dealerBankCardName.equals(that.dealerBankCardName) : that.dealerBankCardName != null)
            return false;
        if (dealerBankCode != null ? !dealerBankCode.equals(that.dealerBankCode) : that.dealerBankCode != null)
            return false;
        if (dealerAssociatedNo != null ? !dealerAssociatedNo.equals(that.dealerAssociatedNo) : that.dealerAssociatedNo != null)
            return false;
        if (isBindingCard != null ? !isBindingCard.equals(that.isBindingCard) : that.isBindingCard != null)
            return false;
        if (externalResult != null ? !externalResult.equals(that.externalResult) : that.externalResult != null)
            return false;
        if (lstNodeName != null ? !lstNodeName.equals(that.lstNodeName) : that.lstNodeName != null) return false;
        if (lstNodeId != null ? !lstNodeId.equals(that.lstNodeId) : that.lstNodeId != null) return false;
        if (serviceFeeType != null ? !serviceFeeType.equals(that.serviceFeeType) : that.serviceFeeType != null)
            return false;
        if (monthlyFeeRate != null ? !monthlyFeeRate.equals(that.monthlyFeeRate) : that.monthlyFeeRate != null)
            return false;
        if (orgAbbreviation != null ? !orgAbbreviation.equals(that.orgAbbreviation) : that.orgAbbreviation != null)
            return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;
        if (returnReason != null ? !returnReason.equals(that.returnReason) : that.returnReason != null) return false;
        if (isCourtDishonesty != null ? !isCourtDishonesty.equals(that.isCourtDishonesty) : that.isCourtDishonesty != null)
            return false;
        if (isCourtExecute != null ? !isCourtExecute.equals(that.isCourtExecute) : that.isCourtExecute != null)
            return false;
        if (isBusinessCirclesInfo != null ? !isBusinessCirclesInfo.equals(that.isBusinessCirclesInfo) : that.isBusinessCirclesInfo != null)
            return false;
        if (applyDownPaymentPercentage != null ? !applyDownPaymentPercentage.equals(that.applyDownPaymentPercentage) : that.applyDownPaymentPercentage != null)
            return false;
        if (applyFeeAmount != null ? !applyFeeAmount.equals(that.applyFeeAmount) : that.applyFeeAmount != null)
            return false;
        if (applyInsuranceAmount != null ? !applyInsuranceAmount.equals(that.applyInsuranceAmount) : that.applyInsuranceAmount != null)
            return false;
        if (applyAccLmt != null ? !applyAccLmt.equals(that.applyAccLmt) : that.applyAccLmt != null) return false;
        if (acsContractNo != null ? !acsContractNo.equals(that.acsContractNo) : that.acsContractNo != null)
            return false;
        if (lastMonthlyAmount != null ? !lastMonthlyAmount.equals(that.lastMonthlyAmount) : that.lastMonthlyAmount != null)
            return false;
        if (monthlyAmount != null ? !monthlyAmount.equals(that.monthlyAmount) : that.monthlyAmount != null)
            return false;
        if (incomeModel != null ? !incomeModel.equals(that.incomeModel) : that.incomeModel != null) return false;
        if (incomeType != null ? !incomeType.equals(that.incomeType) : that.incomeType != null) return false;
        if (managementFeeRate != null ? !managementFeeRate.equals(that.managementFeeRate) : that.managementFeeRate != null)
            return false;
        if (managementFee != null ? !managementFee.equals(that.managementFee) : that.managementFee != null)
            return false;
        if (applyManagementFee != null ? !applyManagementFee.equals(that.applyManagementFee) : that.applyManagementFee != null)
            return false;
        if (loanFeeDefId != null ? !loanFeeDefId.equals(that.loanFeeDefId) : that.loanFeeDefId != null) return false;
        if (loanAmount != null ? !loanAmount.equals(that.loanAmount) : that.loanAmount != null) return false;
        if (dealerBankCity != null ? !dealerBankCity.equals(that.dealerBankCity) : that.dealerBankCity != null)
            return false;
        if (dealerBankBranch != null ? !dealerBankBranch.equals(that.dealerBankBranch) : that.dealerBankBranch != null)
            return false;
        if (purchaseTaxRate != null ? !purchaseTaxRate.equals(that.purchaseTaxRate) : that.purchaseTaxRate != null)
            return false;
        if (isPurchaseTax != null ? !isPurchaseTax.equals(that.isPurchaseTax) : that.isPurchaseTax != null)
            return false;
        if (commitTime != null ? !commitTime.equals(that.commitTime) : that.commitTime != null) return false;
        if (leavingMessageTemp != null ? !leavingMessageTemp.equals(that.leavingMessageTemp) : that.leavingMessageTemp != null)
            return false;
        if (purchaseTax != null ? !purchaseTax.equals(that.purchaseTax) : that.purchaseTax != null) return false;
        if (applyPurchaseTax != null ? !applyPurchaseTax.equals(that.applyPurchaseTax) : that.applyPurchaseTax != null)
            return false;
        if (accessedValue != null ? !accessedValue.equals(that.accessedValue) : that.accessedValue != null)
            return false;
        if (lastFinalCheckNode != null ? !lastFinalCheckNode.equals(that.lastFinalCheckNode) : that.lastFinalCheckNode != null)
            return false;
        if (lastFinalCheckTime != null ? !lastFinalCheckTime.equals(that.lastFinalCheckTime) : that.lastFinalCheckTime != null)
            return false;
        if (storeName != null ? !storeName.equals(that.storeName) : that.storeName != null) return false;
        if (maxLoanValue != null ? !maxLoanValue.equals(that.maxLoanValue) : that.maxLoanValue != null) return false;
        if (mortgageCity != null ? !mortgageCity.equals(that.mortgageCity) : that.mortgageCity != null) return false;
        if (dealerBankProvince != null ? !dealerBankProvince.equals(that.dealerBankProvince) : that.dealerBankProvince != null)
            return false;
        if (affiliatedCompany != null ? !affiliatedCompany.equals(that.affiliatedCompany) : that.affiliatedCompany != null)
            return false;
        if (policyRes != null ? !policyRes.equals(that.policyRes) : that.policyRes != null) return false;
        if (matePolicyRes != null ? !matePolicyRes.equals(that.matePolicyRes) : that.matePolicyRes != null)
            return false;
        if (coborrowerPolicyRes != null ? !coborrowerPolicyRes.equals(that.coborrowerPolicyRes) : that.coborrowerPolicyRes != null)
            return false;
        if (isAntiLoan != null ? !isAntiLoan.equals(that.isAntiLoan) : that.isAntiLoan != null) return false;
        if (transLicenseTime != null ? !transLicenseTime.equals(that.transLicenseTime) : that.transLicenseTime != null)
            return false;
        if (affiliatedCompanyLegalPerson != null ? !affiliatedCompanyLegalPerson.equals(that.affiliatedCompanyLegalPerson) : that.affiliatedCompanyLegalPerson != null)
            return false;
        if (affiliatedCompanyMobile != null ? !affiliatedCompanyMobile.equals(that.affiliatedCompanyMobile) : that.affiliatedCompanyMobile != null)
            return false;
        if (affiliatedCompanyProvince != null ? !affiliatedCompanyProvince.equals(that.affiliatedCompanyProvince) : that.affiliatedCompanyProvince != null)
            return false;
        if (affiliatedCompanyCity != null ? !affiliatedCompanyCity.equals(that.affiliatedCompanyCity) : that.affiliatedCompanyCity != null)
            return false;
        if (affiliatedCompanyArea != null ? !affiliatedCompanyArea.equals(that.affiliatedCompanyArea) : that.affiliatedCompanyArea != null)
            return false;
        if (affiliatedCompanyAddr != null ? !affiliatedCompanyAddr.equals(that.affiliatedCompanyAddr) : that.affiliatedCompanyAddr != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = org != null ? org.hashCode() : 0;
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (appSerialNo != null ? appSerialNo.hashCode() : 0);
        result = 31 * result + (uniqueId != null ? uniqueId.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (productCd != null ? productCd.hashCode() : 0);
        result = 31 * result + (workflowFlag != null ? workflowFlag.hashCode() : 0);
        result = 31 * result + (appType != null ? appType.hashCode() : 0);
        result = 31 * result + (appLmt != null ? appLmt.hashCode() : 0);
        result = 31 * result + (appLoanTerm != null ? appLoanTerm.hashCode() : 0);
        result = 31 * result + (longTerm != null ? longTerm.hashCode() : 0);
        result = 31 * result + (accLmt != null ? accLmt.hashCode() : 0);
        result = 31 * result + (contractNo != null ? contractNo.hashCode() : 0);
        result = 31 * result + (rtfState != null ? rtfState.hashCode() : 0);
        result = 31 * result + (proNum != null ? proNum.hashCode() : 0);
        result = 31 * result + (nodeId != null ? nodeId.hashCode() : 0);
        result = 31 * result + (nodeName != null ? nodeName.hashCode() : 0);
        result = 31 * result + (refuseCode != null ? refuseCode.hashCode() : 0);
        result = 31 * result + (refuseDesc != null ? refuseDesc.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (compTime != null ? compTime.hashCode() : 0);
        result = 31 * result + (confirmDate != null ? confirmDate.hashCode() : 0);
        result = 31 * result + (cooperatorId != null ? cooperatorId.hashCode() : 0);
        result = 31 * result + (acqId != null ? acqId.hashCode() : 0);
        result = 31 * result + (subTerminalType != null ? subTerminalType.hashCode() : 0);
        result = 31 * result + (saveFlag != null ? saveFlag.hashCode() : 0);
        result = 31 * result + (taskDefKey != null ? taskDefKey.hashCode() : 0);
        result = 31 * result + (taskDefName != null ? taskDefName.hashCode() : 0);
        result = 31 * result + (oldCustFlag != null ? oldCustFlag.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (lstUpdTime != null ? lstUpdTime.hashCode() : 0);
        result = 31 * result + (lstUpdUser != null ? lstUpdUser.hashCode() : 0);
        result = 31 * result + jpaVersion;
        result = 31 * result + (ifFraud != null ? ifFraud.hashCode() : 0);
        result = 31 * result + (feeRate != null ? feeRate.hashCode() : 0);
        result = 31 * result + (trfSuperFlag != null ? trfSuperFlag.hashCode() : 0);
        result = 31 * result + (feeAmount != null ? feeAmount.hashCode() : 0);
        result = 31 * result + (patchNum != null ? patchNum.hashCode() : 0);
        result = 31 * result + (clientContractSignTime != null ? clientContractSignTime.hashCode() : 0);
        result = 31 * result + (customType != null ? customType.hashCode() : 0);
        result = 31 * result + (servicesn != null ? servicesn.hashCode() : 0);
        result = 31 * result + (dealerClerkId != null ? dealerClerkId.hashCode() : 0);
        result = 31 * result + (dealerClerkName != null ? dealerClerkName.hashCode() : 0);
        result = 31 * result + (dealerId != null ? dealerId.hashCode() : 0);
        result = 31 * result + (dealerName != null ? dealerName.hashCode() : 0);
        result = 31 * result + (clerkId != null ? clerkId.hashCode() : 0);
        result = 31 * result + (appNode != null ? appNode.hashCode() : 0);
        result = 31 * result + (appAction != null ? appAction.hashCode() : 0);
        result = 31 * result + (storeNo != null ? storeNo.hashCode() : 0);
        result = 31 * result + (applyLoanAmount != null ? applyLoanAmount.hashCode() : 0);
        result = 31 * result + (dealerCompanyId != null ? dealerCompanyId.hashCode() : 0);
        result = 31 * result + (downPaymentPercentage != null ? downPaymentPercentage.hashCode() : 0);
        result = 31 * result + (businessCirclesInfo != null ? businessCirclesInfo.hashCode() : 0);
        result = 31 * result + (courtDishonesty != null ? courtDishonesty.hashCode() : 0);
        result = 31 * result + (courtExecute != null ? courtExecute.hashCode() : 0);
        result = 31 * result + (availLoanAmount != null ? availLoanAmount.hashCode() : 0);
        result = 31 * result + (notarization != null ? notarization.hashCode() : 0);
        result = 31 * result + (dealerMobile != null ? dealerMobile.hashCode() : 0);
        result = 31 * result + (dealerCompanyName != null ? dealerCompanyName.hashCode() : 0);
        result = 31 * result + (appStatus != null ? appStatus.hashCode() : 0);
        result = 31 * result + (debtRatio != null ? debtRatio.hashCode() : 0);
        result = 31 * result + (contractStatus != null ? contractStatus.hashCode() : 0);
        result = 31 * result + (isFace != null ? isFace.hashCode() : 0);
        result = 31 * result + (applyLoanWay != null ? applyLoanWay.hashCode() : 0);
        result = 31 * result + (insuranceAmount != null ? insuranceAmount.hashCode() : 0);
        result = 31 * result + (gpsAmount != null ? gpsAmount.hashCode() : 0);
        result = 31 * result + (isInsurance != null ? isInsurance.hashCode() : 0);
        result = 31 * result + (dealerBankCardNbr != null ? dealerBankCardNbr.hashCode() : 0);
        result = 31 * result + (dealerBankCardName != null ? dealerBankCardName.hashCode() : 0);
        result = 31 * result + (dealerBankCode != null ? dealerBankCode.hashCode() : 0);
        result = 31 * result + (dealerAssociatedNo != null ? dealerAssociatedNo.hashCode() : 0);
        result = 31 * result + (isBindingCard != null ? isBindingCard.hashCode() : 0);
        result = 31 * result + (externalResult != null ? externalResult.hashCode() : 0);
        result = 31 * result + (lstNodeName != null ? lstNodeName.hashCode() : 0);
        result = 31 * result + (lstNodeId != null ? lstNodeId.hashCode() : 0);
        result = 31 * result + (serviceFeeType != null ? serviceFeeType.hashCode() : 0);
        result = 31 * result + (monthlyFeeRate != null ? monthlyFeeRate.hashCode() : 0);
        result = 31 * result + (orgAbbreviation != null ? orgAbbreviation.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        result = 31 * result + (returnReason != null ? returnReason.hashCode() : 0);
        result = 31 * result + (isCourtDishonesty != null ? isCourtDishonesty.hashCode() : 0);
        result = 31 * result + (isCourtExecute != null ? isCourtExecute.hashCode() : 0);
        result = 31 * result + (isBusinessCirclesInfo != null ? isBusinessCirclesInfo.hashCode() : 0);
        result = 31 * result + (applyDownPaymentPercentage != null ? applyDownPaymentPercentage.hashCode() : 0);
        result = 31 * result + (applyFeeAmount != null ? applyFeeAmount.hashCode() : 0);
        result = 31 * result + (applyInsuranceAmount != null ? applyInsuranceAmount.hashCode() : 0);
        result = 31 * result + (applyAccLmt != null ? applyAccLmt.hashCode() : 0);
        result = 31 * result + (acsContractNo != null ? acsContractNo.hashCode() : 0);
        result = 31 * result + (lastMonthlyAmount != null ? lastMonthlyAmount.hashCode() : 0);
        result = 31 * result + (monthlyAmount != null ? monthlyAmount.hashCode() : 0);
        result = 31 * result + (incomeModel != null ? incomeModel.hashCode() : 0);
        result = 31 * result + (incomeType != null ? incomeType.hashCode() : 0);
        result = 31 * result + (managementFeeRate != null ? managementFeeRate.hashCode() : 0);
        result = 31 * result + (managementFee != null ? managementFee.hashCode() : 0);
        result = 31 * result + (applyManagementFee != null ? applyManagementFee.hashCode() : 0);
        result = 31 * result + (loanFeeDefId != null ? loanFeeDefId.hashCode() : 0);
        result = 31 * result + (loanAmount != null ? loanAmount.hashCode() : 0);
        result = 31 * result + (dealerBankCity != null ? dealerBankCity.hashCode() : 0);
        result = 31 * result + (dealerBankBranch != null ? dealerBankBranch.hashCode() : 0);
        result = 31 * result + (purchaseTaxRate != null ? purchaseTaxRate.hashCode() : 0);
        result = 31 * result + (isPurchaseTax != null ? isPurchaseTax.hashCode() : 0);
        result = 31 * result + (commitTime != null ? commitTime.hashCode() : 0);
        result = 31 * result + (leavingMessageTemp != null ? leavingMessageTemp.hashCode() : 0);
        result = 31 * result + (purchaseTax != null ? purchaseTax.hashCode() : 0);
        result = 31 * result + (applyPurchaseTax != null ? applyPurchaseTax.hashCode() : 0);
        result = 31 * result + (accessedValue != null ? accessedValue.hashCode() : 0);
        result = 31 * result + (lastFinalCheckNode != null ? lastFinalCheckNode.hashCode() : 0);
        result = 31 * result + (lastFinalCheckTime != null ? lastFinalCheckTime.hashCode() : 0);
        result = 31 * result + (storeName != null ? storeName.hashCode() : 0);
        result = 31 * result + (maxLoanValue != null ? maxLoanValue.hashCode() : 0);
        result = 31 * result + (mortgageCity != null ? mortgageCity.hashCode() : 0);
        result = 31 * result + (dealerBankProvince != null ? dealerBankProvince.hashCode() : 0);
        result = 31 * result + (affiliatedCompany != null ? affiliatedCompany.hashCode() : 0);
        result = 31 * result + (policyRes != null ? policyRes.hashCode() : 0);
        result = 31 * result + (matePolicyRes != null ? matePolicyRes.hashCode() : 0);
        result = 31 * result + (coborrowerPolicyRes != null ? coborrowerPolicyRes.hashCode() : 0);
        result = 31 * result + (isAntiLoan != null ? isAntiLoan.hashCode() : 0);
        result = 31 * result + (transLicenseTime != null ? transLicenseTime.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyLegalPerson != null ? affiliatedCompanyLegalPerson.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyMobile != null ? affiliatedCompanyMobile.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyProvince != null ? affiliatedCompanyProvince.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyCity != null ? affiliatedCompanyCity.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyArea != null ? affiliatedCompanyArea.hashCode() : 0);
        result = 31 * result + (affiliatedCompanyAddr != null ? affiliatedCompanyAddr.hashCode() : 0);
        return result;
    }
}
