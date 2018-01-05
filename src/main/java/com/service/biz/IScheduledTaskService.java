package com.service.biz;

import com.service.dao.entity.TmScheduledTaskEntity;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定时任务业务逻辑操作接口
 * @author linyang
 * @since 2017.12.01
 */
@Component
public interface IScheduledTaskService {

    /**
     * 获取全部定时任务信息
     * @return
     */
    public List<TmScheduledTaskEntity> findAll();

}
