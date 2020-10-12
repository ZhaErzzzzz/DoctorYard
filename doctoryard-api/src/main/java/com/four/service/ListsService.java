package com.four.service;

import com.four.entity.Lists;

import java.util.List;

/**
 * 总订单(Lists)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 16:50:27
 */
public interface ListsService {

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    Lists queryById(Integer listId);

    List<Lists> queryByUserId(Integer userId);

    List<Integer> queryListIdByUserId(Integer userId);

    List<Integer> queryAddressIdByUserId(Integer userId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Lists> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param lists 实例对象
     * @return 实例对象
     */
    Lists insert(Lists lists);

    /**
     * 修改数据
     *
     * @param lists 实例对象
     * @return 实例对象
     */
    Lists update(Lists lists);

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer listId);

}