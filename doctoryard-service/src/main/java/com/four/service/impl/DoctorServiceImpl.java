package com.four.service.impl;

import com.four.dao.DoctorDao;
import com.four.entity.Doctor;
import com.four.entity.Msg;
import com.four.service.DoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
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

    @Override
    public Doctor queryByLastname(String doctorLastname) {
        return doctorDao.queryByLastname(doctorLastname);
    }

    @Override
    public Integer queryByName(String doctorLastname) {
        return doctorDao.queryByName(doctorLastname);
    }

    @Override
    public Integer queryHospitalIdByName(String doctorLastname) {
        return doctorDao.queryHospitalIdByName(doctorLastname);
    }

    @Override
    public Integer queryCountByHospitalId(Integer hospitalId) {
        return doctorDao.queryCountByHospitalId(hospitalId);
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

    @Override
    public PageInfo<Doctor> showAllDoctor(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Doctor> list = doctorDao.queryAll();
        PageInfo<Doctor> pageInfo = new PageInfo<>(list);

        return pageInfo;
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
    public PageInfo<Doctor> showByHospitalId(int pageNum, int pageSize,Integer hospitalId) {
        PageHelper.startPage(pageNum, pageSize);
       List<Doctor> list = doctorDao.queryByHospitalId(hospitalId);
       PageInfo<Doctor> pageInfo = new PageInfo<>(list);
        return pageInfo;
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