package com.four.controller;

import com.four.entity.List;
import com.four.service.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 总订单(List)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:29
 */
@RestController
@RequestMapping("list")
public class ListController {
    /**
     * 服务对象
     */
    @Resource
    private ListService listService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public List selectOne(Integer id) {
        return this.listService.queryById(id);
    }

}