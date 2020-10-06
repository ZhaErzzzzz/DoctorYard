package com.four.service;

import com.four.entity.RegistPay;

import java.util.List;

/**
 * 挂号单(RegistPay)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:27:58
 */
public interface RegistPayService {

    /**
     * 通过ID查询单条数据
     *
     * @param registPayId 主键
     * @return 实例对象
     */
    RegistPay queryById(Integer registPayId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RegistPay> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param registPay 实例对象
     * @return 实例对象
     */
    RegistPay insert(RegistPay registPay);

    /**
     * 修改数据
     *
     * @param registPay 实例对象
     * @return 实例对象
     */
    RegistPay update(RegistPay registPay);

    /**
     * 通过主键删除数据
     *
     * @param registPayId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer registPayId);

}