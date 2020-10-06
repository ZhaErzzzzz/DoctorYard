package com.four.service;

import com.four.entity.DrugAdmit;

import java.util.List;

/**
 * 用户可购处方药(DrugAdmit)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 17:01:03
 */
public interface DrugAdmitService {

    /**
     * 通过ID查询单条数据
     *
     * @param drugAdmitId 主键
     * @return 实例对象
     */
    DrugAdmit queryById(Integer drugAdmitId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DrugAdmit> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param drugAdmit 实例对象
     * @return 实例对象
     */
    DrugAdmit insert(DrugAdmit drugAdmit);

    /**
     * 修改数据
     *
     * @param drugAdmit 实例对象
     * @return 实例对象
     */
    DrugAdmit update(DrugAdmit drugAdmit);

    /**
     * 通过主键删除数据
     *
     * @param drugAdmitId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drugAdmitId);

}