package com.four.service;

import com.four.entity.Doctor;
import com.four.entity.Hospital;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 医生(Doctor)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 11:34:58
 */
public interface DoctorService {

    /**
     * 通过ID查询单条数据
     *
     * @param doctorId 主键
     * @return 实例对象
     */
    Doctor queryById(Integer doctorId);
    Doctor queryByNum(String doctorNum);
    Doctor queryByLastname(String doctorLastname);
    Integer queryByName(String doctorLastname);
    Integer queryHospitalIdByName(String doctorLastname);

    //更换头像
    Integer updateImg(String doctorImg,String doctorNum);
    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Doctor> queryAllByLimit(int offset, int limit);


    PageInfo<Doctor> showAllDoctor(int pageNum, int pageSize);
    /**
     * 根据医院ID查看该医院的所有医生
     * @param hospitalId
     * @return
     */
    List<Doctor> queryByHospitalId(Integer hospitalId);

    PageInfo<Doctor> showByHospitalId(int pageNum, int pageSize,Integer hospitalId);

    //通过科室id查医生
    List<Doctor> queryByDepartmentId(Integer departmentId);
    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    Doctor insert(Doctor doctor);

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    Doctor update(Doctor doctor);

    /**
     * 通过主键删除数据
     *
     * @param doctorId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer doctorId);
    Integer queryHospitalIdByDoctorId(Integer doctorId);
}