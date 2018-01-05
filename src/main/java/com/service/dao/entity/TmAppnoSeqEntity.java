package com.service.dao.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/12/24.
 */
@Entity
@Table(name = "tm_appno_seq", schema = "rmpsdb_che", catalog = "")
public class TmAppnoSeqEntity {
    private String org;
    private int seq;
    private Integer jpaVersion;

    @Basic
    @Column(name = "ORG")
    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    @Id
    @Column(name = "SEQ")
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    @Basic
    @Column(name = "JPA_VERSION")
    public Integer getJpaVersion() {
        return jpaVersion;
    }

    public void setJpaVersion(Integer jpaVersion) {
        this.jpaVersion = jpaVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmAppnoSeqEntity that = (TmAppnoSeqEntity) o;

        if (seq != that.seq) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;
        if (jpaVersion != null ? !jpaVersion.equals(that.jpaVersion) : that.jpaVersion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = org != null ? org.hashCode() : 0;
        result = 31 * result + seq;
        result = 31 * result + (jpaVersion != null ? jpaVersion.hashCode() : 0);
        return result;
    }
}
