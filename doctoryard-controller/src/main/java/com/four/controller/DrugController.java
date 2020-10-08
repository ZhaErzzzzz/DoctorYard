package com.four.controller;

import com.four.entity.Drug;
import com.four.service.DrugService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 药品(Drug)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:02
 */
//@RestController
//@RequestMapping("drug")
public class DrugController {
    /**
     * 服务对象
     */
    @Reference
    private DrugService drugService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Drug selectOne(Integer id) {
        return this.drugService.queryById(id);
    }

}