package com.service.biz;

import org.springframework.stereotype.Component;

/**
 * 标准化信息服务 生成序列号 流水号 合同号等 <br>
 * @author linyang
 * @since 2017.12.24
 */
@Component
public interface IGeneratorService {

    /**
     * 获取进件单号
     * @return
     */
    public String getAppNo();

}
