package com.service.biz.impl;

import com.service.biz.IScheduledTaskService;
import com.service.dao.TmScheduledTaskDao;
import com.service.dao.entity.TmScheduledTaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 定时任务业务逻辑操作实现
 * @author linyang
 * @since 2017.12.01
 */
@Service
public class ScheduledTaskServiceImpl implements IScheduledTaskService {

    @Autowired
    private TmScheduledTaskDao tmScheduledTaskDao;


    /**
     * 获取全部定时任务信息
     * @return
     */
    @Override
    public List<TmScheduledTaskEntity> findAll() {
        return tmScheduledTaskDao.findAll();
    }
}
