package com.service.svc.pcApplyLoan;

import com.service.biz.IPCApplyLoanService;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.svc.AbstractSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 美易车PC端进件接口
 * @author linyang
 * @since 2017.12.21
 */
@SuppressWarnings("ALL")
@Component
public class MyCheGomeApplyLoanSvc extends AbstractSvc<PCApplyLoanRequest>{

    @Autowired
    private IPCApplyLoanService ipcApplyLoanService;

    /**
     * 抽象方法 执行业务
     * @param params
     * @return
     */
    @Override
    public Object doSvc( UnifiedServiceDoc<PCApplyLoanRequest> params ) {
        PCApplyLoanRequest request = params.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest();

        String appNo = request.getAppNo();

        logger.info( "开始执行美车初次进件接口 appNo[{}]", request.getAppNo() );

        ipcApplyLoanService.doProcess( params );

        return null;
    }

}
