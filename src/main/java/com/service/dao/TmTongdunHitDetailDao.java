package com.service.dao;

import com.service.dao.entity.TmTongdunHitDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * tm_tongdun_hit_detail 表 orm 操作层
 * @author linyang
 * @since 2017.01.03
 */
public interface TmTongdunHitDetailDao extends JpaRepository<TmTongdunHitDetailEntity, Integer> {
}
