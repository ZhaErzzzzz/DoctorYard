package com.four.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 留言(Comment)实体类
 *
 * @author makejava
 * @since 2020-10-07 19:23:19
 */
public class Comment implements Serializable {
    private static final long serialVersionUID = -68534615824272679L;

    private Integer commentId;

    private Integer msgId;

    private Integer userId;

    private Integer doctorId;
    /**
     * 评论
     */
    private String commentName;
    /**
     * 时间
     */
    private Date commentDate;
    /**
     * 点赞
     */
    private String commentLike;


    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getCommentName() {
        return commentName;
    }

    public void setCommentName(String commentName) {
        this.commentName = commentName;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public String getCommentLike() {
        return commentLike;
    }

    public void setCommentLike(String commentLike) {
        this.commentLike = commentLike;
    }

}