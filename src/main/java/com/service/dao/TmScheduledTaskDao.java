package com.service.dao;

import com.service.dao.entity.TmScheduledTaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 定时任务信息表操作类
 * @author linyang
 * @since 2017.12.01
 */
public interface TmScheduledTaskDao extends JpaRepository<TmScheduledTaskEntity, Integer> {
}
