package com.service.svc.shortMessage;

import com.service.param.def.SmsTemplateCode;
import com.service.param.def.UnifiedCode;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.platform.message.shortMessage.SmService;
import com.service.svc.AbstractSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 短信服务
 * @author linyang
 * @since 2017.12.14
 */
@Component
public class SmsSendSvc extends AbstractSvc<SmsRequest> {

    @Autowired
    private SmService smService;

    @Override
    public Object doSvc( UnifiedServiceDoc<SmsRequest> serviceDoc ) {

        SmsRequest smsSvcPojo = serviceDoc.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest();
        boolean isSuccess = smService.sendSms( smsSvcPojo.getAppNo(), smsSvcPojo.getMobile(), SmsTemplateCode.MYC_FINALCHECK.name(), smsSvcPojo.getParams() );

        if( isSuccess )
            return UnifiedCode.RES_0001.getCode();
        else
            return UnifiedCode.RES_9999.getCode();
    }
}
