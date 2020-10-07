package com.four.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 挂号(Register)实体类
 *
 * @author makejava
 * @since 2020-10-07 19:16:22
 */
public class Register implements Serializable {
    private static final long serialVersionUID = 414918215239380732L;

    private Integer registerId;

    private Integer userId;

    private Integer doctorId;

    private Integer registPayId;
    /**
     * 日期
     */
    private Date registerDay;
    /**
     * 时间
     */
    private String registerTime;
    /**
     * 挂号状态
     */
    private String registerStatus;


    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
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

    public Integer getRegistPayId() {
        return registPayId;
    }

    public void setRegistPayId(Integer registPayId) {
        this.registPayId = registPayId;
    }

    public Date getRegisterDay() {
        return registerDay;
    }

    public void setRegisterDay(Date registerDay) {
        this.registerDay = registerDay;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(String registerStatus) {
        this.registerStatus = registerStatus;
    }

}