package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.ListDetail;
import com.four.service.ListDetailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 订单详情(ListDetail)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:35
 */
@RestController
@RequestMapping("listDetail")
public class ListDetailController {
    /**
     * 服务对象
     */
    @Reference
    private ListDetailService listDetailService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public ListDetail selectOne(Integer id) {
        return this.listDetailService.queryById(id);
    }

}