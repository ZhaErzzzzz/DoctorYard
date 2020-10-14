package com.four.dao;

import com.four.entity.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 医生(Doctor)表数据库访问层
 *
 * @author makejava
 * @since 2020-10-06 11:34:25
 */
@Mapper
@Repository
public interface DoctorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param doctorId 主键
     * @return 实例对象
     */
    @Select("select * from doctor where doctor_id=#{doctorId}")
    Doctor queryById(Integer doctorId);
    @Select("select * from doctor where doctor_num=#{doctorNum}")
    Doctor queryByNum(String doctorNum);

    @Update("update doctor set doctor_img=#{doctorImg} where doctor_num=#{doctorNum}")
    Integer updateImg(String doctorImg,String doctorNum);

    @Select("select * from doctor where doctor_lastname=#{doctorLastname}")
    Doctor queryByLastname(String doctorLastname);

    @Select("select doctor_id from doctor where doctor_lastname=#{doctorLastname}")
    Integer queryByName(String doctorLastname);

    @Select("select hospital_id from doctor where doctor_lastname=#{doctorLastname}")
    Integer queryHospitalIdByName(String doctorLastname);



    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Doctor> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    /**
     *
     * @param hospitalId
     * @return
     */
    @Select("select * from doctor where hospital_id=#{hospitalId}")
    List<Doctor> queryByHospitalId(Integer hospitalId);
    /**
     * 通过实体作为筛选条件查询
     *
     * @return 对象列表
     */
    @Select("select * from doctor order by doctor_id desc")
    List<Doctor> queryAll();

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int insert(Doctor doctor);

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int update(Doctor doctor);

    /**
     * 通过主键删除数据
     *
     * @param doctorId 主键
     * @return 影响行数
     */
    int deleteById(Integer doctorId);

    /**
     * 根据医生id查医生所在医院id
     * @param doctorId
     * @return
     */
    @Select("select hospital_id from doctor where doctor_id=#{doctorId}")
    Integer queryHospitalIdBydoctorId(Integer doctorId);

    @Select("select * from doctor where department_id=#{departmentId}")
    List<Doctor> queryByDepartmentId(Integer departmentId);

}