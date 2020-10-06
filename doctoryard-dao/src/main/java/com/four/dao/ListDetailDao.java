package com.four.dao;

import com.four.entity.ListDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单详情(ListDetail)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:23:56
 */
@Mapper
@Repository
public interface ListDetailDao {

    /**
     * 通过ID查询单条数据
     *
     * @param listDetailId 主键
     * @return 实例对象
     */
    ListDetail queryById(Integer listDetailId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<ListDetail> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param listDetail 实例对象
     * @return 对象列表
     */
    List<ListDetail> queryAll(ListDetail listDetail);

    /**
     * 新增数据
     *
     * @param listDetail 实例对象
     * @return 影响行数
     */
    int insert(ListDetail listDetail);

    /**
     * 修改数据
     *
     * @param listDetail 实例对象
     * @return 影响行数
     */
    int update(ListDetail listDetail);

    /**
     * 通过主键删除数据
     *
     * @param listDetailId 主键
     * @return 影响行数
     */
    int deleteById(Integer listDetailId);

}