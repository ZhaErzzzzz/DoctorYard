package com.four.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章(Msg)实体类
 *
 * @author makejava
 * @since 2020-10-07 19:26:20
 */

public class Msg implements Serializable {
    private static final long serialVersionUID = -56221846352117301L;

    private Integer msgId;

    private Integer userId;

    private Integer doctorId;
    /**
     * 标题
     */
    private String msgTitle;
    /**
     * 内容
     */
    private String msgInfo;
    /**
     * 时间
     */
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date msgDate;
    /**
     * 关于作者
     */
    private String msgAbout;
    /**
     * 点赞
     */
    private Integer msgLike;
    /**
     * 标签
     */
    private String msgLable;


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

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgInfo() {
        return msgInfo;
    }

    public void setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
    }

    public Date getMsgDate() {
        return msgDate;
    }

    public void setMsgDate(Date msgDate) {
        this.msgDate = msgDate;
    }

    public String getMsgAbout() {
        return msgAbout;
    }

    public void setMsgAbout(String msgAbout) {
        this.msgAbout = msgAbout;
    }

    public Integer getMsgLike() {
        return msgLike;
    }

    public void setMsgLike(Integer msgLike) {
        this.msgLike = msgLike;
    }

    public String getMsgLable() {
        return msgLable;
    }

    public void setMsgLable(String msgLable) {
        this.msgLable = msgLable;
    }

}