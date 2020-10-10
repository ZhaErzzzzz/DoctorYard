package com.four.dao;

import com.four.entity.Dhonor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 医生荣誉技能(Dhonor)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 15:22:57
 */
@Mapper
@Repository
public interface DhonorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param dhonorId 主键
     * @return 实例对象
     */

    @Select("select * from dhonor where doctor_id=#{dhonorId}")
    Dhonor queryById(Integer dhonorId);



    /**
     *
     * @param doctorId
     * @return
     */
    @Select("select * from dhonor where doctor_id=#{doctorId}")
   List <Dhonor> queryByDoctorId(Integer doctorId);
    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dhonor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dhonor 实例对象
     * @return 对象列表
     */
    List<Dhonor> queryAll(Dhonor dhonor);

    /**
     * 新增数据
     *
     * @param dhonor 实例对象
     * @return 影响行数
     */
    int insert(Dhonor dhonor);

    /**
     * 修改数据
     *
     * @param dhonor 实例对象
     * @return 影响行数
     */
    int update(Dhonor dhonor);

    /**
     * 通过主键删除数据
     *
     * @param dhonorId 主键
     * @return 影响行数
     */
    int deleteById(Integer dhonorId);

}