package com.four.controller;

import com.four.entity.Comment;
import com.four.service.CommentService;
import com.four.service.MsgService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 留言(Comment)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:35:47
 */
@RestController
@RequestMapping("comment")
public class CommentController {
    /**
     * 服务对象
     */

    @Reference
    private CommentService commentService;

    @Reference
    private MsgService msgService;

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



    @GetMapping(produces = "application/json; charset=utf-8",path = "showAllComment/{msgId}")
    public Object showAllComment1(@PathVariable int msgId){

        PageInfo pageInfo= commentService.showComment(msgId,1,3);
        return  pageInfo;
    }

    @GetMapping(produces = "application/json; charset=utf-8",path = "showAllComment/{msgId}/{pageSize}")
    public Object showAllComment2(@PathVariable int msgId,@PathVariable int pageSize){

        PageInfo pageInfo=commentService.showComment(msgId,1,pageSize);
        return  pageInfo;

    }

}