package com.four.service.impl;

import com.four.dao.CommentDao;
import com.four.entity.Comment;
import com.four.service.CommentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 留言(Comment)表服务实现类
 *
 * @author makejava
 * @since 2020-10-06 15:29:01
 */
@Service
@Component
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;

    /**
     * 通过ID查询单条数据
     *
     * @param commentId 主键
     * @return 实例对象
     */
    @Override
    public Comment queryById(Integer commentId) {
        return this.commentDao.queryById(commentId);
    }

    @Override
    public List<Comment> queryByMsgId(Integer msgId) {
        return commentDao.queryByMsgId(msgId);
    }

    @Override
    public PageInfo<Comment> showComment(int MsgId,int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Comment> list = commentDao.queryByMsgId(MsgId);
        PageInfo<Comment> pageInfo = new PageInfo<>(list);

        return pageInfo;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Comment> queryAllByLimit(int offset, int limit) {
        return this.commentDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment insert(Comment comment) {
        this.commentDao.insert(comment);
        return comment;
    }

    /**
     * 修改数据
     *
     * @param comment 实例对象
     * @return 实例对象
     */
    @Override
    public Comment update(Comment comment) {
        this.commentDao.update(comment);
        return this.queryById(comment.getCommentId());
    }

    /**
     * 通过主键删除数据
     *
     * @param commentId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer commentId) {
        return this.commentDao.deleteById(commentId) > 0;
    }
}