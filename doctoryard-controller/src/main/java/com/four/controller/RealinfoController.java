package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.Realinfo;
import com.four.service.RealinfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 真实信息(Realinfo)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:56
 */
@RestController
@RequestMapping("realinfo")
public class RealinfoController {
    /**
     * 服务对象
     */
    @Reference
    private RealinfoService realinfoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Realinfo selectOne(Integer id) {
        return this.realinfoService.queryById(id);
    }

}