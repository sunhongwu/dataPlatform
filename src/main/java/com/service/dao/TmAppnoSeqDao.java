package com.service.dao;

import com.service.dao.entity.TmAppnoSeqEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用于操作订单序列号的存储
 * @author linyang
 * @since 2017.12.24
 */
public interface TmAppnoSeqDao extends JpaRepository<TmAppnoSeqEntity, Integer>{
}
