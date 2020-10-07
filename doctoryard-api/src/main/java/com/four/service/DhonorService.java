package com.four.service;

import com.four.entity.Dhonor;

import java.util.List;

/**
 * 医生荣誉技能(Dhonor)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:25:49
 */
public interface DhonorService {

    /**
     * 通过ID查询单条数据
     *
     * @param dhonorId 主键
     * @return 实例对象
     */
    Dhonor queryById(Integer dhonorId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dhonor> queryAllByLimit(int offset, int limit);

    /**
     * 通过医生id查找医生荣誉
     * @param doctorId
     * @return
     */
    Dhonor queryByDoctorId(Integer doctorId);

    /**
     * 新增数据
     *
     * @param dhonor 实例对象
     * @return 实例对象
     */
    Dhonor insert(Dhonor dhonor);

    /**
     * 修改数据
     *
     * @param dhonor 实例对象
     * @return 实例对象
     */
    Dhonor update(Dhonor dhonor);

    /**
     * 通过主键删除数据
     *
     * @param dhonorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer dhonorId);

}