package com.four.controller;

import com.four.entity.Doctor;
import com.four.service.DepartmentService;
import com.four.service.DoctorService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 医生(Doctor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 11:36:59
 */
//@RestController
//@RequestMapping("doctor")
public class DoctorController {
    /**
     * 服务对象
     */
    @org.apache.dubbo.config.annotation.Reference
    private DoctorService doctorService;

    @Reference
    private DepartmentService departmentService;

    /**
     * 通过主键查询单条数据
     *
     * @param doctorId 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Doctor selectOne(Integer doctorId) {
        return this.doctorService.queryById(doctorId);
    }

    @GetMapping("selectByHospitalId")
    public List<Doctor> selectByHospitalId(Integer hospitalId){
        List<Doctor> doctorList=doctorService.queryByHospitalId(hospitalId);
        return doctorList;
    };

    //根据医生id查同院的医生
    @GetMapping("selectByDoctorId")
    public List<Doctor> selectByDoctorId(Integer doctorId){
      return selectByHospitalId( doctorService.queryHospitalIdByDoctorId(doctorId));
    }

    //通过科室名字先查科室id，再根据科室id查该科室的医生
    @GetMapping("selectByDepartmentId")
    public List<Doctor> selectByDepartmentId(String departmentName){
        List<Doctor> doctorList = new ArrayList<>();
       List<Integer> departmentId =departmentService.queryDepartmentIdByDepartmentName(departmentName);
        for(Integer id:departmentId) {
            doctorList.addAll(doctorService.queryByDepartmentId(1));
        }
        return doctorList;
    }

}