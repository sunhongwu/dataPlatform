package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/1/3.
 */
@Entity
@Table(name = "tm_tongdun_policy", schema = "rmpsdb_che", catalog = "")
public class TmTongdunPolicyEntity {
    private int id;
    private String appNo;
    private String finalDecision;
    private Integer finalScore;
    private String policyName;
    private String policySetName;
    private String riskType;
    private String seqId;
    private Integer spendTime;
    private String reasonCode;
    private String success;
    private String linkRelation;
    private String idNo;
    private String name;
    private Timestamp createTime;
    private String cellPhone;
    private String inUse;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "FINAL_DECISION")
    public String getFinalDecision() {
        return finalDecision;
    }

    public void setFinalDecision(String finalDecision) {
        this.finalDecision = finalDecision;
    }

    @Basic
    @Column(name = "FINAL_SCORE")
    public Integer getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Integer finalScore) {
        this.finalScore = finalScore;
    }

    @Basic
    @Column(name = "POLICY_NAME")
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    @Basic
    @Column(name = "POLICY_SET_NAME")
    public String getPolicySetName() {
        return policySetName;
    }

    public void setPolicySetName(String policySetName) {
        this.policySetName = policySetName;
    }

    @Basic
    @Column(name = "RISK_TYPE")
    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType;
    }

    @Basic
    @Column(name = "SEQ_ID")
    public String getSeqId() {
        return seqId;
    }

    public void setSeqId(String seqId) {
        this.seqId = seqId;
    }

    @Basic
    @Column(name = "SPEND_TIME")
    public Integer getSpendTime() {
        return spendTime;
    }

    public void setSpendTime(Integer spendTime) {
        this.spendTime = spendTime;
    }

    @Basic
    @Column(name = "REASON_CODE")
    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    @Basic
    @Column(name = "SUCCESS")
    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    @Basic
    @Column(name = "LINK_RELATION")
    public String getLinkRelation() {
        return linkRelation;
    }

    public void setLinkRelation(String linkRelation) {
        this.linkRelation = linkRelation;
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
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "CELL_PHONE")
    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Basic
    @Column(name = "IN_USE")
    public String getInUse() {
        return inUse;
    }

    public void setInUse(String inUse) {
        this.inUse = inUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTongdunPolicyEntity that = (TmTongdunPolicyEntity) o;

        if (id != that.id) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (finalDecision != null ? !finalDecision.equals(that.finalDecision) : that.finalDecision != null)
            return false;
        if (finalScore != null ? !finalScore.equals(that.finalScore) : that.finalScore != null) return false;
        if (policyName != null ? !policyName.equals(that.policyName) : that.policyName != null) return false;
        if (policySetName != null ? !policySetName.equals(that.policySetName) : that.policySetName != null)
            return false;
        if (riskType != null ? !riskType.equals(that.riskType) : that.riskType != null) return false;
        if (seqId != null ? !seqId.equals(that.seqId) : that.seqId != null) return false;
        if (spendTime != null ? !spendTime.equals(that.spendTime) : that.spendTime != null) return false;
        if (reasonCode != null ? !reasonCode.equals(that.reasonCode) : that.reasonCode != null) return false;
        if (success != null ? !success.equals(that.success) : that.success != null) return false;
        if (linkRelation != null ? !linkRelation.equals(that.linkRelation) : that.linkRelation != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (cellPhone != null ? !cellPhone.equals(that.cellPhone) : that.cellPhone != null) return false;
        if (inUse != null ? !inUse.equals(that.inUse) : that.inUse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (finalDecision != null ? finalDecision.hashCode() : 0);
        result = 31 * result + (finalScore != null ? finalScore.hashCode() : 0);
        result = 31 * result + (policyName != null ? policyName.hashCode() : 0);
        result = 31 * result + (policySetName != null ? policySetName.hashCode() : 0);
        result = 31 * result + (riskType != null ? riskType.hashCode() : 0);
        result = 31 * result + (seqId != null ? seqId.hashCode() : 0);
        result = 31 * result + (spendTime != null ? spendTime.hashCode() : 0);
        result = 31 * result + (reasonCode != null ? reasonCode.hashCode() : 0);
        result = 31 * result + (success != null ? success.hashCode() : 0);
        result = 31 * result + (linkRelation != null ? linkRelation.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (cellPhone != null ? cellPhone.hashCode() : 0);
        result = 31 * result + (inUse != null ? inUse.hashCode() : 0);
        return result;
    }
}
