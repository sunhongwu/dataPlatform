package com.service;/**
 * linyang
 * 2017/8/28 0028 上午 12:01
 **/

import com.google.gson.Gson;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.platform.handler.entity.UnifiedServiceDocHelper;
import com.service.platform.http.HttpClientService;
import com.service.platform.message.messagePush.MessagePushRequest;
import com.service.platform.message.shortMessage.SmService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 *  短信测试类
 *  @author: linyang
 *  @since: 2017/8/28 0028 上午 12:01 
 **/
public class ShortMessageTest {

    private static final Logger logger = LoggerFactory.getLogger( SmService.class );

    @org.junit.Test
    public void test1(){

//        HttpClientService client = new HttpClientService();
//
//        SmsService sms = new SmsService();
//        SmRequest sms1 = sms.buildSms( "13401056450", "测试短信" );
//        SmResponse smsResponse = client.sendPostKV( "http://10.143.117.21:9080/sms/sms/api/smsSend/", sms1, SmResponse.class );
//
//        if ( smsResponse != null ) {
//            if ( SmResponse.SUCCESS.equals( smsResponse.getCode() ) ) {
//                logger.info( "短信发送成功，号码：{}，内容：{}", sms1.getMobiles(), sms1.getContent() );
//            } else {
//                logger.error( "短信发送失败，响应结果：{}，号码：{}，内容：{}", smsResponse.toString(), sms1.getMobiles(), sms1.getContent() );
//            }
//        } else {
//            logger.error( "短信发送失败，响应结果：{}，号码：{}，内容：{}", smsResponse, sms1.getMobiles(), sms1.getContent() );
//        }


//        Map<String, Object> dataMaps = new HashMap<String, Object>();
////								dataMaps.put( "RETURN_REASON", remark );// 专员类型
//        dataMaps.put( "NOD_STATUS", "O" );
//
//
//        UnifiedServiceDoc doc = UnifiedServiceDocHelper.newUnifiedServiceDoc_request( "smsService" );
//
//
//        MessagePushRequest mpRequest = new MessagePushRequest();
//        mpRequest.setAppNo( "123123" );
//        mpRequest.setContent( "setContent" );
//        mpRequest.setContraNbr( "setContraNbr" );
//        mpRequest.setExtra( dataMaps );
//        mpRequest.setMsgType( "S" );
//        mpRequest.setProductGroup( "MYCHE" );
//        mpRequest.setUuid( "setUuid" );

//        http://10.143.117.204:8888/sms/sms/api/smsSend/


        Map<String, Object> dataMaps = new HashMap<String, Object>();
        dataMaps.put( "NOD_STATUS", "NOD_STATUS" );// 专员类型
        dataMaps.put( "CLERK_NAME", "CLERK_NAME" );
        dataMaps.put( "CLERK_ID", "CLERK_ID" );
        dataMaps.put( "CLERK_MOBILE", "CLERK_MOBILE" );
        dataMaps.put( "DEALER_COMPANY_ID", "DEALER_COMPANY_ID" );			// 经销商公司ID

        MessagePushRequest req = new MessagePushRequest();

        Gson gson = new Gson();
        System.out.println( gson.toJson( dataMaps ) );

//        req.setApplyNo( "test0000001" );
//        req.setContraNbr( "78142202005500000115" );
//        req.setExtra( dataMaps );
//        req.setMsgContent( null );
//        req.setMsgType( "T" );
//        req.setSendTime( "20171213111158" );
//        req.setServiceSn( "APP20022000000000009215" );
//        req.setStatus( "P" );
//        req.setUuid( "2015000100000812109022" );


//        HttpClientService client = new HttpClientService();
//        String res = client.sendPostJson( "http://10.143.117.20:7777/myche/message/push/", req, null );
//        System.out.println( res );
    }
}
