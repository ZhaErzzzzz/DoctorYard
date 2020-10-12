package com.four.controller;

import com.four.entity.Lists;
import com.four.entity.Msg;
import com.four.service.AddressService;
import com.four.service.DrugService;
import com.four.service.ListDetailService;
import com.four.service.ListsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 总订单(Lists)表控制层
 *
 * @author makejava
 * @since 2020-10-06 16:49:44
 */
@RestController
@RequestMapping("lists")
public class ListsController {
    /**
     * 服务对象
     */
    @Reference
    private ListsService listsService;
    @Reference
    private ListDetailService listDetailService;
    @Reference
    private AddressService addressService;
    @Reference
    private DrugService drugService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Lists selectOne(Integer id) {
        return this.listsService.queryById(id);
    }


    @GetMapping(produces = "application/json; charset=utf-8",path ="showListsByUserId/{userId}")
    public Object showById(@PathVariable int userId){
        List<Lists> lists=listsService.queryByUserId(userId);//根据userid查到该用户的全部订单
        List<Integer> listIdList=listsService.queryListIdByUserId(userId);//根据userid查到用户所有的订单号
        List<Integer> addressIdList=listsService.queryAddressIdByUserId(userId);//根据userid查到用户所有的地址编码

         return null;

    }

}