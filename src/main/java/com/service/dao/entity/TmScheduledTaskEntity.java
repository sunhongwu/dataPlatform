package com.service.dao.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Administrator on 2017/12/1.
 */
@Entity
@Table(name = "tm_scheduled_task", schema = "rmpsdb_che", catalog = "")
public class TmScheduledTaskEntity {
    private int id;
    private String model;
    private String runners;
    private String targetClass;
    private Integer intervalTime;
    private Integer delayTime;
    private Integer isRunning;
    private Time startTime;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MODEL")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Basic
    @Column(name = "RUNNERS")
    public String getRunners() {
        return runners;
    }

    public void setRunners(String runners) {
        this.runners = runners;
    }

    @Basic
    @Column(name = "TARGET_CLASS")
    public String getTargetClass() {
        return targetClass;
    }

    public void setTargetClass(String targetClass) {
        this.targetClass = targetClass;
    }

    @Basic
    @Column(name = "INTERVAL_TIME")
    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    @Basic
    @Column(name = "DELAY_TIME")
    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    @Basic
    @Column(name = "IS_RUNNING")
    public Integer getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(Integer isRunning) {
        this.isRunning = isRunning;
    }

    @Basic
    @Column(name = "START_TIME")
    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TmScheduledTaskEntity that = (TmScheduledTaskEntity) o;

        if (id != that.id) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (runners != null ? !runners.equals(that.runners) : that.runners != null) return false;
        if (targetClass != null ? !targetClass.equals(that.targetClass) : that.targetClass != null) return false;
        if (intervalTime != null ? !intervalTime.equals(that.intervalTime) : that.intervalTime != null) return false;
        if (delayTime != null ? !delayTime.equals(that.delayTime) : that.delayTime != null) return false;
        if (isRunning != null ? !isRunning.equals(that.isRunning) : that.isRunning != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (runners != null ? runners.hashCode() : 0);
        result = 31 * result + (targetClass != null ? targetClass.hashCode() : 0);
        result = 31 * result + (intervalTime != null ? intervalTime.hashCode() : 0);
        result = 31 * result + (delayTime != null ? delayTime.hashCode() : 0);
        result = 31 * result + (isRunning != null ? isRunning.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        return result;
    }
}
