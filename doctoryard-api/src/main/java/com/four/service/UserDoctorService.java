package com.four.service;

import com.four.entity.UserDoctor;

import java.util.List;

/**
 * 收藏医生(UserDoctor)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:28:14
 */
public interface UserDoctorService {

    /**
     * 通过ID查询单条数据
     *
     * @param userDoctorId 主键
     * @return 实例对象
     */
    UserDoctor queryById(Integer userDoctorId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserDoctor> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param userDoctor 实例对象
     * @return 实例对象
     */
    UserDoctor insert(UserDoctor userDoctor);

    /**
     * 修改数据
     *
     * @param userDoctor 实例对象
     * @return 实例对象
     */
    UserDoctor update(UserDoctor userDoctor);

    /**
     * 通过主键删除数据
     *
     * @param userDoctorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer userDoctorId);

}