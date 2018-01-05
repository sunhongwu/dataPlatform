package com.service.biz;

import com.service.dao.entity.TmInstEnvEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 系统环境变量Service
 * @author linyang
 * @since 2017.12.13
 */
@Component
public interface ITmInstEnvService {

    /**
     * 根据条件查询系统环境变量信息列表 不分页
     * @param instanceId    当前系统实例id
     * @param maskValue     环境变量启用状态
     * @return
     */
    public List<TmInstEnvEntity> finfByParams( String instanceId, String maskValue );

}
