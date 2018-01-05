package com.service.policy.riskData;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 渠道 风控数据 获取服务标准化 抽象类<br>\
 * 各 渠道 风控数据获取服务都应遵循当前抽象服务定义的标准接口
 * @author linyang
 * @since 2018.01.03
 */
public abstract class ChannelRiskDataServiceAbs {

    /**
     * 获取风控数据 并将数据入库
     * @param appNo                 进件编号
     * @param policiedPersonInfos   需要查询风控数据的人员信息
     * @param threadCounter         线程计数器
     * @return
     */
    public abstract boolean getRiskData( String appNo, List<PoliciedPersonInfo> policiedPersonInfos, CountDownLatch threadCounter );

}
