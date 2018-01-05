package com.service.dao;

import com.service.dao.entity.TmHuifaDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 汇法网详情表 orm 操作类
 * @author linyang
 * @since 2017.01.05
 */
public interface TmHuifaDetailDao extends JpaRepository<TmHuifaDetailEntity, Integer> {
}
