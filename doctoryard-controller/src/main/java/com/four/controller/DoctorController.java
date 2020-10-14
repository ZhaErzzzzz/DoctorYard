package com.four.controller;

import com.four.entity.Doctor;
import com.four.entity.Hospital;
import com.four.service.DepartmentService;
import com.four.service.DoctorService;
import com.four.service.HospitalService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 医生(Doctor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 11:36:59
 */
@RestController
@RequestMapping("doctor")
public class DoctorController {
    /**
     * 服务对象
     */
    @org.apache.dubbo.config.annotation.Reference
    private DoctorService doctorService;

    @Reference
    private DepartmentService departmentService;

    @Reference
    private HospitalService hospitalService;

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
    }

    //根据医生id查同院的医生
    @GetMapping("selectByDoctorId")
    public List<Doctor> selectByDoctorId(Integer doctorId){
      return selectByHospitalId( doctorService.queryHospitalIdByDoctorId(doctorId));
    }
    //根据医生id查同院的医生,加上分页
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDoctorByHospitalId/{hospitalName}")
    public Object selectByDoctorId1(@PathVariable String hospitalName){
        Integer hospitalId= hospitalService.queryByName1(hospitalName);
      PageInfo pageInfo=doctorService.showByHospitalId(1,3,hospitalId);
      return pageInfo;
    }
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDoctorByHospitalId/{hospitalName}/{pageNum}")
    public Object selectByDoctorId2(@PathVariable int pageNum,@PathVariable String hospitalName){
        Integer hospitalId= hospitalService.queryByName1(hospitalName);
      PageInfo pageInfo=doctorService.showByHospitalId(pageNum,3,hospitalId);
      return pageInfo;
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

    @GetMapping("showAllDoctor")
    public Object showAllDoctor1(){
      PageInfo pageInfo= doctorService.showAllDoctor(1,4);
      return  pageInfo;
    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showAllDoctor/{pageNum}")
    public Object showAllDoctor2(@PathVariable int pageNum){
        PageInfo pageInfo=doctorService.showAllDoctor(pageNum,4);
        return  pageInfo;

    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showOneDoctor/{doctorId}")
    public Object showOneDoctor(@PathVariable int doctorId){
       return doctorService.queryById(doctorId);

    }
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDoctorInOneHospital/{doctorId}")
    public List<Doctor> showDoctorInOneHospital(@PathVariable int doctorId){
       Integer hospitalId =doctorService.queryHospitalIdByDoctorId(doctorId);
      return doctorService.queryByHospitalId(hospitalId);

    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showCountByHospitalName/{hospitalName}")
    public Integer showCountByHospitalName(@PathVariable String hospitalName){
      Integer hospitalId =  hospitalService.queryByName1(hospitalName);
       Integer num=doctorService.queryCountByHospitalId(hospitalId);
       return  num;
    }

}