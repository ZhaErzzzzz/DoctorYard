package com.four.controller;

import com.four.entity.DrugDoctor;
import com.four.service.DrugDoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 历史处方记录(DrugDoctor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:16
 */
@RestController
@RequestMapping("drugDoctor")
public class DrugDoctorController {
    /**
     * 服务对象
     */
    @Resource
    private DrugDoctorService drugDoctorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DrugDoctor selectOne(Integer id) {
        return this.drugDoctorService.queryById(id);
    }

}