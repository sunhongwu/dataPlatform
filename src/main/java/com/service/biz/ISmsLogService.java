package com.service.biz;

import com.service.dao.entity.TmSmsLogEntity;
import org.springframework.stereotype.Component;

/**
 * 短信历史纪录服务
 * @author linyang
 * @since 2017.12.07
 */
@Component
public interface ISmsLogService {

    /**
     * 保存或修改短信记录
     * @param tmSmsLogEntity
     * @return
     */
    public TmSmsLogEntity save( TmSmsLogEntity tmSmsLogEntity );

}
