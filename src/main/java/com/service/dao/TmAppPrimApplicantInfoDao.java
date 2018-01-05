package com.service.dao;

import com.service.dao.entity.TmAppPrimApplicantInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * tm_app_prim_applicant_info 表 orm 层操作i类
 * @author linyang
 * @since 2017.12.25
 */
public interface TmAppPrimApplicantInfoDao extends JpaRepository<TmAppPrimApplicantInfoEntity, Integer> {

    /**
     * 根据订单编号查询对应的申请信息
     * @param appNo
     * @return
     */
    public TmAppPrimApplicantInfoEntity findByAppNo( String appNo );

}
