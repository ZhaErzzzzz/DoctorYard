package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.OrderDrug;
import com.four.service.OrderDrugService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 加入购物车的药品(OrderDrug)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:50
 */
@RestController
@RequestMapping("orderDrug")
public class OrderDrugController {
    /**
     * 服务对象
     */
    @Reference
    private OrderDrugService orderDrugService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public OrderDrug selectOne(Integer id) {
        return this.orderDrugService.queryById(id);
    }

}