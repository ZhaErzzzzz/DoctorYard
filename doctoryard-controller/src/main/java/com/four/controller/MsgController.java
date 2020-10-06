package com.four.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.four.entity.Msg;
import com.four.service.MsgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 文章(Msg)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:42
 */
@RestController
@RequestMapping("msg")
public class MsgController {
    /**
     * 服务对象
     */
    @Reference
    private MsgService msgService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Msg selectOne(Integer id) {
        return this.msgService.queryById(id);
    }

}