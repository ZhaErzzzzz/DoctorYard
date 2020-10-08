package com.four.controller;

import com.four.entity.Heathyfile;
import com.four.service.HeathyfileService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 健康档案(Heathyfile)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:22
 */
//@RestController
//@RequestMapping("heathyfile")
public class HeathyfileController {
    /**
     * 服务对象
     */
    @Reference
    private HeathyfileService heathyfileService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Heathyfile selectOne(Integer id) {
        return this.heathyfileService.queryById(id);
    }

}