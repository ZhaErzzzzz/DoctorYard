package com.four.dao;

import com.four.entity.UserDoctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 收藏医生(UserDoctor)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:54
 */
public interface UserDoctorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userDoctorId 主键
     * @return 实例对象
     */
    UserDoctor queryById(Integer userDoctorId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<UserDoctor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param userDoctor 实例对象
     * @return 对象列表
     */
    List<UserDoctor> queryAll(UserDoctor userDoctor);

    /**
     * 新增数据
     *
     * @param userDoctor 实例对象
     * @return 影响行数
     */
    int insert(UserDoctor userDoctor);

    /**
     * 修改数据
     *
     * @param userDoctor 实例对象
     * @return 影响行数
     */
    int update(UserDoctor userDoctor);

    /**
     * 通过主键删除数据
     *
     * @param userDoctorId 主键
     * @return 影响行数
     */
    int deleteById(Integer userDoctorId);

}