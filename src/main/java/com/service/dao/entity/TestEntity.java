package com.service.dao.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/11/21.
 */
@Entity
@Table(name = "test", schema = "rmpsdb_che", catalog = "")
public class TestEntity implements Serializable {
    private int id;
    private String a;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "a")
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestEntity that = (TestEntity) o;

        if (id != that.id) return false;
        if (a != null ? !a.equals(that.a) : that.a != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (a != null ? a.hashCode() : 0);
        return result;
    }
}
