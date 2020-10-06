package com.four.dao;

import com.four.entity.Drug;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 药品(Drug)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:23:15
 */
@Mapper
@Repository
public interface DrugDao {

    /**
     * 通过ID查询单条数据
     *
     * @param drugId 主键
     * @return 实例对象
     */
    Drug queryById(Integer drugId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Drug> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param drug 实例对象
     * @return 对象列表
     */
    List<Drug> queryAll(Drug drug);

    /**
     * 新增数据
     *
     * @param drug 实例对象
     * @return 影响行数
     */
    int insert(Drug drug);

    /**
     * 修改数据
     *
     * @param drug 实例对象
     * @return 影响行数
     */
    int update(Drug drug);

    /**
     * 通过主键删除数据
     *
     * @param drugId 主键
     * @return 影响行数
     */
    int deleteById(Integer drugId);

}