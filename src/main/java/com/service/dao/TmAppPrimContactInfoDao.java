package com.service.dao;

import com.service.dao.entity.TmAppPrimContactInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * tm_app_prim_contact_info 表 orm 层操作类
 * @author linyang
 * @since 2017.12.25
 */
public interface TmAppPrimContactInfoDao extends JpaRepository<TmAppPrimContactInfoEntity, Integer> {

    /**
     * 根据订单编号获取对应的联系人信息列表
     * @param appNo
     * @return
     */
    public List<TmAppPrimContactInfoEntity> findAllByAppNo( String appNo );

    /**
     * 根据 订单编号 联系人来源 查询联系人信息
     * @param appNo
     * @param contactFrom
     * @return
     */
    public List<TmAppPrimContactInfoEntity> findAllByAppNoAndContactFrom( String appNo, String contactFrom );

    /**
     * 根据 订单编号 联系人关系 联系人来源 查询联系人信息
     * @param appNo
     * @param contactRelation
     * @param contactFrom
     * @return
     */
    public TmAppPrimContactInfoEntity findByAppNoAndContactRelationAndContactFrom( String appNo, String contactRelation, String contactFrom );


}
