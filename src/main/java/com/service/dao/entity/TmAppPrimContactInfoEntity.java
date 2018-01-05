package com.service.dao.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
@Table(name = "tm_app_prim_contact_info", schema = "rmpsdb_che", catalog = "")
public class TmAppPrimContactInfoEntity {
    private int id;
    private String org;
    private String appNo;
    private String contactName;
    private String contactGender;
    private String contactRelation;
    private String contactMobile;
    private Timestamp createTime;
    private String createUser;
    private Timestamp lstUpdTime;
    private String lstUpdUser;
    private int jpaVersion;
    private String telSource;
    private String deleteFlag;
    private String remark;
    private String contactWorknature;
    private String contactWorkname;
    private String contactChildNumber;
    private String contactPersonalId;
    private String mateEmpProvince;
    private String mateEmpCity;
    private String mateEmpPhone;
    private BigDecimal mateMonthlySalary;
    private BigDecimal mateOtherIncome;
    private String matePerIdInd;
    private String memo;
    private String contactEmpPost;
    private String contactEmpDepartment;
    private String contactFrom;
    private String applyAddr;
    private String contactAddr;
    private String mateEmpArea;
    private String mateEmpAddr;

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
    @Column(name = "CONTACT_NAME")
    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    @Basic
    @Column(name = "CONTACT_GENDER")
    public String getContactGender() {
        return contactGender;
    }

    public void setContactGender(String contactGender) {
        this.contactGender = contactGender;
    }

    @Basic
    @Column(name = "CONTACT_RELATION")
    public String getContactRelation() {
        return contactRelation;
    }

    public void setContactRelation(String contactRelation) {
        this.contactRelation = contactRelation;
    }

    @Basic
    @Column(name = "CONTACT_MOBILE")
    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
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
    @Column(name = "TEL_SOURCE")
    public String getTelSource() {
        return telSource;
    }

    public void setTelSource(String telSource) {
        this.telSource = telSource;
    }

    @Basic
    @Column(name = "DELETE_FLAG")
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
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
    @Column(name = "CONTACT_WORKNATURE")
    public String getContactWorknature() {
        return contactWorknature;
    }

    public void setContactWorknature(String contactWorknature) {
        this.contactWorknature = contactWorknature;
    }

    @Basic
    @Column(name = "CONTACT_WORKNAME")
    public String getContactWorkname() {
        return contactWorkname;
    }

    public void setContactWorkname(String contactWorkname) {
        this.contactWorkname = contactWorkname;
    }

    @Basic
    @Column(name = "CONTACT_CHILD_NUMBER")
    public String getContactChildNumber() {
        return contactChildNumber;
    }

    public void setContactChildNumber(String contactChildNumber) {
        this.contactChildNumber = contactChildNumber;
    }

    @Basic
    @Column(name = "CONTACT_PERSONAL_ID")
    public String getContactPersonalId() {
        return contactPersonalId;
    }

    public void setContactPersonalId(String contactPersonalId) {
        this.contactPersonalId = contactPersonalId;
    }

    @Basic
    @Column(name = "MATE_EMP_PROVINCE")
    public String getMateEmpProvince() {
        return mateEmpProvince;
    }

    public void setMateEmpProvince(String mateEmpProvince) {
        this.mateEmpProvince = mateEmpProvince;
    }

    @Basic
    @Column(name = "MATE_EMP_CITY")
    public String getMateEmpCity() {
        return mateEmpCity;
    }

    public void setMateEmpCity(String mateEmpCity) {
        this.mateEmpCity = mateEmpCity;
    }

    @Basic
    @Column(name = "MATE_EMP_PHONE")
    public String getMateEmpPhone() {
        return mateEmpPhone;
    }

    public void setMateEmpPhone(String mateEmpPhone) {
        this.mateEmpPhone = mateEmpPhone;
    }

    @Basic
    @Column(name = "MATE_MONTHLY_SALARY")
    public BigDecimal getMateMonthlySalary() {
        return mateMonthlySalary;
    }

    public void setMateMonthlySalary(BigDecimal mateMonthlySalary) {
        this.mateMonthlySalary = mateMonthlySalary;
    }

    @Basic
    @Column(name = "MATE_OTHER_INCOME")
    public BigDecimal getMateOtherIncome() {
        return mateOtherIncome;
    }

    public void setMateOtherIncome(BigDecimal mateOtherIncome) {
        this.mateOtherIncome = mateOtherIncome;
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
    @Column(name = "MEMO")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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
    @Column(name = "CONTACT_FROM")
    public String getContactFrom() {
        return contactFrom;
    }

    public void setContactFrom(String contactFrom) {
        this.contactFrom = contactFrom;
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
    @Column(name = "CONTACT_ADDR")
    public String getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    @Basic
    @Column(name = "MATE_EMP_AREA")
    public String getMateEmpArea() {
        return mateEmpArea;
    }

    public void setMateEmpArea(String mateEmpArea) {
        this.mateEmpArea = mateEmpArea;
    }

    @Basic
    @Column(name = "MATE_EMP_ADDR")
    public String getMateEmpAddr() {
        return mateEmpAddr;
    }

    public void setMateEmpAddr(String mateEmpAddr) {
        this.mateEmpAddr = mateEmpAddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmAppPrimContactInfoEntity that = (TmAppPrimContactInfoEntity) o;

        if (id != that.id) return false;
        if (jpaVersion != that.jpaVersion) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (contactName != null ? !contactName.equals(that.contactName) : that.contactName != null) return false;
        if (contactGender != null ? !contactGender.equals(that.contactGender) : that.contactGender != null)
            return false;
        if (contactRelation != null ? !contactRelation.equals(that.contactRelation) : that.contactRelation != null)
            return false;
        if (contactMobile != null ? !contactMobile.equals(that.contactMobile) : that.contactMobile != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createUser != null ? !createUser.equals(that.createUser) : that.createUser != null) return false;
        if (lstUpdTime != null ? !lstUpdTime.equals(that.lstUpdTime) : that.lstUpdTime != null) return false;
        if (lstUpdUser != null ? !lstUpdUser.equals(that.lstUpdUser) : that.lstUpdUser != null) return false;
        if (telSource != null ? !telSource.equals(that.telSource) : that.telSource != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (contactWorknature != null ? !contactWorknature.equals(that.contactWorknature) : that.contactWorknature != null)
            return false;
        if (contactWorkname != null ? !contactWorkname.equals(that.contactWorkname) : that.contactWorkname != null)
            return false;
        if (contactChildNumber != null ? !contactChildNumber.equals(that.contactChildNumber) : that.contactChildNumber != null)
            return false;
        if (contactPersonalId != null ? !contactPersonalId.equals(that.contactPersonalId) : that.contactPersonalId != null)
            return false;
        if (mateEmpProvince != null ? !mateEmpProvince.equals(that.mateEmpProvince) : that.mateEmpProvince != null)
            return false;
        if (mateEmpCity != null ? !mateEmpCity.equals(that.mateEmpCity) : that.mateEmpCity != null) return false;
        if (mateEmpPhone != null ? !mateEmpPhone.equals(that.mateEmpPhone) : that.mateEmpPhone != null) return false;
        if (mateMonthlySalary != null ? !mateMonthlySalary.equals(that.mateMonthlySalary) : that.mateMonthlySalary != null)
            return false;
        if (mateOtherIncome != null ? !mateOtherIncome.equals(that.mateOtherIncome) : that.mateOtherIncome != null)
            return false;
        if (matePerIdInd != null ? !matePerIdInd.equals(that.matePerIdInd) : that.matePerIdInd != null) return false;
        if (memo != null ? !memo.equals(that.memo) : that.memo != null) return false;
        if (contactEmpPost != null ? !contactEmpPost.equals(that.contactEmpPost) : that.contactEmpPost != null)
            return false;
        if (contactEmpDepartment != null ? !contactEmpDepartment.equals(that.contactEmpDepartment) : that.contactEmpDepartment != null)
            return false;
        if (contactFrom != null ? !contactFrom.equals(that.contactFrom) : that.contactFrom != null) return false;
        if (applyAddr != null ? !applyAddr.equals(that.applyAddr) : that.applyAddr != null) return false;
        if (contactAddr != null ? !contactAddr.equals(that.contactAddr) : that.contactAddr != null) return false;
        if (mateEmpArea != null ? !mateEmpArea.equals(that.mateEmpArea) : that.mateEmpArea != null) return false;
        if (mateEmpAddr != null ? !mateEmpAddr.equals(that.mateEmpAddr) : that.mateEmpAddr != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (org != null ? org.hashCode() : 0);
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (contactName != null ? contactName.hashCode() : 0);
        result = 31 * result + (contactGender != null ? contactGender.hashCode() : 0);
        result = 31 * result + (contactRelation != null ? contactRelation.hashCode() : 0);
        result = 31 * result + (contactMobile != null ? contactMobile.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUser != null ? createUser.hashCode() : 0);
        result = 31 * result + (lstUpdTime != null ? lstUpdTime.hashCode() : 0);
        result = 31 * result + (lstUpdUser != null ? lstUpdUser.hashCode() : 0);
        result = 31 * result + jpaVersion;
        result = 31 * result + (telSource != null ? telSource.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (contactWorknature != null ? contactWorknature.hashCode() : 0);
        result = 31 * result + (contactWorkname != null ? contactWorkname.hashCode() : 0);
        result = 31 * result + (contactChildNumber != null ? contactChildNumber.hashCode() : 0);
        result = 31 * result + (contactPersonalId != null ? contactPersonalId.hashCode() : 0);
        result = 31 * result + (mateEmpProvince != null ? mateEmpProvince.hashCode() : 0);
        result = 31 * result + (mateEmpCity != null ? mateEmpCity.hashCode() : 0);
        result = 31 * result + (mateEmpPhone != null ? mateEmpPhone.hashCode() : 0);
        result = 31 * result + (mateMonthlySalary != null ? mateMonthlySalary.hashCode() : 0);
        result = 31 * result + (mateOtherIncome != null ? mateOtherIncome.hashCode() : 0);
        result = 31 * result + (matePerIdInd != null ? matePerIdInd.hashCode() : 0);
        result = 31 * result + (memo != null ? memo.hashCode() : 0);
        result = 31 * result + (contactEmpPost != null ? contactEmpPost.hashCode() : 0);
        result = 31 * result + (contactEmpDepartment != null ? contactEmpDepartment.hashCode() : 0);
        result = 31 * result + (contactFrom != null ? contactFrom.hashCode() : 0);
        result = 31 * result + (applyAddr != null ? applyAddr.hashCode() : 0);
        result = 31 * result + (contactAddr != null ? contactAddr.hashCode() : 0);
        result = 31 * result + (mateEmpArea != null ? mateEmpArea.hashCode() : 0);
        result = 31 * result + (mateEmpAddr != null ? mateEmpAddr.hashCode() : 0);
        return result;
    }
}
