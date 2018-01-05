package com.service.biz;

import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.svc.pcApplyLoan.PCApplyLoanRequest;
import org.springframework.stereotype.Component;

/**
 * 美易车PC端进件服务
 * @author linyang
 * @since 2017.12.24
 */
@Component
public interface IPCApplyLoanService {

    /**
     * 根据进件状态启动流程或保存流程数据
     * @param params
     */
    public void doProcess( UnifiedServiceDoc<PCApplyLoanRequest> params );

}
