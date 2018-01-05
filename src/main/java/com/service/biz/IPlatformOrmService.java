package com.service.biz;

import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

/**
 * 由平台提供的 数据库层补充操作服务<br>
 * 主要用于处理 spring-data-jpa 中 由于数据缓存引起的异常问题
 * @author linyang
 * @since 2018.01.03
 */
@Component
public interface IPlatformOrmService {

    /**
     * 新增数据 含数据库事物
     * @param row  数据库实体类对象列表
     */
    public void addByTrans( Object row );

}
