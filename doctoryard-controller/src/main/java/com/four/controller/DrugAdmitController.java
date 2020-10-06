package com.four.controller;

import com.four.entity.DrugAdmit;
import com.four.service.DrugAdmitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户可购处方药(DrugAdmit)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:09
 */
@RestController
@RequestMapping("drugAdmit")
public class DrugAdmitController {
    /**
     * 服务对象
     */
    @Resource
    private DrugAdmitService drugAdmitService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public DrugAdmit selectOne(id) {
        return this.drugAdmitService.queryById(id);
    }

}