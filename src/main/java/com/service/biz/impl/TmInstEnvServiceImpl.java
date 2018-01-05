package com.service.biz.impl;

import com.service.biz.ITmInstEnvService;
import com.service.dao.TmInstEnvDao;
import com.service.dao.entity.TmInstEnvEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统环境变量Service
 * @author linyang
 * @since 2017.12.13
 */
@Service
public class TmInstEnvServiceImpl implements ITmInstEnvService {

    @Autowired
    private TmInstEnvDao tmInstEnvDao;


    /**
     * 根据条件查询系统环境变量信息列表 不分页
     * @param instanceId    当前系统实例id
     * @param maskValue     环境变量启用状态
     * @return
     */
    @Override
    public List<TmInstEnvEntity> finfByParams( String instanceId, String maskValue ) {
        return tmInstEnvDao.finfByParams( instanceId, maskValue );
    }
}
