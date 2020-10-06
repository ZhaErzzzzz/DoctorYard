package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.User;
import com.four.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户(User)表控制层
 *
 * @author makejava
 * @since 2020-10-05 16:29:49
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
//    @Resource
    @Reference
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

}