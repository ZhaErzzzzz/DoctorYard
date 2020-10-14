package com.four.controller;

import com.four.entity.*;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 总订单(Lists)表控制层
 *
 * @author makejava
 * @since 2020-10-06 16:49:44
 */
//@RestController
//@RequestMapping("lists")
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
    public List<OrderVo> showById(@PathVariable int userId){

//       List<Lists> listsList =listsService.queryByUserId(userId);
//       List<Integer> listIdList=listsService.queryListIdByUserId(userId);
//       List<Address> addressList = new ArrayList<>();
//        for (Integer listId: listIdList) {
//           Integer addressId =listsService.queryAddressIdByListId(listId);
//           Address address=addressService.queryById(addressId);
//           addressList.add(address);
//        }
//        UserLists userLists = new UserLists();
//        userLists.setListsList(listsList);
//        userLists.setAddressList(addressList);
         List<OrderVo> objectList =listsService.queryInformation(userId);


        

        return  objectList;
    }




//    @GetMapping(produces = "application/json; charset=utf-8",path ="showListsByUserId/{userId}")
//    public Map<Map<List<String>, List<ListDetail>>, Address> showById(@PathVariable int userId){
//        List<Lists> listsList=listsService.queryByUserId(userId);//根据userid查到该用户的全部订单
//        List<Integer> listIdList=listsService.queryListIdByUserId(userId);//根据userid查到用户所有的订单号
//        Map<Integer,Map<Map<List<String>,List<ListDetail>>,Address>> listDetailMap = new HashMap<>();//用来存所有的全部订单里的
//        List list = new ArrayList();//将每个订单的每个小块都存在一个list中
//        Map<Map<List<String>,List<ListDetail>>,Address> addressMap= new HashMap<>();
//
//
//        for(Integer listId:listIdList){
//            Map<List<String>,List<ListDetail>> drugDetailMap= new HashMap<>();
//         List<ListDetail> listDetailList = listDetailService.queryByListId(listId);//将某个订单的全部订单详情,买的药，药对应的数量，价格
//
//
//           List<Integer> listDetailIdList=listDetailService.queryListDetailIdByListId(listId);//根据订单号查到这个订单里的所有的小的id
//            List<String> drugList = new ArrayList<>();
//            for (Integer listDetailId: listDetailIdList){
//               Integer drugId =listDetailService.queryDrugIdByListDetailId(listDetailId);
//               String drugName =drugService.queryDrugNameById(drugId);
//               drugList.add(drugName);
//            }//查出该订单里的药的信息
//
//
//            drugDetailMap.put(drugList,listDetailList);
//
//
//
//            Integer  addressId =listsService.queryAddressIdByListId(listId);//根据某一个订单号查到订单号的地址编号
//           Address address =addressService.queryById(addressId);//通过某个订单号的地址编号查到订单地址
//
//
//
//            addressMap.put(drugDetailMap,address);
////            list.add(drugDetailMap);
////            list.add(address);
//
//
//
//
//
//
//        }
//
//
////        List<Integer> addressIdList=listsService.queryAddressIdByUserId(userId);//根据userid查到用户所有的地址编码
//         return addressMap;
//
//    }

}