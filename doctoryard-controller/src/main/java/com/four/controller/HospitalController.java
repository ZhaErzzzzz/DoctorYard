package com.four.controller;

import com.four.entity.Hospital;
import com.four.service.HospitalService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 医院(Hospital)表控制层
 *
 * @author makejava
 * @since 2020-10-06 11:37:24
 */
@RestController
@RequestMapping("hospital")
public class HospitalController {
    /**
     * 服务对象
     */
    @Reference
    private HospitalService hospitalService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Hospital selectOne(Integer id) {
        return this.hospitalService.queryById(id);
    }


    @GetMapping("showHospital")
    public Object getHospital1(){
        PageInfo pageInfo=hospitalService.showAllHospital( 1,3);
        return pageInfo;
    }
    @GetMapping(produces = "application/json; charset=utf-8",path ="showHospital/{pageNum}")
    public Object getHospital2(@PathVariable int pageNum){
        PageInfo     pageInfo=hospitalService.showAllHospital( pageNum,3);
        return pageInfo;
    }

}