package com.four.controller;

import com.alibaba.fastjson.JSONObject;
import com.four.entity.Doctor;
import com.four.entity.Heathyfile;
import com.four.entity.Realinfo;
import com.four.service.DoctorService;
import com.four.service.HeathyfileService;
import com.four.service.RealinfoService;
import com.four.util.RedisUtil;
import com.four.util.Result;
import com.four.util.ResultFactory;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 健康档案(Heathyfile)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:22
 */
@RestController
@RequestMapping("heathyfile")
public class HeathyfileController {
    /**
     * 服务对象
     */
    @Reference
    private HeathyfileService heathyfileService;
    @Reference
    private RealinfoService realinfoService;
    @Reference
    private DoctorService doctorService;
    @Autowired
    RedisUtil redisUtil;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("getFile")
    public Heathyfile selectOne(Integer id) {
        return this.heathyfileService.queryById(id);
    }
    @GetMapping(produces = "application/json; charset=utf-8",path ="getHeathyfile/{userId}")
    public Result getHeathyfile(@PathVariable Integer userId) {
        Realinfo realinfo = realinfoService.queryById(userId);
        //通过用户找到真实信息，再得到用户的真实信息
        if(realinfo==null){
            //找不到
            return ResultFactory.setResultError();
        }else{
            //1、存在真实信息
            int rId=realinfo.getRealinfoId();
            String rName=realinfo.getRealinfoName();
            //2、通过真实信息id找到对应的list健康档案
            List<Heathyfile> heathyfiles = heathyfileService.queryByRealinfoId(rId);
            if(heathyfiles.size()>0){
                //3、存在健康档案
                JSONObject data = new JSONObject();
                List<Doctor> doctors=new ArrayList<>();
                for (Heathyfile heathyfile : heathyfiles) {
                    doctors.add(doctorService.queryById(heathyfile.getDoctorId()));
                }
                data.put("doctors",doctors);
                data.put("heathyfiles",heathyfiles);
                return ResultFactory.setResultSuccess(data);
            }else{
                return ResultFactory.setResultError();
            }
        }



    }
}