package com.service.biz;

import com.service.dao.entity.TmSmsTemplateEntity;
import org.springframework.stereotype.Component;

/**
 * 短信模板服务
 * @author linyang
 * @since 2017.12.06
 */
@Component
public interface ISmsTemplateService {

    /**
     * 根据短信模板编码获取模板数据
     * @param templateCode  短信模板编码
     * @return
     */
    public TmSmsTemplateEntity findByTemplateCode(String templateCode );
}
