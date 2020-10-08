package com.four.controller;

import com.four.entity.Lists;
import com.four.service.ListsService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

}