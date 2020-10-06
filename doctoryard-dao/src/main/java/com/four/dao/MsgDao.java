package com.four.dao;

import com.four.entity.Msg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 文章(Msg)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:05
 */
public interface MsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param msgId 主键
     * @return 实例对象
     */
    Msg queryById(Integer msgId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Msg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param msg 实例对象
     * @return 对象列表
     */
    List<Msg> queryAll(Msg msg);

    /**
     * 新增数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int insert(Msg msg);

    /**
     * 修改数据
     *
     * @param msg 实例对象
     * @return 影响行数
     */
    int update(Msg msg);

    /**
     * 通过主键删除数据
     *
     * @param msgId 主键
     * @return 影响行数
     */
    int deleteById(Integer msgId);

}