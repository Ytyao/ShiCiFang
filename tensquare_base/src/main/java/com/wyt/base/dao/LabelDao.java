package com.wyt.base.dao;

import com.wyt.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 标签业务-数据访问接口
 * JpaRepository-基本的增删改查
 * JpaSpecificationExecutor-复杂的条件查询
 */
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {
}
