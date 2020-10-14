package com.four.dao;

import com.four.entity.DrugAdmit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户可购处方药(DrugAdmit)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 17:00:53
 */
@Mapper
@Repository
public interface DrugAdmitDao {

    /**
     * 通过ID查询单条数据
     *
     * @param drugAdmitId 主键
     * @return 实例对象
     */
    DrugAdmit queryById(Integer drugAdmitId);

    @Select("SELECT drug_id FROM drug_admit WHERE user_id=#{userId}")
    List<Integer> queryDrugIdByUserId(Integer userId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<DrugAdmit> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param drugAdmit 实例对象
     * @return 对象列表
     */
    List<DrugAdmit> queryAll(DrugAdmit drugAdmit);

    /**
     * 新增数据
     *
     * @param drugAdmit 实例对象
     * @return 影响行数
     */
    int insert(DrugAdmit drugAdmit);

    /**
     * 修改数据
     *
     * @param drugAdmit 实例对象
     * @return 影响行数
     */
    int update(DrugAdmit drugAdmit);

    /**
     * 通过主键删除数据
     *
     * @param drugAdmitId 主键
     * @return 影响行数
     */
    int deleteById(Integer drugAdmitId);

}