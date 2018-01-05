package com.service.policy.riskData;

import com.service.dao.TmAppPrimApplicantInfoDao;
import com.service.dao.TmAppPrimContactInfoDao;
import com.service.dao.entity.TmAppPrimApplicantInfoEntity;
import com.service.dao.entity.TmAppPrimContactInfoEntity;
import com.service.param.def.*;
import com.service.platform.bootstrap.PropertiesLoader;
import com.service.policy.riskData.huifa.HuiFaRiskDataService;
import com.service.policy.riskData.tongdun.TongDunRiskDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 风控数据查询服务
 * @author linyang
 * @since 2018.01.02
 */
@Service
public class RiskDataService {

    /** 日志记录对象 */
    private Logger logger = LoggerFactory.getLogger( getClass() );

    /**
     * 配置信息加载器
     */
    @Autowired
    private PropertiesLoader propertiesLoader;

    /**
     * 申请信息 orm 操作对象
     */
    @Autowired
    private TmAppPrimApplicantInfoDao appPrimApplicantInfoDao;

    /**
     * 联系人信息表 orm 操作对象
     */
    @Autowired
    private TmAppPrimContactInfoDao appPrimContactInfoDao;

    /**
     * 同盾风控数据获取/整理 服务
     */
    @Autowired
    private TongDunRiskDataService tongDunRiskDataService;

    /**
     * 汇法网风控数据获取/整理 服务
     */
    @Autowired
    private HuiFaRiskDataService huiFaRiskDataService;

    /**
     * 根据订单号查询 订单中 主借人 配偶 及 共借人的风控数据 <br>
     * 自动风控中: <br>
     * 1.主借人 与 配偶为同一风控主体 <br>
     * 2.共借人为单独风控主体 <br>
     * @param appNo
     */
    public void getRiskData( String appNo ){
        logger.info( "开始执行风控数据查询appNo[{}]", appNo );

        List<PoliciedPersonInfo> policiedPersonInfos = getPoliciedPersions( appNo );

        if( SymbolConstant.ON.getCode().equals( propertiesLoader.getProperty( EnvProperityName.isExecuteLocalBlack.name() ) ) ) {

        }else logger.info("未开启本地黑名单名单接口功能,若开启请设置[isExecuteLocalBlack=ON]!");

        if( SymbolConstant.ON.getCode().equals( propertiesLoader.getProperty( EnvProperityName.isExecuteTongdun.name() ) ) ) {
            tongDunRiskDataService.getRiskData( appNo, policiedPersonInfos, null );
        }else logger.info("未开启同盾黑名单接口功能,若开启请设置[isExecuteTongdun=ON]!");

        if( SymbolConstant.ON.getCode().equals( propertiesLoader.getProperty( EnvProperityName.isHuiFa.name() ) ) ) {
            huiFaRiskDataService.getRiskData( appNo, policiedPersonInfos, null );
        }else logger.info("未开启汇法网征信查询功能,若开启请设置[isHuiFa=ON]!");

        if( SymbolConstant.ON.getCode().equals( propertiesLoader.getProperty( EnvProperityName.isExecuteBaiRong.name() ) ) ) {

        }else logger.info("未开启百融黑名单接口功能,若开启请设置[isExecuteBaiRong=ON]!");

        logger.info( "风控数据查询结束appNo[{}]", appNo );
    }

    /**
     * 根据订单编号 获取需要被查询风控的人员信息列表
     * @param appNo
     * @return
     */
    private List<PoliciedPersonInfo> getPoliciedPersions( String appNo ){
        List<PoliciedPersonInfo> policiedPersions = new ArrayList<PoliciedPersonInfo>();

        // 获取申请信息表信息
        TmAppPrimApplicantInfoEntity appPrimApplicantInfoEntity = appPrimApplicantInfoDao.findByAppNo( appNo );

        // 主借人信息
        PoliciedPersonInfo borrower =
                new PoliciedPersonInfo( appPrimApplicantInfoEntity.getName(), appPrimApplicantInfoEntity.getCellphone(),
                appPrimApplicantInfoEntity.getIdNo(), PolicyPersonRelation.I.name(), appPrimApplicantInfoEntity.getBankCardNbr() );
        policiedPersions.add( borrower );

        // 配偶信息
        if( MaritalStatus.C.name().equals( appPrimApplicantInfoEntity.getMaritalStatus() ) ) {
            TmAppPrimContactInfoEntity appPrimContactInfoEntity =
                    appPrimContactInfoDao.findByAppNoAndContactRelationAndContactFrom( appNo, MaritalStatus.C.name(),
                            LinkRelation.systemAdd );

            if( null != appPrimContactInfoEntity ) {
                PoliciedPersonInfo mate = new PoliciedPersonInfo( appPrimContactInfoEntity.getContactName(),
                        appPrimContactInfoEntity.getContactMobile(), appPrimContactInfoEntity.getContactPersonalId(),
                        PolicyPersonRelation.M.name(), "" );
                policiedPersions.add( mate );
            }
        }

        // 共借人信息
        if( SymbolConstant.YES.getCode().equals( appPrimApplicantInfoEntity.getHaveCoborrower() ) ) {

            // 当联系人关系不为为配偶时 添加共借人信息
            if( !LinkRelation.C.name().equals( appPrimApplicantInfoEntity.getCoborrowerRelation() ) ) {
                PoliciedPersonInfo coborrower = new PoliciedPersonInfo( appPrimApplicantInfoEntity.getCoborrowerName(),
                        appPrimApplicantInfoEntity.getCoborrowerMobile(), appPrimApplicantInfoEntity.getCoborrowerPerId(),
                        PolicyPersonRelation.C.name(), "" );

                policiedPersions.add( coborrower );
            }
        }
        return policiedPersions;
    }
}
