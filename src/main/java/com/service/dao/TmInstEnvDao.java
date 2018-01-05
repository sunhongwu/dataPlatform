package com.service.dao;

import com.service.dao.entity.TmInstEnvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * 系统环境变量Dao
 * @author linyang
 * @since 2017.12.13
 */
public interface TmInstEnvDao extends JpaRepository<TmInstEnvEntity, Integer> {

    /**
     * 根据条件查询系统环境变量信息列表 不分页
     * @param instanceId    当前系统实例id
     * @param maskValue     环境变量启用状态
     * @return
     */
    @Query( value = "select t.ID, t.INSTANCE_ID, t.JPA_VERSION, t.MASK_VALUE, t.PROP_KEY, t.PROP_MEMO, t.PROP_VALUE " +
            "from tm_inst_env t where t.INSTANCE_ID = ?1 and t.MASK_VALUE = ?2", nativeQuery = true )
    public List<TmInstEnvEntity> finfByParams( String instanceId, String maskValue );

}
