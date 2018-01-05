package com.service.dao;

import com.service.dao.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 测试持久化层
 * @author : linyang
 * @since : 2017.08.14
 */
@Repository
public interface TestDao extends JpaRepository<TestEntity, Long> {

    /**
     * 测试用过接口执行sql语句
     * @param id
     * @return
     */
    @Query( value = "select t.a, t.id from test t where t.id = ?1", nativeQuery = true )
    public TestEntity testInterfaceSql(long id);

    /**
     * 测试多表sql查询</br>
     * 推荐 用于减少非必要的实体类创建
     * @return
     */
    @Query( value = "select t.a as a, t.id as id from test t left join tm_app_main m on t.a = m.app_no", nativeQuery = true )
    public List<List<Object>> testMutiTableSql();
}
