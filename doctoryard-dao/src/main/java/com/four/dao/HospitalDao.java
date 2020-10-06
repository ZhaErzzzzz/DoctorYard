package com.four.dao;

import com.four.entity.Hospital;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 医院(Hospital)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 11:33:06
 */
public interface HospitalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalId 主键
     * @return 实例对象
     */
    Hospital queryById(Integer hospitalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hospital> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param hospital 实例对象
     * @return 对象列表
     */
    List<Hospital> queryAll(Hospital hospital);

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 影响行数
     */
    int insert(Hospital hospital);

    /**
     * 修改数据
     *
     * @param hospital 实例对象
     * @return 影响行数
     */
    int update(Hospital hospital);

    /**
     * 通过主键删除数据
     *
     * @param hospitalId 主键
     * @return 影响行数
     */
    int deleteById(Integer hospitalId);

}