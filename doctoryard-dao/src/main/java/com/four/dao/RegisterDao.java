package com.four.dao;

import com.four.entity.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 挂号(Register)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:24:39
 */
@Mapper
@Repository
public interface RegisterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param registerId 主键
     * @return 实例对象
     */
    Register queryById(Integer registerId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Register> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param register 实例对象
     * @return 对象列表
     */
    List<Register> queryAll(Register register);

    /**
     * 新增数据
     *
     * @param register 实例对象
     * @return 影响行数
     */
    int insert(Register register);

    /**
     * 修改数据
     *
     * @param register 实例对象
     * @return 影响行数
     */
    int update(Register register);

    /**
     * 通过主键删除数据
     *
     * @param registerId 主键
     * @return 影响行数
     */
    int deleteById(Integer registerId);

}