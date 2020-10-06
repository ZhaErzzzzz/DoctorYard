package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.UserMsg;
import com.four.service.UserMsgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 收藏文章(UserMsg)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:37:23
 */
@RestController
@RequestMapping("userMsg")
public class UserMsgController {
    /**
     * 服务对象
     */
    @Reference
    private UserMsgService userMsgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserMsg selectOne(Integer id) {
        return this.userMsgService.queryById(id);
    }

}