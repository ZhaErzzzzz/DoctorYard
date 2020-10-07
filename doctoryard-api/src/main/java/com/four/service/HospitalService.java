package com.four.service;

import com.four.entity.Hospital;

import java.util.List;

/**
 * 医院(Hospital)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 11:35:32
 */
public interface HospitalService {

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalId 主键
     * @return 实例对象
     */
    Hospital queryById(Integer hospitalId);

    /**
     *
     * @param doctorId
     * @return
     */


    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hospital> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    Hospital insert(Hospital hospital);

    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 实例对象
     */
    Hospital update(Hospital hospital);

    /**
     * 通过主键删除数据
     *
     * @param hospitalId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer hospitalId);

}