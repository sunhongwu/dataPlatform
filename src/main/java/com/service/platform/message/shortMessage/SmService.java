package com.service.platform.message.shortMessage;

import com.service.biz.ISmsLogService;
import com.service.biz.ISmsTemplateService;
import com.service.dao.entity.TmSmsLogEntity;
import com.service.dao.entity.TmSmsTemplateEntity;
import com.service.param.def.EnvProperityName;
import com.service.param.def.SymbolConstant;
import com.service.platform.bootstrap.PropertiesLoader;
import com.service.platform.dec.Md5Util;
import com.service.platform.http.HttpClientService;
import com.service.platform.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 短信服务
 * @author linyang
 * @since 2017.12.05
 */
@Service
public class SmService {

    private static final Logger logger = LoggerFactory.getLogger( SmService.class );

//    /** 短信平台授权用户id */
//    private String userId = "1";
//
//    /** 短信平台授权用户密码 */
//    private String key = "1";
//
//    /** 短信平台服务开放地址 */
//    private String url = "http://10.143.117.21:9080/sms/sms/api/smsSend/";

//    /** 短信平台授权用户id */
//    private String userId = "c39efb65-918f-4ff8-88e7-d62a58d6ab9e";
//
//    /** 短信平台授权用户密码 */
//    private String key = "Wd0bXC8tGY2FTRJLt9Y5";
//
//    /** 短信平台服务开放地址 */
//    private String url = "http://10.143.92.200/sms/sms/api/smsSend/";

    /** http 请求服务 */
    @Autowired
    private HttpClientService httpClientService;

    /** 短信模板服务 */
    @Autowired
    private ISmsTemplateService iSmsTemplateService;

    /** 短信历史纪录服务 */
    @Autowired
    private ISmsLogService iSmsLogService;

    /** 环境信息加载器 */
    @Autowired
    private PropertiesLoader propertiesLoader;

    public void addSmsTemplate(){}

    /**
     * 发送短信
     * @param appNo         订单号
     * @param mobile        手机号
     * @param templateCode  短信模板编码 @See {@link com.service.param.def.SmsTemplateCode }
     * @param params        短信模板填充内容
     */
    public boolean sendSms( String appNo, String mobile, String templateCode, List<String> params ) {
        if(StringUtils.isNullOrBlank( templateCode ) ) {
            logger.error( "短信发送失败,未找到指定的短信模板[{}]", templateCode );
            return false;
        }
        TmSmsTemplateEntity tmSmsTemplateEntity = iSmsTemplateService.findByTemplateCode( templateCode );
        if(StringUtils.isNullOrBlank( templateCode ) ) {
            logger.error( "短信发送失败,未找到指定的短信模板[{}]", templateCode );
            return false;
        }


        // 短信平台服务开放地址
        String smsUrl = propertiesLoader.getProperty( EnvProperityName.sms_url.name() );
        // 短信平台授权用户id
        String smsUserId = propertiesLoader.getProperty( EnvProperityName.sms_userId.name() );
        // 短信平台授权用户密码
        String smsKey = propertiesLoader.getProperty( EnvProperityName.sms_key.name() );


        SmRequest sms = buildSms( mobile, tmSmsTemplateEntity, params, smsUserId, smsKey );
        SmResponse smResponse = httpClientService.sendPostKV( smsUrl, sms, SmResponse.class );
        if (smResponse != null) {
            if ( SmResponse.SUCCESS.equals( smResponse.getCode() ) ) {
                addSmsLog( appNo, mobile, templateCode, params, sms.getContent(), SymbolConstant.SUCCESS.getCode() );
                logger.info("短信发送成功,号码：{},内容：{}", mobile, sms.getContent() );
                return  true;
            } else {
                addSmsLog( appNo, mobile, templateCode, params, sms.getContent(), SymbolConstant.FAILD.getCode() );
                logger.error( "短信发送失败,响应结果：{},号码：{},内容：{}", smResponse.toString(), mobile, sms.getContent() );
                return false;
            }
        } else {
            addSmsLog( appNo, mobile, templateCode, params, sms.getContent(), SymbolConstant.FAILD.getCode() );
            logger.error( "短信发送失败,响应结果：{},号码：{},内容：{}", smResponse, mobile, sms.getContent() );
            return false;
        }
    }

    /**
     * 组装短信服务请求信息
     * @param mobile                手机号
     * @param tmSmsTemplateEntity   短信模板信息
     * @param params                请求参数
     * @param smsUserId             短信平台授权用户id
     * @param smsKey                短信平台授权用户密码
     * @return
     */
    private SmRequest buildSms(String mobile, TmSmsTemplateEntity tmSmsTemplateEntity, List<String> params,
                               String smsUserId, String smsKey ) {

        String context = tmSmsTemplateEntity.getTemplate();
        for( int i  = 0; i < params.size(); i++ ){
            String paramName = new StringBuilder( "{" ).append( i ).append( "}" ).toString();
            context = context.replace( paramName, params.get( i ) );
        }

        SmRequest sms = new SmRequest( smsUserId, mobile, context );

        // 获取加密验证码
        sms.setMac( getMac( sms, smsUserId,smsKey ) );
        return sms;
    }

    /**
     * 添加短信发送日志
     * @param appNo         订单编号
     * @param mobile        手机号
     * @param templateCode  短信模板编码  @See {@link com.service.param.def.SmsTemplateCode }
     * @param params        短信模板填充值
     * @param message       短信内容
     * @param sendResult    发送结果 {@link com.service.param.def.SymbolConstant } enumGroup_isSuccess
     * @return
     */
    private TmSmsLogEntity addSmsLog(String appNo, String mobile, String templateCode, List<String> params,
                                     String message, String sendResult ){
        TmSmsLogEntity tmSmsLogEntity = new TmSmsLogEntity();
        tmSmsLogEntity.setAppNo( appNo );
        tmSmsLogEntity.setSmsTemplateCode( templateCode );
        tmSmsLogEntity.setMessage( message );
        tmSmsLogEntity.setMobileNumber( mobile );
        tmSmsLogEntity.setMsgParam( params.toString() );
        tmSmsLogEntity.setSendResult( sendResult );
        return iSmsLogService.save( tmSmsLogEntity );
    }

    /**
     * 构建短信服务请求加密验证串
     * @param sms           短信发送内容
     * @param smsUserId     短信平台授权用户id
     * @param smsKey        短信平台授权用户密码
     * @returnK
     */
    private String getMac(SmRequest sms, String smsUserId, String smsKey ) {
        StringBuffer buffer = new StringBuffer();
        buffer.append( smsUserId ).append( sms.getBizId() ).append( sms.getMobiles() )
                .append( sms.getTimestamp() ).append( sms.getSendTime() ).append( sms.getContent() )
                .append( sms.getHasSign() ).append( sms.getExtend() ).append( smsKey );
        return Md5Util.getMd5Result( buffer.toString() );
    }

}
