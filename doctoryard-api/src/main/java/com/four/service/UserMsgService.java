package com.four.service;

import com.four.entity.UserMsg;

import java.util.List;

/**
 * 收藏文章(UserMsg)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:28:22
 */
public interface UserMsgService {

    /**
     * 通过ID查询单条数据
     *
     * @param userMsgId 主键
     * @return 实例对象
     */
    UserMsg queryById(Integer userMsgId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserMsg> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userMsg 实例对象
     * @return 实例对象
     */
    UserMsg insert(UserMsg userMsg);

    /**
     * 修改数据
     *
     * @param userMsg 实例对象
     * @return 实例对象
     */
    UserMsg update(UserMsg userMsg);

    /**
     * 通过主键删除数据
     *
     * @param userMsgId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userMsgId);

}