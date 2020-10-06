package com.four.entity;

import java.io.Serializable;

/**
 * 医院(Hospital)实体类
 *
 * @author makejava
 * @since 2020-10-06 11:29:29
 */
public class Hospital implements Serializable {
    private static final long serialVersionUID = -33979830836283915L;

    private Integer hospitalId;
    /**
     * 医院编号
     */
    private String hospitalNum;
    /**
     * 医院名
     */
    private String hospitalName;
    /**
     * 所属省市
     */
    private String hospitalCity;
    /**
     * 详细地址
     */
    private String hospitalAddress;
    /**
     * 医院简介
     */
    private String hospitalBrief;


    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalNum() {
        return hospitalNum;
    }

    public void setHospitalNum(String hospitalNum) {
        this.hospitalNum = hospitalNum;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalBrief() {
        return hospitalBrief;
    }

    public void setHospitalBrief(String hospitalBrief) {
        this.hospitalBrief = hospitalBrief;
    }

}