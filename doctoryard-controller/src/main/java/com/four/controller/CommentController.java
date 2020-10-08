package com.four.controller;

import com.four.entity.Comment;
import com.four.service.CommentService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 留言(Comment)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:35:47
 */
//@DubboComponentScan(basePackages = "com.four.controller")
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */

    @Reference
    private CommentService commentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Comment selectOne(Integer id) {
        return this.commentService.queryById(id);
    }

}