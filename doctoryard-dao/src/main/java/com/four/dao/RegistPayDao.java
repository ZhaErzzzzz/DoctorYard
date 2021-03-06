package com.four.dao;

import com.four.entity.RegistPay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 挂号单(RegistPay)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:32
 */
@Mapper
@Repository
public interface RegistPayDao {

    /**
     * 通过ID查询单条数据
     *
     * @param registPayId 主键
     * @return 实例对象
     */
    RegistPay queryById(Integer registPayId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RegistPay> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param registPay 实例对象
     * @return 对象列表
     */
    List<RegistPay> queryAll(RegistPay registPay);

    /**
     * 新增数据
     *
     * @param registPay 实例对象
     * @return 影响行数
     */
    int insert(RegistPay registPay);

    /**
     * 修改数据
     *
     * @param registPay 实例对象
     * @return 影响行数
     */
    int update(RegistPay registPay);

    /**
     * 通过主键删除数据
     *
     * @param registPayId 主键
     * @return 影响行数
     */
    int deleteById(Integer registPayId);

}