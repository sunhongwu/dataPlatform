package com.service.dao;

import com.service.dao.entity.TmAppMainEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * TmAppMain 表 orm 操作层
 * @author linyang
 * @since 2017.12.25
 */
public interface TmAppMainDao extends JpaRepository<TmAppMainEntity, Integer> {

    /**
     * 根据订单编号 查询订单信息
     * @param appNo
     * @return
     */
    public TmAppMainEntity findByAppNo( String appNo );


}
