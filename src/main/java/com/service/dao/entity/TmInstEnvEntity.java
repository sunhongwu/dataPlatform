package com.service.dao.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/12/13.
 */
@Entity
@Table(name = "tm_inst_env", schema = "rmpsdb_che", catalog = "")
public class TmInstEnvEntity {
    private int id;
    private String instanceId;
    private String propKey;
    private String propValue;
    private String propMemo;
    private String maskValue;
    private int jpaVersion;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "INSTANCE_ID")
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Basic
    @Column(name = "PROP_KEY")
    public String getPropKey() {
        return propKey;
    }

    public void setPropKey(String propKey) {
        this.propKey = propKey;
    }

    @Basic
    @Column(name = "PROP_VALUE")
    public String getPropValue() {
        return propValue;
    }

    public void setPropValue(String propValue) {
        this.propValue = propValue;
    }

    @Basic
    @Column(name = "PROP_MEMO")
    public String getPropMemo() {
        return propMemo;
    }

    public void setPropMemo(String propMemo) {
        this.propMemo = propMemo;
    }

    @Basic
    @Column(name = "MASK_VALUE")
    public String getMaskValue() {
        return maskValue;
    }

    public void setMaskValue(String maskValue) {
        this.maskValue = maskValue;
    }

    @Basic
    @Column(name = "JPA_VERSION")
    public int getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(int jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmInstEnvEntity that = (TmInstEnvEntity) o;

        if (id != that.id) return false;
        if (jpaVersion != that.jpaVersion) return false;
        if (instanceId != null ? !instanceId.equals(that.instanceId) : that.instanceId != null) return false;
        if (propKey != null ? !propKey.equals(that.propKey) : that.propKey != null) return false;
        if (propValue != null ? !propValue.equals(that.propValue) : that.propValue != null) return false;
        if (propMemo != null ? !propMemo.equals(that.propMemo) : that.propMemo != null) return false;
        if (maskValue != null ? !maskValue.equals(that.maskValue) : that.maskValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (instanceId != null ? instanceId.hashCode() : 0);
        result = 31 * result + (propKey != null ? propKey.hashCode() : 0);
        result = 31 * result + (propValue != null ? propValue.hashCode() : 0);
        result = 31 * result + (propMemo != null ? propMemo.hashCode() : 0);
        result = 31 * result + (maskValue != null ? maskValue.hashCode() : 0);
        result = 31 * result + jpaVersion;
        return result;
    }
}
