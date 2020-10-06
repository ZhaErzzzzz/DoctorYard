package com.four.service;

import com.four.entity.DrugDoctor;

import java.util.List;

/**
 * 历史处方记录(DrugDoctor)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:26:11
 */
public interface DrugDoctorService {

    /**
     * 通过ID查询单条数据
     *
     * @param drugDoctorId 主键
     * @return 实例对象
     */
    DrugDoctor queryById(Integer drugDoctorId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DrugDoctor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param drugDoctor 实例对象
     * @return 实例对象
     */
    DrugDoctor insert(DrugDoctor drugDoctor);

    /**
     * 修改数据
     *
     * @param drugDoctor 实例对象
     * @return 实例对象
     */
    DrugDoctor update(DrugDoctor drugDoctor);

    /**
     * 通过主键删除数据
     *
     * @param drugDoctorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drugDoctorId);

}