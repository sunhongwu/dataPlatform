package com.service.policy.riskData.huifa;

import com.google.gson.Gson;
import com.service.biz.IPlatformOrmService;
import com.service.dao.TmHuifaDetailDao;
import com.service.dao.entity.TmHuifaDetailEntity;
import com.service.param.def.EnvProperityName;
import com.service.platform.bootstrap.PropertiesLoader;
import com.service.platform.dec.Base64Util;
import com.service.platform.http.HttpClientService;
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
 * 汇法网风控数据获取/整理 服务
 * @author linyang
 * @since 2018.01.05
 */
@SuppressWarnings("ALL")
@Service
public class HuiFaRiskDataService extends ChannelRiskDataServiceAbs {

    /**
     * 日志记录对象
     */
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
     * 汇法网查询结果详情 orm 操作类
     */
    @Autowired
    private TmHuifaDetailDao tmHuifaDetailDao;

    /**
     * 由平台提供的 数据库层补充操作服务
     */
    @Autowired
    private IPlatformOrmService platformOrmService;

    /**
     * 获取风控数据 并将数据入库
     * @param appNo               进件编号
     * @param policiedPersonInfos 需要查询风控数据的人员信息
     * @param threadCounter       线程计数器
     * @return
     */
    @Override
    public boolean getRiskData( String appNo, List<PoliciedPersonInfo> policiedPersonInfos, CountDownLatch threadCounter ) {

        logger.info( "开始获取汇法网风控数据 appNo[{}]", appNo );

        // 汇法网接口请求参数
        List<NameValuePair> params = null;
        for( PoliciedPersonInfo policiedPersonInfo: policiedPersonInfos ){

            String idNo = policiedPersonInfo.getIdNo();                 // 被查询人身份证号
            String name = policiedPersonInfo.getName();                 // 被查询人姓名
            String linkRelation = policiedPersonInfo.getLinkRelation(); // 被查询人与住借款人关系

            params = new ArrayList<NameValuePair>();
            params.add( new BasicNameValuePair( "conid", propertiesLoader.getProperty( EnvProperityName.huifa_conid.name() ) ) );
            params.add( new BasicNameValuePair( "stype", "1" ) );
            params.add( new BasicNameValuePair( "id", idNo ) );
            params.add( new BasicNameValuePair( "n", policiedPersonInfo.getName() ) );

            String res = httpClientService.sendPostKV( propertiesLoader.getProperty( EnvProperityName.huifa_url.name() ), params, String.class );
            try {
                res = Base64Util.decrypt( res, propertiesLoader.getProperty( EnvProperityName.huifa_desKey.name() ) );
            } catch (Exception e) {
                e.printStackTrace();
            }

            Gson gson = new Gson();
            HuiFaRiskResponse response = gson.fromJson( res, HuiFaRiskResponse.class );
            if( null == response || !"s".equalsIgnoreCase( response.getSuccess() ) ) {
                TmHuifaDetailEntity tmHuifaDetail = new TmHuifaDetailEntity();
                tmHuifaDetail.setAppNo( appNo );
                tmHuifaDetail.setIdNo( idNo );
                tmHuifaDetail.setInUse( 0 );
                tmHuifaDetail.setLinkRelation( linkRelation );
                tmHuifaDetail.setName( name );
                tmHuifaDetail.setSuccess( "Faild" );
                tmHuifaDetailDao.save( tmHuifaDetail );
                return false;
            }

            // 临时数据
            List<HuiFaRiskContentDetail> temp = new ArrayList<HuiFaRiskContentDetail>();

            // 需要进行持久化的数据
            List<TmHuifaDetailEntity> needSaves = new ArrayList<TmHuifaDetailEntity>();

            temp = response.getFxcontent().getZhixing();
            cast2Entity( temp, needSaves, "zhixing", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getShixin();
            cast2Entity( temp, needSaves, "shixin", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getXiangao();
            cast2Entity( temp, needSaves, "xiangao", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getXianchu();
            cast2Entity( temp, needSaves, "xianchu", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getCaipan();
            cast2Entity( temp, needSaves, "caipan", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getShenpan();
            cast2Entity( temp, needSaves, "shenpan", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getZuifan();
            cast2Entity( temp, needSaves, "zuifan", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getWeifa();
            cast2Entity( temp, needSaves, "weifa", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getQianshui();
            cast2Entity( temp, needSaves, "qianshui", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getFeizheng();
            cast2Entity( temp, needSaves, "feizheng", appNo, idNo, name, linkRelation );
            temp = response.getFxcontent().getQiankuan();
            cast2Entity( temp, needSaves, "qiankuan", appNo, idNo, name, linkRelation );

            if( needSaves.size() == 0 ) {
                TmHuifaDetailEntity needSave = new TmHuifaDetailEntity();
                needSave.setName( name );
                needSave.setSuccess( "Success" );
                needSave.setInUse( 0 );
                needSave.setAppNo( appNo );
                needSave.setIdNo( idNo );
                needSave.setLinkRelation( linkRelation );
                needSave.setInUse( 0 );
                needSaves.add( needSave );
                platformOrmService.addByTrans( needSave );
            }
        }
        logger.info( "汇法网风控数据获取结束 appNo[{}]", appNo );
        return false;
    }

    /**
     * 将 List<HuiFaRiskContentDetail> 拷贝到 List<TmHuifaDetail> 对象
     * @param details		命中详情
     * @param needSaves		数据回调对象
     * @param ruleId		规则id
     * @param appNo			订单编号
     * @param idNo			被查询人身份证号
     * @param name			被查询人姓名
     * @param linkRelation	被查询人与主借人关系
     */
    public void cast2Entity(List<HuiFaRiskContentDetail> details, List<TmHuifaDetailEntity> needSaves,
                            String ruleId, String appNo, String idNo, String name, String linkRelation ){

        if( null == details || details.size() == 0 || null == needSaves ) return;

        for( HuiFaRiskContentDetail detail : details ){
            TmHuifaDetailEntity needSave = new TmHuifaDetailEntity();
            needSave.setHappenedTime( detail.getSslong() );
            needSave.setName( name );
            needSave.setSuccess( "Success" );
            needSave.setInUse( 0 );
            needSave.setMoney( detail.getMoney() );
            needSave.setRuleId( ruleId );
            needSave.setTitle( detail.getTitle() );
            needSave.setTypeT( detail.getTypet() );
            needSave.setTypeTName( detail.getTypetname() );
            needSave.setWlMoney( detail.getWlmoney() );
            needSave.setAppNo( appNo );
            needSave.setIdNo( idNo );
            needSave.setLinkRelation( linkRelation );
            needSaves.add( needSave );
        }
    }
}
