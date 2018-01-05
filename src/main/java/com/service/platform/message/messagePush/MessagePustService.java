package com.service.platform.message.messagePush;

import com.google.gson.Gson;
import com.service.param.def.EnvProperityName;
import com.service.param.def.UnifiedCode;
import com.service.platform.bootstrap.PropertiesLoader;
import com.service.platform.handler.UnifiedException;
import com.service.platform.http.HttpClientService;
import com.service.platform.util.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * 状态同步服务<br>
 * 用于处理向前端推送状态信息
 * @author linyang
 * @since 2017.12.07
 */
@Service
public class MessagePustService {

    /**
     * 日志记录对象
     */
    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * http 客户端服务
     */
    @Autowired
    private HttpClientService httpClientService;

//    private String messagePush_url = "http://10.143.117.20:7777/myche/message/push/";

    /** 环境信息加载器 */
    @Autowired
    private PropertiesLoader propertiesLoader;

    /**
     * 发送状态同步信息
     * @param appNo             进件编号
     * @param contractNo        合同编号
     * @param msgType           请求类型 @See {@link com.service.param.def.MsgType }
     * @param status            订单状态
     * @param uuid              当前申请人uuid
     * @param serviceSn         交易序列号
     * @param param             参数
     */
    public boolean pushMessage( String appNo, String contractNo, String msgType, String status,
                             String uuid,String serviceSn, Map<String, Object> params ){

        // 获取站内信息推送服务地址
        String messagePush_url = propertiesLoader.getProperty( EnvProperityName.messagePush_url.name() );

        MessagePushRequest msRequest = new MessagePushRequest();
        msRequest.setApplyNo( appNo );
        msRequest.setContraNbr( contractNo );
        msRequest.setMsgType(msgType);
        msRequest.setUuid(uuid);
        msRequest.setServiceSn(serviceSn);
        msRequest.setStatus(status);
        msRequest.setSendTime( DateUtils.date2String( new Date(), DateUtils.yyyyMMddHHmmssSSS ) );
        msRequest.setExtra( params );
        MessagePushResponse res = httpClientService.sendPostJson( messagePush_url, msRequest, MessagePushResponse.class );

        if( null != res ) {
            if( 0 == res.getCode() ) {
                return true;
            }else{
                logger.error( "消息推送失败：appNo[{}],内容：[{}], 响应内容[{}]", appNo, params, res.getShowMsg() );
                return false;
            }
        }else{
            logger.error( "消息推送失败：appNo[{}],内容：[{}]", appNo, params );
            return false;
        }
    }

}
