package com.service.biz.impl;

import com.service.biz.ISmsLogService;
import com.service.dao.TmSmsLogDao;
import com.service.dao.entity.TmSmsLogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 短信历史纪录服务
 * @author linyang
 * @since 2017.12.07
 */
@Service
public class SmsLogServiceImpl implements ISmsLogService {

    /**
     * 短信发送历史持久化层
     */
    @Autowired
    private TmSmsLogDao tmSmsLogDao;


    /**
     * 保存或修改短信记录
     * @param tmSmsLogEntity
     * @return
     */
    @Override
    public TmSmsLogEntity save(TmSmsLogEntity tmSmsLogEntity) {
        return tmSmsLogDao.save( tmSmsLogEntity );
    }
}
