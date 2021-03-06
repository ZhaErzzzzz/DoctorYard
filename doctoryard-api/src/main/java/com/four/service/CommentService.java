package com.four.service;

import com.four.entity.Comment;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 留言(Comment)表服务接口
 *
 * @author makejava
 * @since 2020-10-06 15:25:39
 */
public interface CommentService {

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    Comment queryById(Integer commentId);

    List<Comment> queryByMsgId(Integer msgId);

    public PageInfo<Comment>  showComment(int MsgId,int pageNum, int pageSize);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Comment> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    Comment insert(Comment comment);

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    Comment update(Comment comment);

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    boolean deleteById(Integer commentId);

}