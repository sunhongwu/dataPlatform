package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/1/3.
 */
@Entity
@Table(name = "tm_tongdun_hit_detail", schema = "rmpsdb_che", catalog = "")
public class TmTongdunHitDetailEntity {
    private int id;
    private String appNo;
    private String idNo;
    private String name;
    private String ruleId;
    private Integer score;
    private String conditions;
    private Integer inUse;
    private String success;
    private String linkRelation;
    private Timestamp createTime;

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
    @Column(name = "RULE_ID")
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    @Basic
    @Column(name = "SCORE")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "CONDITIONS")
    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    @Basic
    @Column(name = "IN_USE")
    public Integer getInUse() {
        return inUse;
    }

    public void setInUse(Integer inUse) {
        this.inUse = inUse;
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
    @Column(name = "CREATE_TIME")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmTongdunHitDetailEntity that = (TmTongdunHitDetailEntity) o;

        if (id != that.id) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (conditions != null ? !conditions.equals(that.conditions) : that.conditions != null) return false;
        if (inUse != null ? !inUse.equals(that.inUse) : that.inUse != null) return false;
        if (success != null ? !success.equals(that.success) : that.success != null) return false;
        if (linkRelation != null ? !linkRelation.equals(that.linkRelation) : that.linkRelation != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (conditions != null ? conditions.hashCode() : 0);
        result = 31 * result + (inUse != null ? inUse.hashCode() : 0);
        result = 31 * result + (success != null ? success.hashCode() : 0);
        result = 31 * result + (linkRelation != null ? linkRelation.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
