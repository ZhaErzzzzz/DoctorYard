package com.four.dao;

import com.four.entity.DrugDoctor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 历史处方记录(DrugDoctor)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:23:30
 */
public interface DrugDoctorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param drugDoctorId 主键
     * @return 实例对象
     */
    DrugDoctor queryById(Integer drugDoctorId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DrugDoctor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param drugDoctor 实例对象
     * @return 对象列表
     */
    List<DrugDoctor> queryAll(DrugDoctor drugDoctor);

    /**
     * 新增数据
     *
     * @param drugDoctor 实例对象
     * @return 影响行数
     */
    int insert(DrugDoctor drugDoctor);

    /**
     * 修改数据
     *
     * @param drugDoctor 实例对象
     * @return 影响行数
     */
    int update(DrugDoctor drugDoctor);

    /**
     * 通过主键删除数据
     *
     * @param drugDoctorId 主键
     * @return 影响行数
     */
    int deleteById(Integer drugDoctorId);

}