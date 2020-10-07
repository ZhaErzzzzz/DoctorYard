package com.four.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.four.dao.DoctorDao;
import com.four.entity.Doctor;
import com.four.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 医生(Doctor)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 11:36:37
 */
@Service
@Component
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorDao doctorDao;

    /**
     * 通过ID查询单条数据
     *
     * @param doctorId 主键
     * @return 实例对象
     */
    @Override
    public Doctor queryById(Integer doctorId) {
        return this.doctorDao.queryById(doctorId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Doctor> queryAllByLimit(int offset, int limit) {
        return this.doctorDao.queryAllByLimit(offset, limit);
    }

    /**
     *
     * @param hospitalId
     * @return
     */
    @Override
    public List<Doctor> queryByHospitalId(Integer hospitalId) {
        return doctorDao.queryByHospitalId(hospitalId);
    }

    @Override
    public List<Doctor> queryByDepartmentId(Integer departmentId) {

        return doctorDao.queryByDepartmentId(departmentId);
    }

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    @Override
    public Doctor insert(Doctor doctor) {
        this.doctorDao.insert(doctor);
        return doctor;
    }

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 实例对象
     */
    @Override
    public Doctor update(Doctor doctor) {
        this.doctorDao.update(doctor);
        return this.queryById(doctor.getDoctorId());
    }

    /**
     * 通过主键删除数据
     *
     * @param doctorId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer doctorId) {
        return this.doctorDao.deleteById(doctorId) > 0;
    }

    @Override
    public Integer queryHospitalIdByDoctorId(Integer doctorId) {
        return doctorDao.queryHospitalIdBydoctorId(doctorId);
    }
}