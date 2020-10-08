package com.four.controller;

import com.four.entity.Dhonor;
import com.four.service.DhonorService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 医生荣誉技能(Dhonor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:35:56
 */
@RestController
@RequestMapping("dhonor")
public class DhonorController {
    /**
     * 服务对象
     */
    @Reference
    private DhonorService dhonorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Dhonor selectOne(Integer id) {
        return this.dhonorService.queryById(id);
    }

    @GetMapping("selectByDoctorId")
    public Dhonor queryByDoctorId(Integer doctorId){
      return   dhonorService.queryByDoctorId(doctorId);
    };

}