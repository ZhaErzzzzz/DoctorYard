package com.four.controller;

import com.four.entity.ListDetail;
import com.four.entity.OrderDetailVo;
import com.four.entity.OrderVo;
import com.four.entity.RegisterVo;
import com.four.service.ListDetailService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

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



    @GetMapping(produces = "application/json; charset=utf-8",path ="showDetailByListId/{listId}")
    public List<OrderDetailVo> showById(@PathVariable int listId){
        List<OrderDetailVo> detailVoList =listDetailService.queryDetailByListId(listId);
        return  detailVoList;
    }
    @GetMapping(produces = "application/json; charset=utf-8",path ="showRegisterVoByUserId/{userId}")
    public List<RegisterVo> showByUserId(@PathVariable int userId){
        List<RegisterVo> registerVoList =listDetailService.queryRegisterVoByUserId(userId);
        return  registerVoList;
    }

}