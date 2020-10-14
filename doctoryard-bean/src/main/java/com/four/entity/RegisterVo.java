package com.four.entity;

import java.io.Serializable;
import java.sql.Date;

public class RegisterVo implements Serializable {

    private Integer registerId;
    private Integer userId;
    private  Integer doctorId;
    private  String doctorLastname;
    private Integer registPayId;
    private Date registerDay;
    private String registerTime;
    private  String registerStatus;
    private  Double registPayPrice;
    private String registPayStatus;


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

    public String getDoctorLastname() {
        return doctorLastname;
    }

    public void setDoctorLastname(String doctorLastname) {
        this.doctorLastname = doctorLastname;
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

    public Double getRegistPayPrice() {
        return registPayPrice;
    }

    public void setRegistPayPrice(Double registPayPrice) {
        this.registPayPrice = registPayPrice;
    }

    public String getRegistPayStatus() {
        return registPayStatus;
    }

    public void setRegistPayStatus(String registPayStatus) {
        this.registPayStatus = registPayStatus;
    }

    @Override
    public String toString() {
        return "RegisterVo{" +
                "registerId=" + registerId +
                ", userId=" + userId +
                ", doctorId=" + doctorId +
                ", doctorLastname='" + doctorLastname + '\'' +
                ", registPayId=" + registPayId +
                ", registerDay=" + registerDay +
                ", registerTime='" + registerTime + '\'' +
                ", registerStatus='" + registerStatus + '\'' +
                ", registPayPrice=" + registPayPrice +
                ", registPayStatus='" + registPayStatus + '\'' +
                '}';
    }
}
