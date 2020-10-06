package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.RegistPay;
import com.four.service.RegistPayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 挂号单(RegistPay)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:37:02
 */
@RestController
@RequestMapping("registPay")
public class RegistPayController {
    /**
     * 服务对象
     */
    @Reference
    private RegistPayService registPayService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RegistPay selectOne(Integer id) {
        return this.registPayService.queryById(id);
    }

}