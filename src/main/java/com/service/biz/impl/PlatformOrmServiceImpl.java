package com.service.biz.impl;

import com.service.biz.IPlatformOrmService;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * 由平台提供的 数据库层补充操作服务
 * @author linyang
 * @since 2018.01.03
 */
@Service
public class PlatformOrmServiceImpl implements IPlatformOrmService {

    /**
     * 数据库实体对象管理工厂类
     */
    @Autowired
    private EntityManagerFactory emf;

    /**
     * 批量新增数据
     * @param row 数据库实体类对象列表
     */
    @Override
    public void addByTrans( Object row ) {


        // 获取 entity 管理对象
        EntityManager entityManagerFactory = emf.createEntityManager();

        // 获取 entity 事物管理对象 并启动事物
        EntityTransaction et = entityManagerFactory.getTransaction();
        et.begin();

        // 获取当前数据库回话 并设置绘画缓存刷新机制为手动刷新
        Session session = ( Session ) entityManagerFactory.getDelegate();
        session.setFlushMode( FlushMode.MANUAL );

        // 批量添加数据
         session.save( row );

        // 清理会话数据缓存
        session.flush();
        session.clear();

        // 事物提交
        et.commit();
    }
}
