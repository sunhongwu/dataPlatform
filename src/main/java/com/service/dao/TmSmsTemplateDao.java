package com.service.dao;

import com.service.dao.entity.TmSmsTemplateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 短信模板操作类
 * @author linyang
 * @since 2017.12.06
 */
public interface TmSmsTemplateDao extends JpaRepository<TmSmsTemplateEntity, Integer> {

    /**
     * 根据短信模板编码获取模板数据
     * @param templateCode  短信模板编码
     * @return
     */
    public TmSmsTemplateEntity findByTemplateCode( String templateCode );

}
