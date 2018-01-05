package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/12/7.
 */
@Entity
@Table(name = "tm_sms_template", schema = "rmpsdb_che", catalog = "")
public class TmSmsTemplateEntity {
    private int id;
    private String templateCode;
    private String template;
    private String lstUpdateUser;
    private Timestamp lstUpdateTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TEMPLATE_CODE")
    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    @Basic
    @Column(name = "TEMPLATE")
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Basic
    @Column(name = "LST_UPDATE_USER")
    public String getLstUpdateUser() {
        return lstUpdateUser;
    }

    public void setLstUpdateUser(String lstUpdateUser) {
        this.lstUpdateUser = lstUpdateUser;
    }

    @Basic
    @Column(name = "LST_UPDATE_TIME")
    public Timestamp getLstUpdateTime() {
        return lstUpdateTime;
    }

    public void setLstUpdateTime(Timestamp lstUpdateTime) {
        this.lstUpdateTime = lstUpdateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmSmsTemplateEntity that = (TmSmsTemplateEntity) o;

        if (id != that.id) return false;
        if (templateCode != null ? !templateCode.equals(that.templateCode) : that.templateCode != null) return false;
        if (template != null ? !template.equals(that.template) : that.template != null) return false;
        if (lstUpdateUser != null ? !lstUpdateUser.equals(that.lstUpdateUser) : that.lstUpdateUser != null)
            return false;
        if (lstUpdateTime != null ? !lstUpdateTime.equals(that.lstUpdateTime) : that.lstUpdateTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (templateCode != null ? templateCode.hashCode() : 0);
        result = 31 * result + (template != null ? template.hashCode() : 0);
        result = 31 * result + (lstUpdateUser != null ? lstUpdateUser.hashCode() : 0);
        result = 31 * result + (lstUpdateTime != null ? lstUpdateTime.hashCode() : 0);
        return result;
    }
}
