package com.four.dao;

import com.four.entity.UserMsg;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 收藏文章(UserMsg)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:25:03
 */
public interface UserMsgDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userMsgId 主键
     * @return 实例对象
     */
    UserMsg queryById(Integer userMsgId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserMsg> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userMsg 实例对象
     * @return 对象列表
     */
    List<UserMsg> queryAll(UserMsg userMsg);

    /**
     * 新增数据
     *
     * @param userMsg 实例对象
     * @return 影响行数
     */
    int insert(UserMsg userMsg);

    /**
     * 修改数据
     *
     * @param userMsg 实例对象
     * @return 影响行数
     */
    int update(UserMsg userMsg);

    /**
     * 通过主键删除数据
     *
     * @param userMsgId 主键
     * @return 影响行数
     */
    int deleteById(Integer userMsgId);

}