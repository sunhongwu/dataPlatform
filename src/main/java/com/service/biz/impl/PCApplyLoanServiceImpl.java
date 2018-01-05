package com.service.biz.impl;

import com.service.biz.IPCApplyLoanService;
import com.service.biz.IPlatformOrmService;
import com.service.dao.TmAppMainDao;
import com.service.dao.TmAppPrimApplicantInfoDao;
import com.service.dao.TmAppPrimContactInfoDao;
import com.service.dao.TmVehicleInfoDao;
import com.service.dao.entity.TmAppMainEntity;
import com.service.dao.entity.TmAppPrimApplicantInfoEntity;
import com.service.dao.entity.TmAppPrimContactInfoEntity;
import com.service.dao.entity.TmVehicleInfoEntity;
import com.service.param.def.*;
import com.service.platform.handler.UnifiedException;
import com.service.platform.handler.entity.UnifiedServiceDoc;
import com.service.platform.message.messagePush.MessagePustService;
import com.service.platform.util.StringUtils;
import com.service.platform.util.beanUtils.BeanUtils;
import com.service.policy.riskData.RiskDataService;
import com.service.svc.pcApplyLoan.ContactInfo;
import com.service.svc.pcApplyLoan.PCApplyLoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 美易车PC端进件服务
 * @author linyang
 * @since 2017.12.24
 */
@SuppressWarnings("ALL")
@Service
@Transactional
public class PCApplyLoanServiceImpl implements IPCApplyLoanService {

    @Autowired
    private MessagePustService messagePustService;

    @Autowired
    private TmAppMainDao tmAppMainDao;

    @Autowired
    private TmAppPrimApplicantInfoDao tmAppPrimApplicantInfoDao;

    @Autowired
    private TmAppPrimContactInfoDao tmAppPrimContactInfoDao;

    @Autowired
    private TmVehicleInfoDao tmVehicleInfoDao;

    @Autowired
    private RiskDataService riskDataService;

    @Autowired
    private IPlatformOrmService platformOrmService;

    /** 当订单数据已在数据库中存在时 只有一下集合中的状态才能允许进件 */
    private List<String> applyStatusList = new ArrayList<String>(){{
        add( CheStatus.A3.name() ); add( CheStatus.B3.name() );
        add( CheStatus.S3.name() ); add( CheStatus.C3.name() );
        add( CheStatus.D3.name() ); add( CheStatus.S.name() );
    }};

    /**
     * 根据进件状态启动流程或保存流程数据
     * @param params
     */
    @Override
    public void doProcess( UnifiedServiceDoc<PCApplyLoanRequest> params ) {

        PCApplyLoanRequest pcApplyLoanRequest = params.getUnifiedServiceDocInfo().getUnifiedServiceBody().getRequest();

        String appNo = pcApplyLoanRequest.getAppNo();

        TmAppMainEntity mainEntity = mainEntity = tmAppMainDao.findByAppNo( appNo );
        TmVehicleInfoEntity vehicleInfoEntity = null;
        TmAppPrimApplicantInfoEntity primApplicantInfoEntity = null;

        // 当前进件状态不为 新单|回退|保存 状态时 禁止进件
        if( mainEntity != null && !applyStatusList.contains( mainEntity.getStatus() ) )
            throw new UnifiedException( UnifiedCode.RES_1012.getCode(), UnifiedCode.RES_1012.getDesc() );

        if( null == mainEntity ) {
            mainEntity = new TmAppMainEntity();
            primApplicantInfoEntity = new TmAppPrimApplicantInfoEntity();
            vehicleInfoEntity = new TmVehicleInfoEntity();
        }else{
            primApplicantInfoEntity = tmAppPrimApplicantInfoDao.findByAppNo( appNo );
            vehicleInfoEntity = tmVehicleInfoDao.findByAppNo( appNo );
        }

        BeanUtils.copy( pcApplyLoanRequest, mainEntity );
        BeanUtils.copy( pcApplyLoanRequest, primApplicantInfoEntity );
        BeanUtils.copy( pcApplyLoanRequest, vehicleInfoEntity );

        if( AppAction.N.name().equals( pcApplyLoanRequest.getAppAction() ) ){
            mainEntity.setCommitTime( new Timestamp( System.currentTimeMillis() ) );
            mainEntity.setRtfState( Workflow_RtfState.Pass.name() );
        }

        // 设置订单申请方式 pc | app
        mainEntity.setSubTerminalType( params.getUnifiedServiceDocInfo().getUnifiedServiceHeader().getSubTerminalType() );
        mainEntity.setOrg( SymbolConstant.ORG );
        mainEntity.setStatus( CheStatus.B1.name() );

        vehicleInfoEntity.setOrg( SymbolConstant.ORG );
        primApplicantInfoEntity.setOrg( SymbolConstant.ORG );

        tmAppMainDao.save( mainEntity );
        tmAppPrimApplicantInfoDao.save( primApplicantInfoEntity );
        saveContractList( pcApplyLoanRequest );
        tmVehicleInfoDao.save( vehicleInfoEntity );

        // 获取风控数据
        riskDataService.getRiskData( mainEntity.getAppNo() );

        // 向前端推送状态同步信息
        Map<String, Object> params1 = new HashMap<String, Object>();
        params1.put( "NOD_STATUS", "TST" );
        boolean isSuccess = messagePustService.pushMessage( pcApplyLoanRequest.getAppNo(), "", MsgType.S.name(),
                "TST", mainEntity.getUniqueId(), "", params1 );
    }

    /**
     * 保存联系人信息
     * @param pcApplyLoanRequest    申请信息
     */
    private void saveContractList( PCApplyLoanRequest pcApplyLoanRequest ){
        List<ContactInfo> contracts = pcApplyLoanRequest.getContactList();
        String appNo = pcApplyLoanRequest.getAppNo();

        // 查询有前端进件时上传的联系人列表 不包含由系统自动添加的联系人信息
        List<TmAppPrimContactInfoEntity> contactHisList =
                tmAppPrimContactInfoDao.findAllByAppNoAndContactFrom( appNo, LinkRelation.pcAdd );

        // 如果当前订单中存在pc 端之前上传的联系人信息 则删除全部有pc 端上传的联系人信息
        if( null != contactHisList && contactHisList.size() > 0 )
            tmAppPrimContactInfoDao.deleteInBatch( contactHisList );

        // 需要保存的联系人列表
        List<TmAppPrimContactInfoEntity> saveContactList = new ArrayList<TmAppPrimContactInfoEntity>();
        for( ContactInfo contact : contracts ){
            if( null == contact ) continue;

            TmAppPrimContactInfoEntity tmAppPrimContactInfo = null;
            String contactName = contact.getContactName();							// 获取当前联系人姓名
            String contactMobile = contact.getContactMobile();						// 获取当前联系人联系电话
            String contactRelation = contact.getContactRelation();					// 获取当前联系人与借款人关系

            // 检查联系人信息合法性
            if( StringUtils.isNullOrBlank( contactName ) || StringUtils.isNullOrBlank( contactMobile )
                    || StringUtils.isNullOrBlank( contactRelation ) ) continue;

            for( TmAppPrimContactInfoEntity his : contactHisList ){						// 当有历史联系人信息时
                if( contactName.equals( his.getContactName() ) && contactMobile.equals( his.getContactMobile() )
                        && contactRelation.equals( his.getContactRelation() ) ) {
                    contactHisList.remove( his );
                    tmAppPrimContactInfo = his;
                    break;
                }
            }
            if( null == tmAppPrimContactInfo ) {									// 当前联系人为新联系人时
                tmAppPrimContactInfo = new TmAppPrimContactInfoEntity();
                tmAppPrimContactInfo.setAppNo( appNo );
                tmAppPrimContactInfo.setOrg( SymbolConstant.ORG );
                tmAppPrimContactInfo.setContactName( contactName );
                tmAppPrimContactInfo.setContactMobile( contactMobile );
                tmAppPrimContactInfo.setContactRelation( contactRelation );
                tmAppPrimContactInfo.setContactFrom( "0" );
            }
            platformOrmService.addByTrans( tmAppPrimContactInfo );
        }

        // 获取有系统自动生成的借款人配偶联系方式
        TmAppPrimContactInfoEntity mateInfo =
                tmAppPrimContactInfoDao.findByAppNoAndContactRelationAndContactFrom( appNo, LinkRelation.C.name(), LinkRelation.pcAdd );

        // 如果婚姻状况为已婚
        if( LinkRelation.C.name().equals( pcApplyLoanRequest.getMaritalStatus() ) ){

            // 如果未找到配偶信息 则添加由系统产生的借款人配偶联系信息
            if( null == mateInfo ) {
                mateInfo = new TmAppPrimContactInfoEntity();
                mateInfo.setAppNo( appNo );
                mateInfo.setMateEmpAddr( pcApplyLoanRequest.getMateEmpAdd() );							//配偶工作地址
                mateInfo.setContactWorkname( pcApplyLoanRequest.getContactWorkname() );					//配偶工作单位
                mateInfo.setOrg( SymbolConstant.ORG );                                                  //设置所属机构
                mateInfo.setContactName( pcApplyLoanRequest.getMateName() );                            //配偶姓名
                mateInfo.setContactPersonalId( pcApplyLoanRequest.getMatePersonalId() );                //配偶身份证号
                mateInfo.setContactMobile( pcApplyLoanRequest.getMateMobile() );                        //配偶联系电话
                mateInfo.setMateMonthlySalary(pcApplyLoanRequest.getMateMonthlySalary());               //配偶月收入
                mateInfo.setContactRelation( LinkRelation.C.name() );                                   //联系人关系为配偶
                mateInfo.setContactEmpPost( pcApplyLoanRequest.getContactEmpPost() );					//配偶单位职务
                mateInfo.setContactEmpDepartment( pcApplyLoanRequest.getContactEmpDepartment() );		//配偶所在部门
                mateInfo.setMateEmpAddr( pcApplyLoanRequest.getMateEmpAdd() );							//配偶工作地址
                mateInfo.setContactWorkname( pcApplyLoanRequest.getContactWorkname() );					//配偶工作单位
                mateInfo.setMateEmpProvince( pcApplyLoanRequest.getMateEmpProvince() );					//配偶工作单位所在省
                mateInfo.setMateEmpCity( pcApplyLoanRequest.getMateEmpCity() );							//配偶工作单位所在市
                mateInfo.setMateEmpArea( pcApplyLoanRequest.getMateEmpZone() );                         //配偶工作单位所在区

                mateInfo.setContactFrom( LinkRelation.systemAdd );                                      //当前联系人来源为系统自动生成
                platformOrmService.addByTrans( mateInfo );
            }
        }else if( null != mateInfo ){     // 如果当前婚姻状态不为已婚 但数据库中有当前订单对应的配偶联系信息 则直接删除
            tmAppPrimContactInfoDao.delete( mateInfo );
        }

        // 获取有系统自动生成的借款人配偶联系方式
        TmAppPrimContactInfoEntity borrower =
                tmAppPrimContactInfoDao.findByAppNoAndContactRelationAndContactFrom( appNo, LinkRelation.I.name(), LinkRelation.pcAdd );
        if( null == borrower ) borrower = new TmAppPrimContactInfoEntity();

        borrower.setOrg( SymbolConstant.ORG );
        borrower.setAppNo( appNo );
        borrower.setContactName( pcApplyLoanRequest.getAppName() );                                     //借款人姓名
        borrower.setContactPersonalId( pcApplyLoanRequest.getMatePersonalId() );                        //借款人身份证号
        borrower.setContactRelation( LinkRelation.I.name() );                                           //当前联系人为借款人本人
        borrower.setContactMobile( pcApplyLoanRequest.getMobile() );                                    //借款人手机号
        borrower.setContactFrom( LinkRelation.systemAdd );                                              //当前联系人来源为系统自动生成

        platformOrmService.addByTrans( borrower );
    }
}
