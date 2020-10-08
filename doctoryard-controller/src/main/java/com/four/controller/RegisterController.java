package com.four.controller;

import com.four.entity.Register;
import com.four.service.RegisterService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 挂号(Register)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:37:07
 */
//@RestController
//@RequestMapping("register")
public class RegisterController {
    /**
     * 服务对象
     */
    @Reference
    private RegisterService registerService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Register selectOne(Integer id) {
        return this.registerService.queryById(id);
    }

}