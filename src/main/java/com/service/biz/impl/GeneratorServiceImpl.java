package com.service.biz.impl;

import com.service.biz.IGeneratorService;
import com.service.dao.TmAppnoSeqDao;
import com.service.dao.entity.TmAppnoSeqEntity;
import com.service.param.def.SymbolConstant;
import com.service.platform.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * 获取觐见
 */
@Service
public class GeneratorServiceImpl implements IGeneratorService {

    /** 用于操作订单序列号的存储 */
    @Autowired
    private TmAppnoSeqDao tmAppnoSeqDao;


    /**
     * 获取进件单号
     * @return
     */
    @Override
    public String getAppNo() {

        // appNo char 数组
        char[] appNoChars = new char[20];

        // 当前时间
        String nowTime = DateUtils.date2String( new Date(), DateUtils.yyyyMMddHH );
        // 通过数据库 生成订单序列号
        TmAppnoSeqEntity tmAppnoSeqEntity = new TmAppnoSeqEntity();
        tmAppnoSeqEntity.setOrg( SymbolConstant.ORG );
        tmAppnoSeqEntity = tmAppnoSeqDao.saveAndFlush( tmAppnoSeqEntity );

        // 通过数据库生成的seq
        char[] seqChars = new char[]{ '0', '0', '0', '0', '0', '0', '0', '0' };

        char[] dbSeqChars = String.valueOf( tmAppnoSeqEntity.getSeq() ).toCharArray();
        System.arraycopy( dbSeqChars, 0, seqChars, 8 - dbSeqChars.length, dbSeqChars.length );

        // 拼接进件号内容数组
        System.arraycopy( SymbolConstant.MC.toCharArray(), 0, appNoChars, 0, 2 );
        System.arraycopy( nowTime.toCharArray(), 0, appNoChars, 2, 10 );
        System.arraycopy( seqChars, 0, appNoChars, 12, 8 );

        return String.valueOf( appNoChars );
    }
}
