package com.service.dao;

import com.service.dao.entity.TmVehicleInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * tm_vehicle_info 表 orm 层 操作类
 * @author linyang
 * @since 2017.12.25
 */
public interface TmVehicleInfoDao extends JpaRepository<TmVehicleInfoEntity, Integer> {

    /**
     * 根据订单编号 获取车辆信息
     * @param appNo
     * @return
     */
    public TmVehicleInfoEntity findByAppNo( String appNo );

}
