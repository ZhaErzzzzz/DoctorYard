package com.four.controller;

import com.four.entity.Drug;
import com.four.service.DrugDoctorService;
import com.four.service.DrugService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 药品(Drug)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:02
 */
@RestController
@RequestMapping("drug")
public class DrugController {
    /**
     * 服务对象
     */
    @Reference
    private DrugService drugService;
    @Reference
    private DrugDoctorService drugDoctorService;

    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDrugsById/{drugId}")
    public Drug selectOne(@PathVariable int drugId) {

        return this.drugService.queryById(drugId);
    }
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDoctorDrugsById/{doctorId}")
    public List<Drug> selectDoctorDrug(@PathVariable int doctorId) {

        List<Integer> drugIdList = drugDoctorService.queryDrugIdByDoctorId(doctorId);
        List<Drug> drugList=new ArrayList<>();
        for (Integer drugId:drugIdList) {

           Drug drug =drugService.queryById(drugId);
           drugList.add(drug);
        }
        return drugList;
    }


    @GetMapping(produces = "application/json; charset=utf-8",path = "showDrugByType/prescription")
    public Object showAllDrug1(){
        PageInfo pageInfo= drugService.showDrugByType(1,3,"处方");
        return  pageInfo;
    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showDrugByType/prescription/{pageNum}")
    public Object showAllDrug2(@PathVariable int pageNum){
        PageInfo pageInfo= drugService.showDrugByType(pageNum,3,"处方");
        return  pageInfo;

    }
    @GetMapping(produces = "application/json; charset=utf-8",path = "showDrugByType/unprescription")
    public Object showAllDrug3(){
        PageInfo pageInfo= drugService.showDrugByType(1,3,"非处方");
        return  pageInfo;
    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showDrugByType/unprescription/{pageNum}")
    public Object showAllDrug4(@PathVariable int pageNum){
        PageInfo pageInfo= drugService.showDrugByType(pageNum,3,"非处方");
        return  pageInfo;

    }

}