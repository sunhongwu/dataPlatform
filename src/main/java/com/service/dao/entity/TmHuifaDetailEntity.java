package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
@Table(name = "tm_huifa_detail", schema = "rmpsdb_che", catalog = "")
public class TmHuifaDetailEntity {
    private int id;
    private String appNo;
    private String idNo;
    private String name;
    private String ruleId;
    private String typeT;
    private String typeTName;
    private String title;
    private String happenedTime;
    private String money;
    private String wlMoney;
    private Timestamp createTime;
    private Integer inUse;
    private String success;
    private String linkRelation;

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
    @Column(name = "TYPE_T")
    public String getTypeT() {
        return typeT;
    }

    public void setTypeT(String typeT) {
        this.typeT = typeT;
    }

    @Basic
    @Column(name = "TYPE_T_NAME")
    public String getTypeTName() {
        return typeTName;
    }

    public void setTypeTName(String typeTName) {
        this.typeTName = typeTName;
    }

    @Basic
    @Column(name = "TITLE")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "HAPPENED_TIME")
    public String getHappenedTime() {
        return happenedTime;
    }

    public void setHappenedTime(String happenedTime) {
        this.happenedTime = happenedTime;
    }

    @Basic
    @Column(name = "MONEY")
    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Basic
    @Column(name = "WL_MONEY")
    public String getWlMoney() {
        return wlMoney;
    }

    public void setWlMoney(String wlMoney) {
        this.wlMoney = wlMoney;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmHuifaDetailEntity that = (TmHuifaDetailEntity) o;

        if (id != that.id) return false;
        if (appNo != null ? !appNo.equals(that.appNo) : that.appNo != null) return false;
        if (idNo != null ? !idNo.equals(that.idNo) : that.idNo != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ruleId != null ? !ruleId.equals(that.ruleId) : that.ruleId != null) return false;
        if (typeT != null ? !typeT.equals(that.typeT) : that.typeT != null) return false;
        if (typeTName != null ? !typeTName.equals(that.typeTName) : that.typeTName != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (happenedTime != null ? !happenedTime.equals(that.happenedTime) : that.happenedTime != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;
        if (wlMoney != null ? !wlMoney.equals(that.wlMoney) : that.wlMoney != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (inUse != null ? !inUse.equals(that.inUse) : that.inUse != null) return false;
        if (success != null ? !success.equals(that.success) : that.success != null) return false;
        if (linkRelation != null ? !linkRelation.equals(that.linkRelation) : that.linkRelation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (appNo != null ? appNo.hashCode() : 0);
        result = 31 * result + (idNo != null ? idNo.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ruleId != null ? ruleId.hashCode() : 0);
        result = 31 * result + (typeT != null ? typeT.hashCode() : 0);
        result = 31 * result + (typeTName != null ? typeTName.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (happenedTime != null ? happenedTime.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        result = 31 * result + (wlMoney != null ? wlMoney.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (inUse != null ? inUse.hashCode() : 0);
        result = 31 * result + (success != null ? success.hashCode() : 0);
        result = 31 * result + (linkRelation != null ? linkRelation.hashCode() : 0);
        return result;
    }
}
