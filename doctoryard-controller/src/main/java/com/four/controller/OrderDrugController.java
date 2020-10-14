package com.four.controller;

import com.four.entity.OrderDrug;
import com.four.entity.OrderDrugVo;
import com.four.entity.RegisterVo;
import com.four.service.OrderDrugService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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


    @GetMapping(produces = "application/json; charset=utf-8",path ="showOrderDrugByUserId/{userId}")
    public List<OrderDrugVo> showOrderDrugByUserId(@PathVariable int userId){
        List<OrderDrugVo> orderDrugVoList=orderDrugService.queryByUserId(userId);
        return  orderDrugVoList;
    }
    @PostMapping(path ="insertOrder")
    public void showOrderDrugByUserId(@RequestBody OrderDrug orderDrug){
        orderDrugService.insertOrder(orderDrug);
    }

}