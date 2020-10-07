package com.four.service;

import com.four.entity.Register;

import java.util.List;

/**
 * 挂号(Register)表服务接口
 *
 * @author makejava
 * @since 2020-10-07 19:17:33
 */
public interface RegisterService {

    /**
     * 通过ID查询单条数据
     *
     * @param registerId 主键
     * @return 实例对象
     */
    Register queryById(Integer registerId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Register> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param register 实例对象
     * @return 实例对象
     */
    Register insert(Register register);

    /**
     * 修改数据
     *
     * @param register 实例对象
     * @return 实例对象
     */
    Register update(Register register);

    /**
     * 通过主键删除数据
     *
     * @param registerId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer registerId);

}