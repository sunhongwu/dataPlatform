package com.service.svc.obtainAppNoSvc;

import com.service.biz.impl.GeneratorServiceImpl;
import com.service.dao.TmAppnoSeqDao;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.svc.AbstractSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取进件单号
 * @author linyang
 * @since 2017.12.24
 */
@Component
public class ObtainAppNoSvc extends AbstractSvc{

    /** 用于操作订单序列号的存储 */
    @Autowired
    private GeneratorServiceImpl generatorService;

    /**
     * 获取进件单号
     */
    @Override
    public Object doSvc( UnifiedServiceDoc params ) {
        return generatorService.getAppNo();
    }
}
