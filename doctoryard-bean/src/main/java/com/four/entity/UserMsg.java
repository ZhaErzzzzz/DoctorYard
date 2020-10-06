package com.four.entity;

import java.io.Serializable;

/**
 * 收藏文章(UserMsg)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:19:31
 */
public class UserMsg implements Serializable {
    private static final long serialVersionUID = -67148049842739531L;

    private Integer userMsgId;

    private Integer userId;

    private Integer msgId;


    public Integer getUserMsgId() {
        return userMsgId;
    }

    public void setUserMsgId(Integer userMsgId) {
        this.userMsgId = userMsgId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

}