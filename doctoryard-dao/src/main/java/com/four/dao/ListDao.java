package com.four.dao;

import com.four.entity.List;
import org.apache.ibatis.annotations.Param;

/**
 * 总订单(List)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:23:50
 */
public interface ListDao {

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    List queryById(Integer listId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<List> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param list 实例对象
     * @return 对象列表
     */
    List<List> queryAll(List list);

    /**
     * 新增数据
     *
     * @param list 实例对象
     * @return 影响行数
     */
    int insert(List list);

    /**
     * 修改数据
     *
     * @param list 实例对象
     * @return 影响行数
     */
    int update(List list);

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 影响行数
     */
    int deleteById(Integer listId);

}