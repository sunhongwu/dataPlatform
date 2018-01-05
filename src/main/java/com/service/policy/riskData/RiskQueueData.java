package com.service.policy.riskData;

import java.io.Serializable;

/**
 * 风控队列的传入参数
 * @author linyang
 * @since 2018.01.02
 */
public class RiskQueueData implements Serializable {

    private String appNo;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }
}
