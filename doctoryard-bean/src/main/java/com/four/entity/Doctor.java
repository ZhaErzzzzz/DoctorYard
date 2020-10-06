package com.four.entity;

import java.io.Serializable;

/**
 * 医生(Doctor)实体类
 *
 * @author makejava
 * @since 2020-10-06 11:25:07
 */
public class Doctor implements Serializable {
    private static final long serialVersionUID = 360872334795912325L;

    private Integer doctorId;
    private Integer hospitalId;

    private Integer departmentId;
    /**
     * 姓名
     */
    private String doctorLastname;
    /**
     * 工号
     */
    private String doctorNum;
    /**
     * 简介
     */
    private String doctorBrief;
    /**
     * 头像
     */
    private String doctorImg;
    /**
     * 联系方式
     */
    private String doctorTel;
    /**
     * 密码
     */
    private String doctorPwd;


    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDoctorLastname() {
        return doctorLastname;
    }

    public void setDoctorLastname(String doctorLastname) {
        this.doctorLastname = doctorLastname;
    }

    public String getDoctorNum() {
        return doctorNum;
    }

    public void setDoctorNum(String doctorNum) {
        this.doctorNum = doctorNum;
    }

    public String getDoctorBrief() {
        return doctorBrief;
    }

    public void setDoctorBrief(String doctorBrief) {
        this.doctorBrief = doctorBrief;
    }

    public String getDoctorImg() {
        return doctorImg;
    }

    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg;
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel;
    }

    public String getDoctorPwd() {
        return doctorPwd;
    }

    public void setDoctorPwd(String doctorPwd) {
        this.doctorPwd = doctorPwd;
    }

}