package com.four.controller;

import com.alibaba.fastjson.JSONObject;
import com.four.entity.Doctor;
import com.four.entity.User;
import com.four.service.DepartmentService;
import com.four.service.DoctorService;
import com.four.service.HospitalService;
import com.four.util.RedisUtil;
import com.four.util.Result;
import com.four.util.ResultCode;
import com.four.util.ResultFactory;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.*;

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
    @Reference
    private DoctorService doctorService;

    @Reference
    private DepartmentService departmentService;

    @Reference
    private HospitalService hospitalService;

    @Autowired
    private RedisUtil redisUtil;
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

    //更换头像
    @GetMapping(produces = "application/json; charset=utf-8",path ="noToken/updateImg/{doctorImg}/{doctorNum}")
    public Result updateImg(@PathVariable String doctorImg,@PathVariable String doctorNum) {
        int len=doctorService.updateImg(doctorImg,doctorNum);
        if(len==1){
            return ResultFactory.setResultSuccess();
        }else {
            return  ResultFactory.setResultError();
        }

    }
    @PostMapping("noToken/login")
    public Result login(@RequestBody Doctor doctor) {
        Doctor d=doctorService.queryByNum(doctor.getDoctorNum());
        if(d==null){
            //账户错误
            return  ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"用户名或密码错误，请重新登录");
        }else{
            //1、验证密码
            if(!d.getDoctorPwd().equals(doctor.getDoctorPwd())){
                //账号正确，密码错误
                return ResultFactory.setResultError(ResultCode.HTTP_RES_CODE_500,"用户名或密码错误，请重新登录");
            }else {
                //2、账号正确，密码正确
//                String token=BCrypt.hashpw(d.getDoctorNum(),BCrypt.gensalt());
                //4、token存入redis
//                redisUtil.set(token,d.getDoctorNum(),24*60*60*1000);//1天
                JSONObject data = new JSONObject();
//                //6、将只包含d和username的对象,存入data
//                data.put("token",token);
                data.put("doctor",d);
                //7、返回数据
                return ResultFactory.setResultSuccess(data);
            }

        }
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

}