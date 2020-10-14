package com.four.controller;

import com.four.entity.Msg;
import com.four.service.MsgService;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 文章(Msg)表控制层
 *
 * @author makejava
 * @since 2020-10-06 15:36:42
 */
//@RestController
//@RequestMapping("msg")
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




    //展示全部文章的默认值
    @GetMapping("showMsg")
    public Object getMsg1(){
        PageInfo pageInfo=msgService.showAllMsg(1,3);
        return pageInfo;
    }
    //分页展示全部文章
    @GetMapping(produces = "application/json; charset=utf-8",path ="showMsg/{pageNum}")
    public Object getMsg2(@PathVariable int pageNum){
        PageInfo     pageInfo=msgService.showAllMsg(pageNum,3);
        return pageInfo;
    }

    //通过文章标题返回一个文章
    @GetMapping(produces = "application/json; charset=utf-8",path ="showByTitle/{msgId}")
    public Msg showById(@PathVariable int msgId){
      return   msgService.queryById(msgId);
    }


}