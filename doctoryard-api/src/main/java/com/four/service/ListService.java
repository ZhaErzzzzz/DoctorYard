package com.four.service;

import com.four.entity.List;

/**
 * 总订单(List)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:27:01
 */
public interface ListService {

    /**
     * 通过ID查询单条数据
     *
     * @param listId 主键
     * @return 实例对象
     */
    List queryById(Integer listId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<List> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param list 实例对象
     * @return 实例对象
     */
    List insert(List list);

    /**
     * 修改数据
     *
     * @param list 实例对象
     * @return 实例对象
     */
    List update(List list);

    /**
     * 通过主键删除数据
     *
     * @param listId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer listId);

}