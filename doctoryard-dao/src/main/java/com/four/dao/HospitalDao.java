package com.four.dao;

import com.four.entity.Hospital;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 医院(Hospital)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 11:33:06
 */
@Mapper
@Repository
public interface HospitalDao {

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalId 主键
     * @return 实例对象
     */
    @Select("select * from hospital where hospital_id=#{hospitalId}")
    Hospital queryById(Integer hospitalId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Hospital> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

//    /**
//     * 根据医生id查医院信息
//     * @param doctorId
//     * @return
//     */
//    @Select("select * from hospital where hospital_id=#{}")
//    Hospital queryByDoctorId(Integer doctorId);
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @Select("select * from hospital order by hospital_id desc")
    List<Hospital> queryAll();

    /**
     * 新增数据
     *
     * @param hospital 实例对象
     * @return 影响行数
     */
    int insert(Hospital hospital);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hospital> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Hospital> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hospital> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Hospital> entities);

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