package com.four.entity;

import java.io.Serializable;

/**
 * 收藏医生(UserDoctor)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:19:18
 */
public class UserDoctor implements Serializable {
    private static final long serialVersionUID = -52804360590101838L;

    private Integer doctorId;

    private Integer userId;

    private Integer userDoctorId;


    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserDoctorId() {
        return userDoctorId;
    }

    public void setUserDoctorId(Integer userDoctorId) {
        this.userDoctorId = userDoctorId;
    }

}