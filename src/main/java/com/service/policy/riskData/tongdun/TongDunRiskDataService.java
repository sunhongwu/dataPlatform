package com.service.policy.riskData.tongdun;

import com.service.biz.IPlatformOrmService;
import com.service.dao.TmTongdunPolicyDao;
import com.service.dao.entity.TmTongdunHitDetailEntity;
import com.service.dao.entity.TmTongdunPolicyEntity;
import com.service.param.def.EnvProperityName;
import com.service.param.def.SymbolConstant;
import com.service.platform.bootstrap.PropertiesLoader;
import com.service.platform.http.HttpClientService;
import com.service.platform.util.beanUtils.BeanUtils;
import com.service.policy.riskData.ChannelRiskDataServiceAbs;
import com.service.policy.riskData.PoliciedPersonInfo;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;


/**
 * 同盾风控数据获取/整理 服务
 * @author linyang
 * @since 2018.01.03
 */
@SuppressWarnings( "ALL" )
@Service
public class TongDunRiskDataService extends ChannelRiskDataServiceAbs {

    /** 日志记录对象 */
    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * http 访问服务
     */
    @Autowired
    private HttpClientService httpClientService;

    /**
     * 配置信息加载器
     */
    @Autowired
    private PropertiesLoader propertiesLoader;

    /**
     * 同盾风控结果表 操作对象
     */
    @Autowired
    private TmTongdunPolicyDao tongdunPolicyDao;

    /**
     * 由平台提供的 数据库层补充操作服务
     */
    @Autowired
    private IPlatformOrmService platformOrmService;
    /**
     * 获取同炖风控数据 并将数据入库 <br>
     * 同盾风控数据分为两部分 : <br>
     * 1. 风控结果, 风控判断依据  <br>
     * 2. 命中详情, 目前仅入库留档  <br>
     * 因此需要请求同盾风控两次, 以获取不同风控数据
     * @param appNo              进件编号
     * @param policiedPersonInfo 需要查询风控数据的人员信息
     * @param threadCounter      线程计数器 没有则传null
     * @return
     */
    @Override
    public boolean getRiskData( String appNo, List<PoliciedPersonInfo> policiedPersonInfos, CountDownLatch threadCounter ) {

        logger.info( "开始获取同盾风控数据 appNo[{}]", appNo );

        // 同盾风控结果查询服务访问地址
        String tongdunUrl = propertiesLoader.getProperty( EnvProperityName.tongDunBlackCheckUrl.name() );

        BasicNameValuePair partner_code = new BasicNameValuePair( EnvProperityName.partner_code.name(),
                propertiesLoader.getProperty( EnvProperityName.partner_code.name() ) );
        BasicNameValuePair secret_key = new BasicNameValuePair( EnvProperityName.secret_key.name(),
                propertiesLoader.getProperty( EnvProperityName.secret_key.name() ) );
        BasicNameValuePair event_id = new BasicNameValuePair( EnvProperityName.event_id.name(),
                propertiesLoader.getProperty( EnvProperityName.event_id.name() ) );
        BasicNameValuePair token_id = new BasicNameValuePair( EnvProperityName.token_id.name(),
                propertiesLoader.getProperty( EnvProperityName.token_id.name() ) );

        // 风控结果查询接口 请求参数
        List<NameValuePair> resRequestParams = null;

        for( PoliciedPersonInfo policiedPersonInfo : policiedPersonInfos ) {
            resRequestParams = new ArrayList<NameValuePair>();
            resRequestParams.add( partner_code );
            resRequestParams.add( secret_key );
            resRequestParams.add( event_id );
            resRequestParams.add( token_id );
            resRequestParams.add( new BasicNameValuePair( "id_number", policiedPersonInfo.getIdNo() ) );
            resRequestParams.add( new BasicNameValuePair( "account_mobile", policiedPersonInfo.getMobile() ) );
            resRequestParams.add( new BasicNameValuePair( "card_number", policiedPersonInfo.getBankCardNbr() ) );

            // 请求并获取同盾风控结果
            TongDunRiskResponse riskRes = httpClientService.sendPostKV( tongdunUrl, resRequestParams, TongDunRiskResponse.class );

            TmTongdunPolicyEntity tongdunPolicyEntity = new TmTongdunPolicyEntity();
            tongdunPolicyEntity.setAppNo( appNo );
            tongdunPolicyEntity.setIdNo( policiedPersonInfo.getIdNo() );
            tongdunPolicyEntity.setName( policiedPersonInfo.getName() );
            tongdunPolicyEntity.setCellPhone( policiedPersonInfo.getMobile() );
            tongdunPolicyEntity.setLinkRelation( policiedPersonInfo.getLinkRelation() );
            tongdunPolicyEntity.setInUse( SymbolConstant.IN_USE.getCode() );

            // 如果当前请求执行成功
            if( riskRes.getSuccess() ) {
                // 获取查询成功后相应的查询流水号
                String seq_id = riskRes.getSeq_id();
                BeanUtils.copy( riskRes, tongdunPolicyEntity );
                tongdunPolicyEntity.setSuccess( SymbolConstant.SUCCESS.getCode() );

                // 风控命中像详情接口 请求参数
                List<NameValuePair> hitDetailRequestParams = new ArrayList<NameValuePair>();
                hitDetailRequestParams.add( partner_code );
                hitDetailRequestParams.add( new BasicNameValuePair( EnvProperityName.partner_key.name(), propertiesLoader.getProperty( EnvProperityName.partner_key.name() ) ) );
                hitDetailRequestParams.add( new BasicNameValuePair( "sequence_id", tongdunPolicyEntity.getSeqId() ) );
                TongDunRiskDetailResponse riskDetailRes = httpClientService.sendPostKV( tongdunUrl, resRequestParams, TongDunRiskDetailResponse.class );

                if( riskDetailRes.getSuccess() ) {
                    List<TongDunRiskDetailResHit> rules = riskDetailRes.getRules();
                    if( null != rules && rules.size() > 0 ) {										// 如果有命中
                        List<TmTongdunHitDetailEntity> hitDetails = new ArrayList<TmTongdunHitDetailEntity>();

                        for( TongDunRiskDetailResHit hitRule : rules ) {
                            TmTongdunHitDetailEntity hitDetail = new TmTongdunHitDetailEntity();

                            hitDetail.setAppNo( appNo );
                            if( null != hitRule.getConditions() )
                                hitDetail.setConditions( hitRule.getConditions().toString() );

                            hitDetail.setLinkRelation( policiedPersonInfo.getLinkRelation() );
                            hitDetail.setName( policiedPersonInfo.getName() );
                            hitDetail.setIdNo( policiedPersonInfo.getIdNo() );
                            hitDetail.setRuleId( hitRule.getRule_id() );
                            hitDetail.setScore( hitRule.getScore() );
                            hitDetail.setInUse( 0 );
                            hitDetails.add( hitDetail );
                            platformOrmService.addByTrans( hitDetail );
                        }
                    }
                }
                logger.debug( "appNo[{}]同盾风控数据查询完成,流水号[{}]", appNo, seq_id );
            }else {
                tongdunPolicyEntity.setSuccess( SymbolConstant.FAILD.getCode() );
                logger.debug( "appNo[{}]同盾风控数据查询失败,流水号[{}]", appNo );
            }
            platformOrmService.addByTrans( tongdunPolicyEntity );
        }

        logger.info( "同盾风控数据获取结束 appNo[{}]", appNo );

        // 当线程计数器不为空 且计数值大于0 时 执行线程计数
        if( null != threadCounter && threadCounter.getCount() > 0L )
            threadCounter.countDown();

        return true;
    }
}
