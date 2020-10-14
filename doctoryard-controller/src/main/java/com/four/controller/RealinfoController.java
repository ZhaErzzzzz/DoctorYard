package com.four.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.four.entity.Realinfo;
import com.four.entity.User;
import com.four.service.RealinfoService;
import com.four.util.Result;
import com.four.util.ResultFactory;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

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
     * 通过外键查询单条数据
     *
     * @param userId 主键
     * @return 单条数据
     */
    @GetMapping(produces = "application/json; charset=utf-8",path ="queryByUserId/{userId}")
    public Result queryByUserId(@PathVariable Integer userId) {
        Realinfo r=realinfoService.queryByUserId(userId);
        JSONObject data = new JSONObject();
        data.put("realinfo",r);
        return ResultFactory.setResultSuccess(data);
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="yyyy-MM-dd",timezone = "GMT+8")
    @PostMapping("addRealinfo")
    public  Result addRealinfo(@RequestBody Realinfo realinfo){
        int res=realinfoService.addRealinfo(realinfo);
        JSONObject data = new JSONObject();
        data.put("realinfo",realinfo);
        return ResultFactory.setResultSuccess(data);
    }

}