package com.service.biz.impl;

import com.service.biz.ISmsTemplateService;
import com.service.dao.TmSmsTemplateDao;
import com.service.dao.entity.TmSmsTemplateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 短信模板服务实现类
 * @author linyang
 * @since 2017.12.06
 */
@Service
public class SmsTemplateServiceImpl implements ISmsTemplateService {

    @Autowired
    private TmSmsTemplateDao tmSmsTemplateDao;


    /**
     * 根据短信模板编码获取模板数据
     *
     * @param templateCode 短信模板编码
     * @return
     */
    @Override
    public TmSmsTemplateEntity findByTemplateCode(String templateCode) {
        return tmSmsTemplateDao.findByTemplateCode( templateCode );
    }
}
