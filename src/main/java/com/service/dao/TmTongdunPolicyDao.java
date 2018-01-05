package com.service.dao;

import com.service.dao.entity.TmTongdunPolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * tm_tongdun_policy 表 orm 操作对象
 * @author linyang
 * @since 2018.01.03
 */
public interface TmTongdunPolicyDao extends JpaRepository<TmTongdunPolicyEntity, Integer> {
}
