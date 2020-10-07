package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.four.entity.Hospital;
import com.four.service.HospitalService;
import com.github.pagehelper.PageInfo;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

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
//    @Resource
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


    @RequestMapping("showHospital")
    public Object getHospital(@RequestBody @RequestParam(defaultValue = "1")int pageNum){
        PageInfo pageInfo=hospitalService.showAllHospital(pageNum,6);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("pageInfo",pageInfo);
        return jsonObject;
    }

}