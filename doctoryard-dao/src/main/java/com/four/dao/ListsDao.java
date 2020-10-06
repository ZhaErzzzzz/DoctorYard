package com.four.dao;

import com.four.entity.Lists;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 总订单(Lists)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 16:50:07
 */
@Mapper
@Repository
public interface ListsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    Lists queryById(Integer listId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Lists> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param lists 实例对象
     * @return 对象列表
     */
    List<Lists> queryAll(Lists lists);

    /**
     * 新增数据
     *
     * @param lists 实例对象
     * @return 影响行数
     */
    int insert(Lists lists);

    /**
     * 修改数据
     *
     * @param lists 实例对象
     * @return 影响行数
     */
    int update(Lists lists);

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 影响行数
     */
    int deleteById(Integer listId);

}