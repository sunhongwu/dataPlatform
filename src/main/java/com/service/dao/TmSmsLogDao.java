package com.service.dao;

import com.service.dao.entity.TmSmsLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 短信操作记录表操作类
 * @author linyang
 * @since 2017.12.07
 */
public interface TmSmsLogDao extends JpaRepository<TmSmsLogEntity, Integer> {
}
