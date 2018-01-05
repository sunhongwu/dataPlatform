package com.service.svc.messagePush;

import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.platform.message.messagePush.MessagePustService;
import com.service.svc.AbstractSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 消息推送服务
 * @author linyang
 * @since 2017.12.14
 */
@Component
public class MessagePushSvc extends AbstractSvc<MessagePushRequest> {

    @Autowired
    private MessagePustService messagePustService;

    /**
     * 消息推送
     * @param params
     * @return
     */
    @Override
    public Object doSvc( UnifiedServiceDoc<MessagePushRequest> params ) {
        MessagePushRequest rquest = params.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest();
        boolean isSuccess = messagePustService.pushMessage( rquest.getAppNo(), rquest.getContractNo(), rquest.getMsgType(),
                rquest.getStatus(), rquest.getUuid(), rquest.getServiceSn(), rquest.getParams() );

        return isSuccess;
    }
}
