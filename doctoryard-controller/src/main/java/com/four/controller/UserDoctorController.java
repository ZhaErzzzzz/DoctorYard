package com.four.controller;

import com.four.entity.UserDoctor;
import com.four.service.UserDoctorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 收藏医生(UserDoctor)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:37:17
 */
@RestController
@RequestMapping("userDoctor")
public class UserDoctorController {
    /**
     * 服务对象
     */
    @Resource
    private UserDoctorService userDoctorService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserDoctor selectOne(Integer id) {
        return this.userDoctorService.queryById(id);
    }

}