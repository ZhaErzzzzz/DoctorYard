package com.four.controller;

import com.four.entity.Dhonor;
import com.four.service.DhonorService;
import com.four.service.DoctorService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 医生荣誉技能(Dhonor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:35:56
 */
@RestController
@RequestMapping("dhonor")
public class DhonorController {
    /**
     * 服务对象
     */
    @Reference
    private DhonorService dhonorService;
    @Reference
    private DoctorService doctorService;







    @GetMapping(produces = "application/json; charset=utf-8",path = "showByDoctorId/{doctorId}")
    public List<Dhonor> showOneDoctor(@PathVariable int doctorId){

        return dhonorService.queryByDoctorId(doctorId);

    }

}