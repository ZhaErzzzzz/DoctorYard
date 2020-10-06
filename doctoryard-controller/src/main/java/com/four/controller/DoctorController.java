package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.Doctor;
import com.four.service.DoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Doctor selectOne(Integer id) {
        return this.doctorService.queryById(id);
    }

}