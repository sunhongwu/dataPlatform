package com.service.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/1/2.
 */
@Entity
@Table(name = "tm_app_prim_applicant_info", schema = "rmpsdb_che", catalog = "")
public class TmAppPrimApplicantInfoEntity {
    private int id;
    private String org;
    private String appNo;
    private String name;
    private String gender;
    private String idType;
    private String idNo;
    private String idLastDate;
    private String idLongEffective;
    private String cellphone;
    private BigDecimal monthIncome;
    private BigDecimal otherIncome;
    private BigDecimal yearIncome;
    private BigDecimal otherLoan;
    private String bankCode;
    private String bankCardNo;
    private String bankName;
    private String bankProvinceCode;
    private String bankProvinceName;
    private String bankCityCode;
    private String bankCityName;
    private String homePhone;
    private String email;
    private String abodeCity;
    private String qualification;
    private String socialIdentity;
    private String workStandFrom;
    private String lengthOfSchooling;
    private BigInteger yearsOfWork;
    private String empStandFrom;
    private String unitName;
    private String empDepartment;
    private String empPost;
    private String empType;
    private String empStructure;
    private String empPhone;
    private String empPhoneExtNum;
    private String empProvince;
    private String empCity;
    private String maritalStatus;
    private String houseCondition;
    private String createUser;
    private Timestamp createTime;
    private String lstUpdUser;
    private Timestamp lstUpdTime;
    private int jpaVersion;
    private String iphoeBreakout;
    private Timestamp graduationTime;
    private Integer age;
    private String bankReservePhoneNumber;
    private String loanDays;
    private String creditCardno;
    private String commissionerCode;
    private String authenticationPassword;
    private String fingerprinting;
    private String deviceType;
    private String location;
    private String carrierType;
    private String storeRiskercode;
    private String storeRiskfingerprinting;
    private String storeRisklocation;
    private String storeOrg;
    private String riskLevel;
    private String zhimaScore;
    private String zhimaImg;
    private String deviceIp;
    private String applyAdressCity;
    private String contactsCunt;
    private String idcardAddressCity;
    private String wifiSsid;
    private String graduatedSchool;
    private String storeCity;
    private String storeLocation;
    private String contactsList;
    private String discountCode;
    private String tongDun;
    private String gpsProvince;
    private String gpsCity;
    private String gpsLocation;
    private String workProofType;
    private BigDecimal annualIncome;
    private String mobile;
    private String bankCardNbr;
    private String bankCardName;
    private String loanTerm;
    private String driverLiscence;
    private String residenceCity;
    private String qqNbr;
    private String wechatNbr;
    private String hrPhone;
    private String socialSecurityYears;
    private BigDecimal monthlySalary;
    private String supportPeople;
    private BigDecimal monthlyHousePayment;
    private String otherLoanName;
    private BigDecimal monthlyOtherLoanPayment;
    private BigDecimal monthlyFixedPayment;
    private String loanUsage;
    private String otherLoanNeeds;
    private String otherLoanType;
    private String coborrowerName;
    private String coborrowerPerId;
    private String coborrowerMobile;
    private String appLetterInd;
    private String perIdInd;
    private String matePerIdInd;
    private String judgeType;
    private String xgRemark;
    private String incomeType;
    private String socialSecurityInd;
    private String mortgageContract;
    private String batchLoanContract;
    private BigDecimal monthlyTotalPayment;
    private String coborrowerAddress;
    private String haveCoborrower;
    private String carUse;
    private String coborrowerUnitName;
    private String coborrowerEmpDepartment;
    private String coborrowerEmpPost;
    private BigDecimal applyCarLoan;
    private String coborrowerEmpProvince;
    private String coborrowerEmpCity;
    private String drivingLicenseNo;
    private String drivingLicenseProvince;
    private String drivingLicenseCity;
    private String drivingLicenseCheckRes;
    private String abodeProvince;
    private String abodeArea;
    private String abodeAddr;
    private String empArea;
    private String empAddr;
    private String applyAddr;
    private String residenceAddr;
    private String applyAdressProvince;
    private String idcardAddressProvince;
    private String storeProvince;
    private String storeArea;
    private String storeAddr;
    private String applyAddressArea;
    private String residenceProvince;
    private String residenceArea;
    private String coborrowerEmpArea;
    private String coborrowerEmpAddr;
    private String nation;
    private String coborrowerRelation;
    private String contactEmpPost;
    private String contactEmpDepartment;
    private String mateEmpAdd;
    private String contactWorkname;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Basic
    @Column(name = "APP_NO")
    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "ID_TYPE")
    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    @Basic
    @Column(name = "ID_NO")
    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Basic
    @Column(name = "ID_LAST_DATE")
    public String getIdLastDate() {
        return idLastDate;
    }

    public void setIdLastDate(String idLastDate) {
        this.idLastDate = idLastDate;
    }

    @Basic
    @Column(name = "ID_LONG_EFFECTIVE")
    public String getIdLongEffective() {
        return idLongEffective;
    }

    public void setIdLongEffective(String idLongEffective) {
        this.idLongEffective = idLongEffective;
    }

    @Basic
    @Column(name = "CELLPHONE")
    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Basic
    @Column(name = "MONTH_INCOME")
    public BigDecimal getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(BigDecimal monthIncome) {
        this.monthIncome = monthIncome;
    }

    @Basic
    @Column(name = "OTHER_INCOME")
    public BigDecimal getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(BigDecimal otherIncome) {
        this.otherIncome = otherIncome;
    }

    @Basic
    @Column(name = "YEAR_INCOME")
    public BigDecimal getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(BigDecimal yearIncome) {
        this.yearIncome = yearIncome;
    }

    @Basic
    @Column(name = "OTHER_LOAN")
    public BigDecimal getOtherLoan() {
        return otherLoan;
    }

    public void setOtherLoan(BigDecimal otherLoan) {
        this.otherLoan = otherLoan;
    }

    @Basic
    @Column(name = "BANK_CODE")
    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Basic
    @Column(name = "BANK_CARD_NO")
    public String getBankCardNo() {
        return bankCardNo;
    }

    public void setBankCardNo(String bankCardNo) {
        this.bankCardNo = bankCardNo;
    }

    @Basic
    @Column(name = "BANK_NAME")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Basic
    @Column(name = "BANK_PROVINCE_CODE")
    public String getBankProvinceCode() {
        return bankProvinceCode;
    }

    public void setBankProvinceCode(String bankProvinceCode) {
        this.bankProvinceCode = bankProvinceCode;
    }

    @Basic
    @Column(name = "BANK_PROVINCE_NAME")
    public String getBankProvinceName() {
        return bankProvinceName;
    }

    public void setBankProvinceName(String bankProvinceName) {
        this.bankProvinceName = bankProvinceName;
    }

    @Basic
    @Column(name = "BANK_CITY_CODE")
    public String getBankCityCode() {
        return bankCityCode;
    }

    public void setBankCityCode(String bankCityCode) {
        this.bankCityCode = bankCityCode;
    }

    @Basic
    @Column(name = "BANK_CITY_NAME")
    public String getBankCityName() {
        return bankCityName;
    }

    public void setBankCityName(String bankCityName) {
        this.bankCityName = bankCityName;
    }

    @Basic
    @Column(name = "HOME_PHONE")
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ABODE_CITY")
    public String getAbodeCity() {
        return abodeCity;
    }

    public void setAbodeCity(String abodeCity) {
        this.abodeCity = abodeCity;
    }

    @Basic
    @Column(name = "QUALIFICATION")
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Basic
    @Column(name = "SOCIAL_IDENTITY")
    public String getSocialIdentity() {
        return socialIdentity;
    }

    public void setSocialIdentity(String socialIdentity) {
        this.socialIdentity = socialIdentity;
    }

    @Basic
    @Column(name = "WORK_STAND_FROM")
    public String getWorkStandFrom() {
        return workStandFrom;
    }

    public void setWorkStandFrom(String workStandFrom) {
        this.workStandFrom = workStandFrom;
    }

    @Basic
    @Column(name = "LENGTH_OF_SCHOOLING")
    public String getLengthOfSchooling() {
        return lengthOfSchooling;
    }

    public void setLengthOfSchooling(String lengthOfSchooling) {
        this.lengthOfSchooling = lengthOfSchooling;
    }

    @Basic
    @Column(name = "YEARS_OF_WORK")
    public BigInteger getYearsOfWork() {
        return yearsOfWork;
    }

    public void setYearsOfWork(BigInteger yearsOfWork) {
        this.yearsOfWork = yearsOfWork;
    }

    @Basic
    @Column(name = "EMP_STAND_FROM")
    public String getEmpStandFrom() {
        return empStandFrom;
    }

    public void setEmpStandFrom(String empStandFrom) {
        this.empStandFrom = empStandFrom;
    }

    @Basic
    @Column(name = "UNIT_NAME")
    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Basic
    @Column(name = "EMP_DEPARTMENT")
    public String getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(String empDepartment) {
        this.empDepartment = empDepartment;
    }

    @Basic
    @Column(name = "EMP_POST")
    public String getEmpPost() {
        return empPost;
    }

    public void setEmpPost(String empPost) {
        this.empPost = empPost;
    }

    @Basic
    @Column(name = "EMP_TYPE")
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    @Basic
    @Column(name = "EMP_STRUCTURE")
    public String getEmpStructure() {
        return empStructure;
    }

    public void setEmpStructure(String empStructure) {
        this.empStructure = empStructure;
    }

    @Basic
    @Column(name = "EMP_PHONE")
    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    @Basic
    @Column(name = "EMP_PHONE_EXT_NUM")
    public String getEmpPhoneExtNum() {
        return empPhoneExtNum;
    }

    public void setEmpPhoneExtNum(String empPhoneExtNum) {
        this.empPhoneExtNum = empPhoneExtNum;
    }

    @Basic
    @Column(name = "EMP_PROVINCE")
    public String getEmpProvince() {
        return empProvince;
    }

    public void setEmpProvince(String empProvince) {
        this.empProvince = empProvince;
    }

    @Basic
    @Column(name = "EMP_CITY")
    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    @Basic
    @Column(name = "MARITAL_STATUS")
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Basic
    @Column(name = "HOUSE_CONDITION")
    public String getHouseCondition() {
        return houseCondition;
    }

    public void setHouseCondition(String houseCondition) {
        this.houseCondition = houseCondition;
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
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "LST_UPD_TIME")
    public Timestamp getLstUpdTime() {
        return lstUpdTime;
    }

    public void setLstUpdTime(Timestamp lstUpdTime) {
        this.lstUpdTime = lstUpdTime;
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
    @Column(name = "IPHOE_BREAKOUT")
    public String getIphoeBreakout() {
        return iphoeBreakout;
    }

    public void setIphoeBreakout(String iphoeBreakout) {
        this.iphoeBreakout = iphoeBreakout;
    }

    @Basic
    @Column(name = "GRADUATION_TIME")
    public Timestamp getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Timestamp graduationTime) {
        this.graduationTime = graduationTime;
    }

    @Basic
    @Column(name = "AGE")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "BANK_RESERVE_PHONE_NUMBER")
    public String getBankReservePhoneNumber() {
        return bankReservePhoneNumber;
    }

    public void setBankReservePhoneNumber(String bankReservePhoneNumber) {
        this.bankReservePhoneNumber = bankReservePhoneNumber;
    }

    @Basic
    @Column(name = "LOAN_DAYS")
    public String getLoanDays() {
        return loanDays;
    }

    public void setLoanDays(String loanDays) {
        this.loanDays = loanDays;
    }

    @Basic
    @Column(name = "CREDIT_CARDNO")
    public String getCreditCardno() {
        return creditCardno;
    }

    public void setCreditCardno(String creditCardno) {
        this.creditCardno = creditCardno;
    }

    @Basic
    @Column(name = "COMMISSIONER_CODE")
    public String getCommissionerCode() {
        return commissionerCode;
    }

    public void setCommissionerCode(String commissionerCode) {
        this.commissionerCode = commissionerCode;
    }

    @Basic
    @Column(name = "AUTHENTICATION_PASSWORD")
    public String getAuthenticationPassword() {
        return authenticationPassword;
    }

    public void setAuthenticationPassword(String authenticationPassword) {
        this.authenticationPassword = authenticationPassword;
    }

    @Basic
    @Column(name = "FINGERPRINTING")
    public String getFingerprinting() {
        return fingerprinting;
    }

    public void setFingerprinting(String fingerprinting) {
        this.fingerprinting = fingerprinting;
    }

    @Basic
    @Column(name = "DEVICE_TYPE")
    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    @Basic
    @Column(name = "LOCATION")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "CARRIER_TYPE")
    public String getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    @Basic
    @Column(name = "STORE_RISKERCODE")
    public String getStoreRiskercode() {
        return storeRiskercode;
    }

    public void setStoreRiskercode(String storeRiskercode) {
        this.storeRiskercode = storeRiskercode;
    }

    @Basic
    @Column(name = "STORE_RISKFINGERPRINTING")
    public String getStoreRiskfingerprinting() {
        return storeRiskfingerprinting;
    }

    public void setStoreRiskfingerprinting(String storeRiskfingerprinting) {
        this.storeRiskfingerprinting = storeRiskfingerprinting;
    }

    @Basic
    @Column(name = "STORE_RISKLOCATION")
    public String getStoreRisklocation() {
        return storeRisklocation;
    }

    public void setStoreRisklocation(String storeRisklocation) {
        this.storeRisklocation = storeRisklocation;
    }

    @Basic
    @Column(name = "STORE_ORG")
    public String getStoreOrg() {
        return storeOrg;
    }

    public void setStoreOrg(String storeOrg) {
        this.storeOrg = storeOrg;
    }

    @Basic
    @Column(name = "RISK_LEVEL")
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Basic
    @Column(name = "ZHIMA_SCORE")
    public String getZhimaScore() {
        return zhimaScore;
    }

    public void setZhimaScore(String zhimaScore) {
        this.zhimaScore = zhimaScore;
    }

    @Basic
    @Column(name = "ZHIMA_IMG")
    public String getZhimaImg() {
        return zhimaImg;
    }

    public void setZhimaImg(String zhimaImg) {
        this.zhimaImg = zhimaImg;
    }

    @Basic
    @Column(name = "DEVICE_IP")
    public String getDeviceIp() {
        return deviceIp;
    }

    public void setDeviceIp(String deviceIp) {
        this.deviceIp = deviceIp;
    }

    @Basic
    @Column(name = "APPLY_ADRESS_CITY")
    public String getApplyAdressCity() {
        return applyAdressCity;
    }

    public void setApplyAdressCity(String applyAdressCity) {
        this.applyAdressCity = applyAdressCity;
    }

    @Basic
    @Column(name = "CONTACTS_CUNT")
    public String getContactsCunt() {
        return contactsCunt;
    }

    public void setContactsCunt(String contactsCunt) {
        this.contactsCunt = contactsCunt;
    }

    @Basic
    @Column(name = "IDCARD_ADDRESS_CITY")
    public String getIdcardAddressCity() {
        return idcardAddressCity;
    }

    public void setIdcardAddressCity(String idcardAddressCity) {
        this.idcardAddressCity = idcardAddressCity;
    }

    @Basic
    @Column(name = "WIFI_SSID")
    public String getWifiSsid() {
        return wifiSsid;
    }

    public void setWifiSsid(String wifiSsid) {
        this.wifiSsid = wifiSsid;
    }

    @Basic
    @Column(name = "GRADUATED_SCHOOL")
    public String getGraduatedSchool() {
        return graduatedSchool;
    }

    public void setGraduatedSchool(String graduatedSchool) {
        this.graduatedSchool = graduatedSchool;
    }

    @Basic
    @Column(name = "STORE_CITY")
    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    @Basic
    @Column(name = "STORE_LOCATION")
    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    @Basic
    @Column(name = "CONTACTS_LIST")
    public String getContactsList() {
        return contactsList;
    }

    public void setContactsList(String contactsList) {
        this.contactsList = contactsList;
    }

    @Basic
    @Column(name = "DISCOUNT_CODE")
    public String getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(String discountCode) {
        this.discountCode = discountCode;
    }

    @Basic
    @Column(name = "TONG_DUN")
    public String getTongDun() {
        return tongDun;
    }

    public void setTongDun(String tongDun) {
        this.tongDun = tongDun;
    }

    @Basic
    @Column(name = "GPS_PROVINCE")
    public String getGpsProvince() {
        return gpsProvince;
    }

    public void setGpsProvince(String gpsProvince) {
        this.gpsProvince = gpsProvince;
    }

    @Basic
    @Column(name = "GPS_CITY")
    public String getGpsCity() {
        return gpsCity;
    }

    public void setGpsCity(String gpsCity) {
        this.gpsCity = gpsCity;
    }

    @Basic
    @Column(name = "GPS_LOCATION")
    public String getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(String gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    @Basic
    @Column(name = "WORK_PROOF_TYPE")
    public String getWorkProofType() {
        return workProofType;
    }

    public void setWorkProofType(String workProofType) {
        this.workProofType = workProofType;
    }

    @Basic
    @Column(name = "ANNUAL_INCOME")
    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    @Basic
    @Column(name = "MOBILE")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "BANK_CARD_NBR")
    public String getBankCardNbr() {
        return bankCardNbr;
    }

    public void setBankCardNbr(String bankCardNbr) {
        this.bankCardNbr = bankCardNbr;
    }

    @Basic
    @Column(name = "BANK_CARD_NAME")
    public String getBankCardName() {
        return bankCardName;
    }

    public void setBankCardName(String bankCardName) {
        this.bankCardName = bankCardName;
    }

    @Basic
    @Column(name = "LOAN_TERM")
    public String getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(String loanTerm) {
        this.loanTerm = loanTerm;
    }

    @Basic
    @Column(name = "DRIVER_LISCENCE")
    public String getDriverLiscence() {
        return driverLiscence;
    }

    public void setDriverLiscence(String driverLiscence) {
        this.driverLiscence = driverLiscence;
    }

    @Basic
    @Column(name = "RESIDENCE_CITY")
    public String getResidenceCity() {
        return residenceCity;
    }

    public void setResidenceCity(String residenceCity) {
        this.residenceCity = residenceCity;
    }

    @Basic
    @Column(name = "QQ_NBR")
    public String getQqNbr() {
        return qqNbr;
    }

    public void setQqNbr(String qqNbr) {
        this.qqNbr = qqNbr;
    }

    @Basic
    @Column(name = "WECHAT_NBR")
    public String getWechatNbr() {
        return wechatNbr;
    }

    public void setWechatNbr(String wechatNbr) {
        this.wechatNbr = wechatNbr;
    }

    @Basic
    @Column(name = "HR_PHONE")
    public String getHrPhone() {
        return hrPhone;
    }

    public void setHrPhone(String hrPhone) {
        this.hrPhone = hrPhone;
    }

    @Basic
    @Column(name = "SOCIAL_SECURITY_YEARS")
    public String getSocialSecurityYears() {
        return socialSecurityYears;
    }

    public void setSocialSecurityYears(String socialSecurityYears) {
        this.socialSecurityYears = socialSecurityYears;
    }

    @Basic
    @Column(name = "MONTHLY_SALARY")
    public BigDecimal getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(BigDecimal monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Basic
    @Column(name = "SUPPORT_PEOPLE")
    public String getSupportPeople() {
        return supportPeople;
    }

    public void setSupportPeople(String supportPeople) {
        this.supportPeople = supportPeople;
    }

    @Basic
    @Column(name = "MONTHLY_HOUSE_PAYMENT")
    public BigDecimal getMonthlyHousePayment() {
        return monthlyHousePayment;
    }

    public void setMonthlyHousePayment(BigDecimal monthlyHousePayment) {
        this.monthlyHousePayment = monthlyHousePayment;
    }

    @Basic
    @Column(name = "OTHER_LOAN_NAME")
    public String getOtherLoanName() {
        return otherLoanName;
    }

    public void setOtherLoanName(String otherLoanName) {
        this.otherLoanName = otherLoanName;
    }

    @Basic
    @Column(name = "MONTHLY_OTHER_LOAN_PAYMENT")
    public BigDecimal getMonthlyOtherLoanPayment() {
        return monthlyOtherLoanPayment;
    }

    public void setMonthlyOtherLoanPayment(BigDecimal monthlyOtherLoanPayment) {
        this.monthlyOtherLoanPayment = monthlyOtherLoanPayment;
    }

    @Basic
    @Column(name = "MONTHLY_FIXED_PAYMENT")
    public BigDecimal getMonthlyFixedPayment() {
        return monthlyFixedPayment;
    }

    public void setMonthlyFixedPayment(BigDecimal monthlyFixedPayment) {
        this.monthlyFixedPayment = monthlyFixedPayment;
    }

    @Basic
    @Column(name = "LOAN_USAGE")
    public String getLoanUsage() {
        return loanUsage;
    }

    public void setLoanUsage(String loanUsage) {
        this.loanUsage = loanUsage;
    }

    @Basic
    @Column(name = "OTHER_LOAN_NEEDS")
    public String getOtherLoanNeeds() {
        return otherLoanNeeds;
    }

    public void setOtherLoanNeeds(String otherLoanNeeds) {
        this.otherLoanNeeds = otherLoanNeeds;
    }

    @Basic
    @Column(name = "OTHER_LOAN_TYPE")
    public String getOtherLoanType() {
        return otherLoanType;
    }

    public void setOtherLoanType(String otherLoanType) {
        this.otherLoanType = otherLoanType;
    }

    @Basic
    @Column(name = "COBORROWER_NAME")
    public String getCoborrowerName() {
        return coborrowerName;
    }

    public void setCoborrowerName(String coborrowerName) {
        this.coborrowerName = coborrowerName;
    }

    @Basic
    @Column(name = "COBORROWER_PER_ID")
    public String getCoborrowerPerId() {
        return coborrowerPerId;
    }

    public void setCoborrowerPerId(String coborrowerPerId) {
        this.coborrowerPerId = coborrowerPerId;
    }

    @Basic
    @Column(name = "COBORROWER_MOBILE")
    public String getCoborrowerMobile() {
        return coborrowerMobile;
    }

    public void setCoborrowerMobile(String coborrowerMobile) {
        this.coborrowerMobile = coborrowerMobile;
    }

    @Basic
    @Column(name = "APP_LETTER_IND")
    public String getAppLetterInd() {
        return appLetterInd;
    }

    public void setAppLetterInd(String appLetterInd) {
        this.appLetterInd = appLetterInd;
    }

    @Basic
    @Column(name = "PER_ID_IND")
    public String getPerIdInd() {
        return perIdInd;
    }

    public void setPerIdInd(String perIdInd) {
        this.perIdInd = perIdInd;
    }

    @Basic
    @Column(name = "MATE_PER_ID_IND")
    public String getMatePerIdInd() {
        return matePerIdInd;
    }

    public void setMatePerIdInd(String matePerIdInd) {
        this.matePerIdInd = matePerIdInd;
    }

    @Basic
    @Column(name = "JUDGE_TYPE")
    public String getJudgeType() {
        return judgeType;
    }

    public void setJudgeType(String judgeType) {
        this.judgeType = judgeType;
    }

    @Basic
    @Column(name = "XG_REMARK")
    public String getXgRemark() {
        return xgRemark;
    }

    public void setXgRemark(String xgRemark) {
        this.xgRemark = xgRemark;
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
    @Column(name = "SOCIAL_SECURITY_IND")
    public String getSocialSecurityInd() {
        return socialSecurityInd;
    }

    public void setSocialSecurityInd(String socialSecurityInd) {
        this.socialSecurityInd = socialSecurityInd;
    }

    @Basic
    @Column(name = "MORTGAGE_CONTRACT")
    public String getMortgageContract() {
        return mortgageContract;
    }

    public void setMortgageContract(String mortgageContract) {
        this.mortgageContract = mortgageContract;
    }

    @Basic
    @Column(name = "BATCH_LOAN_CONTRACT")
    public String getBatchLoanContract() {
        return batchLoanContract;
    }

    public void setBatchLoanContract(String batchLoanContract) {
        this.batchLoanContract = batchLoanContract;
    }

    @Basic
    @Column(name = "MONTHLY_TOTAL_PAYMENT")
    public BigDecimal getMonthlyTotalPayment() {
        return monthlyTotalPayment;
    }

    public void setMonthlyTotalPayment(BigDecimal monthlyTotalPayment) {
        this.monthlyTotalPayment = monthlyTotalPayment;
    }

    @Basic
    @Column(name = "COBORROWER_ADDRESS")
    public String getCoborrowerAddress() {
        return coborrowerAddress;
    }

    public void setCoborrowerAddress(String coborrowerAddress) {
        this.coborrowerAddress = coborrowerAddress;
    }

    @Basic
    @Column(name = "HAVE_COBORROWER")
    public String getHaveCoborrower() {
        return haveCoborrower;
    }

    public void setHaveCoborrower(String haveCoborrower) {
        this.haveCoborrower = haveCoborrower;
    }

    @Basic
    @Column(name = "CAR_USE")
    public String getCarUse() {
        return carUse;
    }

    public void setCarUse(String carUse) {
        this.carUse = carUse;
    }

    @Basic
    @Column(name = "COBORROWER_UNIT_NAME")
    public String getCoborrowerUnitName() {
        return coborrowerUnitName;
    }

    public void setCoborrowerUnitName(String coborrowerUnitName) {
        this.coborrowerUnitName = coborrowerUnitName;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_DEPARTMENT")
    public String getCoborrowerEmpDepartment() {
        return coborrowerEmpDepartment;
    }

    public void setCoborrowerEmpDepartment(String coborrowerEmpDepartment) {
        this.coborrowerEmpDepartment = coborrowerEmpDepartment;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_POST")
    public String getCoborrowerEmpPost() {
        return coborrowerEmpPost;
    }

    public void setCoborrowerEmpPost(String coborrowerEmpPost) {
        this.coborrowerEmpPost = coborrowerEmpPost;
    }

    @Basic
    @Column(name = "APPLY_CAR_LOAN")
    public BigDecimal getApplyCarLoan() {
        return applyCarLoan;
    }

    public void setApplyCarLoan(BigDecimal applyCarLoan) {
        this.applyCarLoan = applyCarLoan;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_PROVINCE")
    public String getCoborrowerEmpProvince() {
        return coborrowerEmpProvince;
    }

    public void setCoborrowerEmpProvince(String coborrowerEmpProvince) {
        this.coborrowerEmpProvince = coborrowerEmpProvince;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_CITY")
    public String getCoborrowerEmpCity() {
        return coborrowerEmpCity;
    }

    public void setCoborrowerEmpCity(String coborrowerEmpCity) {
        this.coborrowerEmpCity = coborrowerEmpCity;
    }

    @Basic
    @Column(name = "DRIVING_LICENSE_NO")
    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    @Basic
    @Column(name = "DRIVING_LICENSE_PROVINCE")
    public String getDrivingLicenseProvince() {
        return drivingLicenseProvince;
    }

    public void setDrivingLicenseProvince(String drivingLicenseProvince) {
        this.drivingLicenseProvince = drivingLicenseProvince;
    }

    @Basic
    @Column(name = "DRIVING_LICENSE_CITY")
    public String getDrivingLicenseCity() {
        return drivingLicenseCity;
    }

    public void setDrivingLicenseCity(String drivingLicenseCity) {
        this.drivingLicenseCity = drivingLicenseCity;
    }

    @Basic
    @Column(name = "DRIVING_LICENSE_CHECK_RES")
    public String getDrivingLicenseCheckRes() {
        return drivingLicenseCheckRes;
    }

    public void setDrivingLicenseCheckRes(String drivingLicenseCheckRes) {
        this.drivingLicenseCheckRes = drivingLicenseCheckRes;
    }

    @Basic
    @Column(name = "ABODE_PROVINCE")
    public String getAbodeProvince() {
        return abodeProvince;
    }

    public void setAbodeProvince(String abodeProvince) {
        this.abodeProvince = abodeProvince;
    }

    @Basic
    @Column(name = "ABODE_AREA")
    public String getAbodeArea() {
        return abodeArea;
    }

    public void setAbodeArea(String abodeArea) {
        this.abodeArea = abodeArea;
    }

    @Basic
    @Column(name = "ABODE_ADDR")
    public String getAbodeAddr() {
        return abodeAddr;
    }

    public void setAbodeAddr(String abodeAddr) {
        this.abodeAddr = abodeAddr;
    }

    @Basic
    @Column(name = "EMP_AREA")
    public String getEmpArea() {
        return empArea;
    }

    public void setEmpArea(String empArea) {
        this.empArea = empArea;
    }

    @Basic
    @Column(name = "EMP_ADDR")
    public String getEmpAddr() {
        return empAddr;
    }

    public void setEmpAddr(String empAddr) {
        this.empAddr = empAddr;
    }

    @Basic
    @Column(name = "APPLY_ADDR")
    public String getApplyAddr() {
        return applyAddr;
    }

    public void setApplyAddr(String applyAddr) {
        this.applyAddr = applyAddr;
    }

    @Basic
    @Column(name = "RESIDENCE_ADDR")
    public String getResidenceAddr() {
        return residenceAddr;
    }

    public void setResidenceAddr(String residenceAddr) {
        this.residenceAddr = residenceAddr;
    }

    @Basic
    @Column(name = "APPLY_ADRESS_PROVINCE")
    public String getApplyAdressProvince() {
        return applyAdressProvince;
    }

    public void setApplyAdressProvince(String applyAdressProvince) {
        this.applyAdressProvince = applyAdressProvince;
    }

    @Basic
    @Column(name = "IDCARD_ADDRESS_PROVINCE")
    public String getIdcardAddressProvince() {
        return idcardAddressProvince;
    }

    public void setIdcardAddressProvince(String idcardAddressProvince) {
        this.idcardAddressProvince = idcardAddressProvince;
    }

    @Basic
    @Column(name = "STORE_PROVINCE")
    public String getStoreProvince() {
        return storeProvince;
    }

    public void setStoreProvince(String storeProvince) {
        this.storeProvince = storeProvince;
    }

    @Basic
    @Column(name = "STORE_AREA")
    public String getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(String storeArea) {
        this.storeArea = storeArea;
    }

    @Basic
    @Column(name = "STORE_ADDR")
    public String getStoreAddr() {
        return storeAddr;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr;
    }

    @Basic
    @Column(name = "APPLY_ADDRESS_AREA")
    public String getApplyAddressArea() {
        return applyAddressArea;
    }

    public void setApplyAddressArea(String applyAddressArea) {
        this.applyAddressArea = applyAddressArea;
    }

    @Basic
    @Column(name = "RESIDENCE_PROVINCE")
    public String getResidenceProvince() {
        return residenceProvince;
    }

    public void setResidenceProvince(String residenceProvince) {
        this.residenceProvince = residenceProvince;
    }

    @Basic
    @Column(name = "RESIDENCE_AREA")
    public String getResidenceArea() {
        return residenceArea;
    }

    public void setResidenceArea(String residenceArea) {
        this.residenceArea = residenceArea;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_AREA")
    public String getCoborrowerEmpArea() {
        return coborrowerEmpArea;
    }

    public void setCoborrowerEmpArea(String coborrowerEmpArea) {
        this.coborrowerEmpArea = coborrowerEmpArea;
    }

    @Basic
    @Column(name = "COBORROWER_EMP_ADDR")
    public String getCoborrowerEmpAddr() {
        return coborrowerEmpAddr;
    }

    public void setCoborrowerEmpAddr(String coborrowerEmpAddr) {
        this.coborrowerEmpAddr = coborrowerEmpAddr;
    }

    @Basic
    @Column(name = "NATION")
    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Basic
    @Column(name = "COBORROWER_RELATION")
    public String getCoborrowerRelation() {
        return coborrowerRelation;
    }

    public void setCoborrowerRelation(String coborrowerRelation) {
        this.coborrowerRelation = coborrowerRelation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmAppPrimApplicantInfoEntity that = (TmAppPrimApplicantInfoEntity) o;

        if (id != that.id) return false;
        if (jpaVersion != that.jpaVersion) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (idType != null ? !idType.equals(that.idType) : that.idType != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (idLastDate != null ? !idLastDate.equals(that.idLastDate) : that.idLastDate != null) return false;
        if (idLongEffective != null ? !idLongEffective.equals(that.idLongEffective) : that.idLongEffective != null)
            return false;
        if (cellphone != null ? !cellphone.equals(that.cellphone) : that.cellphone != null) return false;
        if (monthIncome != null ? !monthIncome.equals(that.monthIncome) : that.monthIncome != null) return false;
        if (otherIncome != null ? !otherIncome.equals(that.otherIncome) : that.otherIncome != null) return false;
        if (yearIncome != null ? !yearIncome.equals(that.yearIncome) : that.yearIncome != null) return false;
        if (otherLoan != null ? !otherLoan.equals(that.otherLoan) : that.otherLoan != null) return false;
        if (bankCode != null ? !bankCode.equals(that.bankCode) : that.bankCode != null) return false;
        if (bankCardNo != null ? !bankCardNo.equals(that.bankCardNo) : that.bankCardNo != null) return false;
        if (bankName != null ? !bankName.equals(that.bankName) : that.bankName != null) return false;
        if (bankProvinceCode != null ? !bankProvinceCode.equals(that.bankProvinceCode) : that.bankProvinceCode != null)
            return false;
        if (bankProvinceName != null ? !bankProvinceName.equals(that.bankProvinceName) : that.bankProvinceName != null)
            return false;
        if (bankCityCode != null ? !bankCityCode.equals(that.bankCityCode) : that.bankCityCode != null) return false;
        if (bankCityName != null ? !bankCityName.equals(that.bankCityName) : that.bankCityName != null) return false;
        if (homePhone != null ? !homePhone.equals(that.homePhone) : that.homePhone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (abodeCity != null ? !abodeCity.equals(that.abodeCity) : that.abodeCity != null) return false;
        if (qualification != null ? !qualification.equals(that.qualification) : that.qualification != null)
            return false;
        if (socialIdentity != null ? !socialIdentity.equals(that.socialIdentity) : that.socialIdentity != null)
            return false;
        if (workStandFrom != null ? !workStandFrom.equals(that.workStandFrom) : that.workStandFrom != null)
            return false;
        if (lengthOfSchooling != null ? !lengthOfSchooling.equals(that.lengthOfSchooling) : that.lengthOfSchooling != null)
            return false;
        if (yearsOfWork != null ? !yearsOfWork.equals(that.yearsOfWork) : that.yearsOfWork != null) return false;
        if (empStandFrom != null ? !empStandFrom.equals(that.empStandFrom) : that.empStandFrom != null) return false;
        if (unitName != null ? !unitName.equals(that.unitName) : that.unitName != null) return false;
        if (empDepartment != null ? !empDepartment.equals(that.empDepartment) : that.empDepartment != null)
            return false;
        if (empPost != null ? !empPost.equals(that.empPost) : that.empPost != null) return false;
        if (empType != null ? !empType.equals(that.empType) : that.empType != null) return false;
        if (empStructure != null ? !empStructure.equals(that.empStructure) : that.empStructure != null) return false;
        if (empPhone != null ? !empPhone.equals(that.empPhone) : that.empPhone != null) return false;
        if (empPhoneExtNum != null ? !empPhoneExtNum.equals(that.empPhoneExtNum) : that.empPhoneExtNum != null)
            return false;
        if (empProvince != null ? !empProvince.equals(that.empProvince) : that.empProvince != null) return false;
        if (empCity != null ? !empCity.equals(that.empCity) : that.empCity != null) return false;
        if (maritalStatus != null ? !maritalStatus.equals(that.maritalStatus) : that.maritalStatus != null)
            return false;
        if (houseCondition != null ? !houseCondition.equals(that.houseCondition) : that.houseCondition != null)
            return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (lstUpdUser != null ? !lstUpdUser.equals(that.lstUpdUser) : that.lstUpdUser != null) return false;
        if (lstUpdTime != null ? !lstUpdTime.equals(that.lstUpdTime) : that.lstUpdTime != null) return false;
        if (iphoeBreakout != null ? !iphoeBreakout.equals(that.iphoeBreakout) : that.iphoeBreakout != null)
            return false;
        if (graduationTime != null ? !graduationTime.equals(that.graduationTime) : that.graduationTime != null)
            return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (bankReservePhoneNumber != null ? !bankReservePhoneNumber.equals(that.bankReservePhoneNumber) : that.bankReservePhoneNumber != null)
            return false;
        if (loanDays != null ? !loanDays.equals(that.loanDays) : that.loanDays != null) return false;
        if (creditCardno != null ? !creditCardno.equals(that.creditCardno) : that.creditCardno != null) return false;
        if (commissionerCode != null ? !commissionerCode.equals(that.commissionerCode) : that.commissionerCode != null)
            return false;
        if (authenticationPassword != null ? !authenticationPassword.equals(that.authenticationPassword) : that.authenticationPassword != null)
            return false;
        if (fingerprinting != null ? !fingerprinting.equals(that.fingerprinting) : that.fingerprinting != null)
            return false;
        if (deviceType != null ? !deviceType.equals(that.deviceType) : that.deviceType != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (carrierType != null ? !carrierType.equals(that.carrierType) : that.carrierType != null) return false;
        if (storeRiskercode != null ? !storeRiskercode.equals(that.storeRiskercode) : that.storeRiskercode != null)
            return false;
        if (storeRiskfingerprinting != null ? !storeRiskfingerprinting.equals(that.storeRiskfingerprinting) : that.storeRiskfingerprinting != null)
            return false;
        if (storeRisklocation != null ? !storeRisklocation.equals(that.storeRisklocation) : that.storeRisklocation != null)
            return false;
        if (storeOrg != null ? !storeOrg.equals(that.storeOrg) : that.storeOrg != null) return false;
        if (riskLevel != null ? !riskLevel.equals(that.riskLevel) : that.riskLevel != null) return false;
        if (zhimaScore != null ? !zhimaScore.equals(that.zhimaScore) : that.zhimaScore != null) return false;
        if (zhimaImg != null ? !zhimaImg.equals(that.zhimaImg) : that.zhimaImg != null) return false;
        if (deviceIp != null ? !deviceIp.equals(that.deviceIp) : that.deviceIp != null) return false;
        if (applyAdressCity != null ? !applyAdressCity.equals(that.applyAdressCity) : that.applyAdressCity != null)
            return false;
        if (contactsCunt != null ? !contactsCunt.equals(that.contactsCunt) : that.contactsCunt != null) return false;
        if (idcardAddressCity != null ? !idcardAddressCity.equals(that.idcardAddressCity) : that.idcardAddressCity != null)
            return false;
        if (wifiSsid != null ? !wifiSsid.equals(that.wifiSsid) : that.wifiSsid != null) return false;
        if (graduatedSchool != null ? !graduatedSchool.equals(that.graduatedSchool) : that.graduatedSchool != null)
            return false;
        if (storeCity != null ? !storeCity.equals(that.storeCity) : that.storeCity != null) return false;
        if (storeLocation != null ? !storeLocation.equals(that.storeLocation) : that.storeLocation != null)
            return false;
        if (contactsList != null ? !contactsList.equals(that.contactsList) : that.contactsList != null) return false;
        if (discountCode != null ? !discountCode.equals(that.discountCode) : that.discountCode != null) return false;
        if (tongDun != null ? !tongDun.equals(that.tongDun) : that.tongDun != null) return false;
        if (gpsProvince != null ? !gpsProvince.equals(that.gpsProvince) : that.gpsProvince != null) return false;
        if (gpsCity != null ? !gpsCity.equals(that.gpsCity) : that.gpsCity != null) return false;
        if (gpsLocation != null ? !gpsLocation.equals(that.gpsLocation) : that.gpsLocation != null) return false;
        if (workProofType != null ? !workProofType.equals(that.workProofType) : that.workProofType != null)
            return false;
        if (annualIncome != null ? !annualIncome.equals(that.annualIncome) : that.annualIncome != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (bankCardNbr != null ? !bankCardNbr.equals(that.bankCardNbr) : that.bankCardNbr != null) return false;
        if (bankCardName != null ? !bankCardName.equals(that.bankCardName) : that.bankCardName != null) return false;
        if (loanTerm != null ? !loanTerm.equals(that.loanTerm) : that.loanTerm != null) return false;
        if (driverLiscence != null ? !driverLiscence.equals(that.driverLiscence) : that.driverLiscence != null)
            return false;
        if (residenceCity != null ? !residenceCity.equals(that.residenceCity) : that.residenceCity != null)
            return false;
        if (qqNbr != null ? !qqNbr.equals(that.qqNbr) : that.qqNbr != null) return false;
        if (wechatNbr != null ? !wechatNbr.equals(that.wechatNbr) : that.wechatNbr != null) return false;
        if (hrPhone != null ? !hrPhone.equals(that.hrPhone) : that.hrPhone != null) return false;
        if (socialSecurityYears != null ? !socialSecurityYears.equals(that.socialSecurityYears) : that.socialSecurityYears != null)
            return false;
        if (monthlySalary != null ? !monthlySalary.equals(that.monthlySalary) : that.monthlySalary != null)
            return false;
        if (supportPeople != null ? !supportPeople.equals(that.supportPeople) : that.supportPeople != null)
            return false;
        if (monthlyHousePayment != null ? !monthlyHousePayment.equals(that.monthlyHousePayment) : that.monthlyHousePayment != null)
            return false;
        if (otherLoanName != null ? !otherLoanName.equals(that.otherLoanName) : that.otherLoanName != null)
            return false;
        if (monthlyOtherLoanPayment != null ? !monthlyOtherLoanPayment.equals(that.monthlyOtherLoanPayment) : that.monthlyOtherLoanPayment != null)
            return false;
        if (monthlyFixedPayment != null ? !monthlyFixedPayment.equals(that.monthlyFixedPayment) : that.monthlyFixedPayment != null)
            return false;
        if (loanUsage != null ? !loanUsage.equals(that.loanUsage) : that.loanUsage != null) return false;
        if (otherLoanNeeds != null ? !otherLoanNeeds.equals(that.otherLoanNeeds) : that.otherLoanNeeds != null)
            return false;
        if (otherLoanType != null ? !otherLoanType.equals(that.otherLoanType) : that.otherLoanType != null)
            return false;
        if (coborrowerName != null ? !coborrowerName.equals(that.coborrowerName) : that.coborrowerName != null)
            return false;
        if (coborrowerPerId != null ? !coborrowerPerId.equals(that.coborrowerPerId) : that.coborrowerPerId != null)
            return false;
        if (coborrowerMobile != null ? !coborrowerMobile.equals(that.coborrowerMobile) : that.coborrowerMobile != null)
            return false;
        if (appLetterInd != null ? !appLetterInd.equals(that.appLetterInd) : that.appLetterInd != null) return false;
        if (perIdInd != null ? !perIdInd.equals(that.perIdInd) : that.perIdInd != null) return false;
        if (matePerIdInd != null ? !matePerIdInd.equals(that.matePerIdInd) : that.matePerIdInd != null) return false;
        if (judgeType != null ? !judgeType.equals(that.judgeType) : that.judgeType != null) return false;
        if (xgRemark != null ? !xgRemark.equals(that.xgRemark) : that.xgRemark != null) return false;
        if (incomeType != null ? !incomeType.equals(that.incomeType) : that.incomeType != null) return false;
        if (socialSecurityInd != null ? !socialSecurityInd.equals(that.socialSecurityInd) : that.socialSecurityInd != null)
            return false;
        if (mortgageContract != null ? !mortgageContract.equals(that.mortgageContract) : that.mortgageContract != null)
            return false;
        if (batchLoanContract != null ? !batchLoanContract.equals(that.batchLoanContract) : that.batchLoanContract != null)
            return false;
        if (monthlyTotalPayment != null ? !monthlyTotalPayment.equals(that.monthlyTotalPayment) : that.monthlyTotalPayment != null)
            return false;
        if (coborrowerAddress != null ? !coborrowerAddress.equals(that.coborrowerAddress) : that.coborrowerAddress != null)
            return false;
        if (haveCoborrower != null ? !haveCoborrower.equals(that.haveCoborrower) : that.haveCoborrower != null)
            return false;
        if (carUse != null ? !carUse.equals(that.carUse) : that.carUse != null) return false;
        if (coborrowerUnitName != null ? !coborrowerUnitName.equals(that.coborrowerUnitName) : that.coborrowerUnitName != null)
            return false;
        if (coborrowerEmpDepartment != null ? !coborrowerEmpDepartment.equals(that.coborrowerEmpDepartment) : that.coborrowerEmpDepartment != null)
            return false;
        if (coborrowerEmpPost != null ? !coborrowerEmpPost.equals(that.coborrowerEmpPost) : that.coborrowerEmpPost != null)
            return false;
        if (applyCarLoan != null ? !applyCarLoan.equals(that.applyCarLoan) : that.applyCarLoan != null) return false;
        if (coborrowerEmpProvince != null ? !coborrowerEmpProvince.equals(that.coborrowerEmpProvince) : that.coborrowerEmpProvince != null)
            return false;
        if (coborrowerEmpCity != null ? !coborrowerEmpCity.equals(that.coborrowerEmpCity) : that.coborrowerEmpCity != null)
            return false;
        if (drivingLicenseNo != null ? !drivingLicenseNo.equals(that.drivingLicenseNo) : that.drivingLicenseNo != null)
            return false;
        if (drivingLicenseProvince != null ? !drivingLicenseProvince.equals(that.drivingLicenseProvince) : that.drivingLicenseProvince != null)
            return false;
        if (drivingLicenseCity != null ? !drivingLicenseCity.equals(that.drivingLicenseCity) : that.drivingLicenseCity != null)
            return false;
        if (drivingLicenseCheckRes != null ? !drivingLicenseCheckRes.equals(that.drivingLicenseCheckRes) : that.drivingLicenseCheckRes != null)
            return false;
        if (abodeProvince != null ? !abodeProvince.equals(that.abodeProvince) : that.abodeProvince != null)
            return false;
        if (abodeArea != null ? !abodeArea.equals(that.abodeArea) : that.abodeArea != null) return false;
        if (abodeAddr != null ? !abodeAddr.equals(that.abodeAddr) : that.abodeAddr != null) return false;
        if (empArea != null ? !empArea.equals(that.empArea) : that.empArea != null) return false;
        if (empAddr != null ? !empAddr.equals(that.empAddr) : that.empAddr != null) return false;
        if (applyAddr != null ? !applyAddr.equals(that.applyAddr) : that.applyAddr != null) return false;
        if (residenceAddr != null ? !residenceAddr.equals(that.residenceAddr) : that.residenceAddr != null)
            return false;
        if (applyAdressProvince != null ? !applyAdressProvince.equals(that.applyAdressProvince) : that.applyAdressProvince != null)
            return false;
        if (idcardAddressProvince != null ? !idcardAddressProvince.equals(that.idcardAddressProvince) : that.idcardAddressProvince != null)
            return false;
        if (storeProvince != null ? !storeProvince.equals(that.storeProvince) : that.storeProvince != null)
            return false;
        if (storeArea != null ? !storeArea.equals(that.storeArea) : that.storeArea != null) return false;
        if (storeAddr != null ? !storeAddr.equals(that.storeAddr) : that.storeAddr != null) return false;
        if (applyAddressArea != null ? !applyAddressArea.equals(that.applyAddressArea) : that.applyAddressArea != null)
            return false;
        if (residenceProvince != null ? !residenceProvince.equals(that.residenceProvince) : that.residenceProvince != null)
            return false;
        if (residenceArea != null ? !residenceArea.equals(that.residenceArea) : that.residenceArea != null)
            return false;
        if (coborrowerEmpArea != null ? !coborrowerEmpArea.equals(that.coborrowerEmpArea) : that.coborrowerEmpArea != null)
            return false;
        if (coborrowerEmpAddr != null ? !coborrowerEmpAddr.equals(that.coborrowerEmpAddr) : that.coborrowerEmpAddr != null)
            return false;
        if (nation != null ? !nation.equals(that.nation) : that.nation != null) return false;
        if (coborrowerRelation != null ? !coborrowerRelation.equals(that.coborrowerRelation) : that.coborrowerRelation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (org != null ? org.hashCode() : 0);
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (idType != null ? idType.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (idLastDate != null ? idLastDate.hashCode() : 0);
        result = 31 * result + (idLongEffective != null ? idLongEffective.hashCode() : 0);
        result = 31 * result + (cellphone != null ? cellphone.hashCode() : 0);
        result = 31 * result + (monthIncome != null ? monthIncome.hashCode() : 0);
        result = 31 * result + (otherIncome != null ? otherIncome.hashCode() : 0);
        result = 31 * result + (yearIncome != null ? yearIncome.hashCode() : 0);
        result = 31 * result + (otherLoan != null ? otherLoan.hashCode() : 0);
        result = 31 * result + (bankCode != null ? bankCode.hashCode() : 0);
        result = 31 * result + (bankCardNo != null ? bankCardNo.hashCode() : 0);
        result = 31 * result + (bankName != null ? bankName.hashCode() : 0);
        result = 31 * result + (bankProvinceCode != null ? bankProvinceCode.hashCode() : 0);
        result = 31 * result + (bankProvinceName != null ? bankProvinceName.hashCode() : 0);
        result = 31 * result + (bankCityCode != null ? bankCityCode.hashCode() : 0);
        result = 31 * result + (bankCityName != null ? bankCityName.hashCode() : 0);
        result = 31 * result + (homePhone != null ? homePhone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (abodeCity != null ? abodeCity.hashCode() : 0);
        result = 31 * result + (qualification != null ? qualification.hashCode() : 0);
        result = 31 * result + (socialIdentity != null ? socialIdentity.hashCode() : 0);
        result = 31 * result + (workStandFrom != null ? workStandFrom.hashCode() : 0);
        result = 31 * result + (lengthOfSchooling != null ? lengthOfSchooling.hashCode() : 0);
        result = 31 * result + (yearsOfWork != null ? yearsOfWork.hashCode() : 0);
        result = 31 * result + (empStandFrom != null ? empStandFrom.hashCode() : 0);
        result = 31 * result + (unitName != null ? unitName.hashCode() : 0);
        result = 31 * result + (empDepartment != null ? empDepartment.hashCode() : 0);
        result = 31 * result + (empPost != null ? empPost.hashCode() : 0);
        result = 31 * result + (empType != null ? empType.hashCode() : 0);
        result = 31 * result + (empStructure != null ? empStructure.hashCode() : 0);
        result = 31 * result + (empPhone != null ? empPhone.hashCode() : 0);
        result = 31 * result + (empPhoneExtNum != null ? empPhoneExtNum.hashCode() : 0);
        result = 31 * result + (empProvince != null ? empProvince.hashCode() : 0);
        result = 31 * result + (empCity != null ? empCity.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (houseCondition != null ? houseCondition.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (lstUpdUser != null ? lstUpdUser.hashCode() : 0);
        result = 31 * result + (lstUpdTime != null ? lstUpdTime.hashCode() : 0);
        result = 31 * result + jpaVersion;
        result = 31 * result + (iphoeBreakout != null ? iphoeBreakout.hashCode() : 0);
        result = 31 * result + (graduationTime != null ? graduationTime.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (bankReservePhoneNumber != null ? bankReservePhoneNumber.hashCode() : 0);
        result = 31 * result + (loanDays != null ? loanDays.hashCode() : 0);
        result = 31 * result + (creditCardno != null ? creditCardno.hashCode() : 0);
        result = 31 * result + (commissionerCode != null ? commissionerCode.hashCode() : 0);
        result = 31 * result + (authenticationPassword != null ? authenticationPassword.hashCode() : 0);
        result = 31 * result + (fingerprinting != null ? fingerprinting.hashCode() : 0);
        result = 31 * result + (deviceType != null ? deviceType.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (carrierType != null ? carrierType.hashCode() : 0);
        result = 31 * result + (storeRiskercode != null ? storeRiskercode.hashCode() : 0);
        result = 31 * result + (storeRiskfingerprinting != null ? storeRiskfingerprinting.hashCode() : 0);
        result = 31 * result + (storeRisklocation != null ? storeRisklocation.hashCode() : 0);
        result = 31 * result + (storeOrg != null ? storeOrg.hashCode() : 0);
        result = 31 * result + (riskLevel != null ? riskLevel.hashCode() : 0);
        result = 31 * result + (zhimaScore != null ? zhimaScore.hashCode() : 0);
        result = 31 * result + (zhimaImg != null ? zhimaImg.hashCode() : 0);
        result = 31 * result + (deviceIp != null ? deviceIp.hashCode() : 0);
        result = 31 * result + (applyAdressCity != null ? applyAdressCity.hashCode() : 0);
        result = 31 * result + (contactsCunt != null ? contactsCunt.hashCode() : 0);
        result = 31 * result + (idcardAddressCity != null ? idcardAddressCity.hashCode() : 0);
        result = 31 * result + (wifiSsid != null ? wifiSsid.hashCode() : 0);
        result = 31 * result + (graduatedSchool != null ? graduatedSchool.hashCode() : 0);
        result = 31 * result + (storeCity != null ? storeCity.hashCode() : 0);
        result = 31 * result + (storeLocation != null ? storeLocation.hashCode() : 0);
        result = 31 * result + (contactsList != null ? contactsList.hashCode() : 0);
        result = 31 * result + (discountCode != null ? discountCode.hashCode() : 0);
        result = 31 * result + (tongDun != null ? tongDun.hashCode() : 0);
        result = 31 * result + (gpsProvince != null ? gpsProvince.hashCode() : 0);
        result = 31 * result + (gpsCity != null ? gpsCity.hashCode() : 0);
        result = 31 * result + (gpsLocation != null ? gpsLocation.hashCode() : 0);
        result = 31 * result + (workProofType != null ? workProofType.hashCode() : 0);
        result = 31 * result + (annualIncome != null ? annualIncome.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (bankCardNbr != null ? bankCardNbr.hashCode() : 0);
        result = 31 * result + (bankCardName != null ? bankCardName.hashCode() : 0);
        result = 31 * result + (loanTerm != null ? loanTerm.hashCode() : 0);
        result = 31 * result + (driverLiscence != null ? driverLiscence.hashCode() : 0);
        result = 31 * result + (residenceCity != null ? residenceCity.hashCode() : 0);
        result = 31 * result + (qqNbr != null ? qqNbr.hashCode() : 0);
        result = 31 * result + (wechatNbr != null ? wechatNbr.hashCode() : 0);
        result = 31 * result + (hrPhone != null ? hrPhone.hashCode() : 0);
        result = 31 * result + (socialSecurityYears != null ? socialSecurityYears.hashCode() : 0);
        result = 31 * result + (monthlySalary != null ? monthlySalary.hashCode() : 0);
        result = 31 * result + (supportPeople != null ? supportPeople.hashCode() : 0);
        result = 31 * result + (monthlyHousePayment != null ? monthlyHousePayment.hashCode() : 0);
        result = 31 * result + (otherLoanName != null ? otherLoanName.hashCode() : 0);
        result = 31 * result + (monthlyOtherLoanPayment != null ? monthlyOtherLoanPayment.hashCode() : 0);
        result = 31 * result + (monthlyFixedPayment != null ? monthlyFixedPayment.hashCode() : 0);
        result = 31 * result + (loanUsage != null ? loanUsage.hashCode() : 0);
        result = 31 * result + (otherLoanNeeds != null ? otherLoanNeeds.hashCode() : 0);
        result = 31 * result + (otherLoanType != null ? otherLoanType.hashCode() : 0);
        result = 31 * result + (coborrowerName != null ? coborrowerName.hashCode() : 0);
        result = 31 * result + (coborrowerPerId != null ? coborrowerPerId.hashCode() : 0);
        result = 31 * result + (coborrowerMobile != null ? coborrowerMobile.hashCode() : 0);
        result = 31 * result + (appLetterInd != null ? appLetterInd.hashCode() : 0);
        result = 31 * result + (perIdInd != null ? perIdInd.hashCode() : 0);
        result = 31 * result + (matePerIdInd != null ? matePerIdInd.hashCode() : 0);
        result = 31 * result + (judgeType != null ? judgeType.hashCode() : 0);
        result = 31 * result + (xgRemark != null ? xgRemark.hashCode() : 0);
        result = 31 * result + (incomeType != null ? incomeType.hashCode() : 0);
        result = 31 * result + (socialSecurityInd != null ? socialSecurityInd.hashCode() : 0);
        result = 31 * result + (mortgageContract != null ? mortgageContract.hashCode() : 0);
        result = 31 * result + (batchLoanContract != null ? batchLoanContract.hashCode() : 0);
        result = 31 * result + (monthlyTotalPayment != null ? monthlyTotalPayment.hashCode() : 0);
        result = 31 * result + (coborrowerAddress != null ? coborrowerAddress.hashCode() : 0);
        result = 31 * result + (haveCoborrower != null ? haveCoborrower.hashCode() : 0);
        result = 31 * result + (carUse != null ? carUse.hashCode() : 0);
        result = 31 * result + (coborrowerUnitName != null ? coborrowerUnitName.hashCode() : 0);
        result = 31 * result + (coborrowerEmpDepartment != null ? coborrowerEmpDepartment.hashCode() : 0);
        result = 31 * result + (coborrowerEmpPost != null ? coborrowerEmpPost.hashCode() : 0);
        result = 31 * result + (applyCarLoan != null ? applyCarLoan.hashCode() : 0);
        result = 31 * result + (coborrowerEmpProvince != null ? coborrowerEmpProvince.hashCode() : 0);
        result = 31 * result + (coborrowerEmpCity != null ? coborrowerEmpCity.hashCode() : 0);
        result = 31 * result + (drivingLicenseNo != null ? drivingLicenseNo.hashCode() : 0);
        result = 31 * result + (drivingLicenseProvince != null ? drivingLicenseProvince.hashCode() : 0);
        result = 31 * result + (drivingLicenseCity != null ? drivingLicenseCity.hashCode() : 0);
        result = 31 * result + (drivingLicenseCheckRes != null ? drivingLicenseCheckRes.hashCode() : 0);
        result = 31 * result + (abodeProvince != null ? abodeProvince.hashCode() : 0);
        result = 31 * result + (abodeArea != null ? abodeArea.hashCode() : 0);
        result = 31 * result + (abodeAddr != null ? abodeAddr.hashCode() : 0);
        result = 31 * result + (empArea != null ? empArea.hashCode() : 0);
        result = 31 * result + (empAddr != null ? empAddr.hashCode() : 0);
        result = 31 * result + (applyAddr != null ? applyAddr.hashCode() : 0);
        result = 31 * result + (residenceAddr != null ? residenceAddr.hashCode() : 0);
        result = 31 * result + (applyAdressProvince != null ? applyAdressProvince.hashCode() : 0);
        result = 31 * result + (idcardAddressProvince != null ? idcardAddressProvince.hashCode() : 0);
        result = 31 * result + (storeProvince != null ? storeProvince.hashCode() : 0);
        result = 31 * result + (storeArea != null ? storeArea.hashCode() : 0);
        result = 31 * result + (storeAddr != null ? storeAddr.hashCode() : 0);
        result = 31 * result + (applyAddressArea != null ? applyAddressArea.hashCode() : 0);
        result = 31 * result + (residenceProvince != null ? residenceProvince.hashCode() : 0);
        result = 31 * result + (residenceArea != null ? residenceArea.hashCode() : 0);
        result = 31 * result + (coborrowerEmpArea != null ? coborrowerEmpArea.hashCode() : 0);
        result = 31 * result + (coborrowerEmpAddr != null ? coborrowerEmpAddr.hashCode() : 0);
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (coborrowerRelation != null ? coborrowerRelation.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "CONTACT_EMP_POST")
    public String getContactEmpPost() {
        return contactEmpPost;
    }

    public void setContactEmpPost(String contactEmpPost) {
        this.contactEmpPost = contactEmpPost;
    }

    @Basic
    @Column(name = "CONTACT_EMP_DEPARTMENT")
    public String getContactEmpDepartment() {
        return contactEmpDepartment;
    }

    public void setContactEmpDepartment(String contactEmpDepartment) {
        this.contactEmpDepartment = contactEmpDepartment;
    }

    @Basic
    @Column(name = "MATE_EMP_ADD")
    public String getMateEmpAdd() {
        return mateEmpAdd;
    }

    public void setMateEmpAdd(String mateEmpAdd) {
        this.mateEmpAdd = mateEmpAdd;
    }

    @Basic
    @Column(name = "CONTACT_WORKNAME")
    public String getContactWorkname() {
        return contactWorkname;
    }

    public void setContactWorkname(String contactWorkname) {
        this.contactWorkname = contactWorkname;
    }
}
