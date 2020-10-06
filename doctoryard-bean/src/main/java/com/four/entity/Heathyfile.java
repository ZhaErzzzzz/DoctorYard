package com.four.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 健康档案(Heathyfile)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:12:59
 */
public class Heathyfile implements Serializable {
    private static final long serialVersionUID = -52865846624753978L;

    private Integer heathyfileId;

    private Integer realinfoId;

    private Integer doctorId;
    /**
     * 建档日期
     */
    private Date heathyfileCreatdate;
    /**
     * 病史
     */
    private String heathyfileHistory;
    /**
     * 查询症状
     */
    private String heathyfileNow;


    public Integer getHeathyfileId() {
        return heathyfileId;
    }

    public void setHeathyfileId(Integer heathyfileId) {
        this.heathyfileId = heathyfileId;
    }

    public Integer getRealinfoId() {
        return realinfoId;
    }

    public void setRealinfoId(Integer realinfoId) {
        this.realinfoId = realinfoId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Date getHeathyfileCreatdate() {
        return heathyfileCreatdate;
    }

    public void setHeathyfileCreatdate(Date heathyfileCreatdate) {
        this.heathyfileCreatdate = heathyfileCreatdate;
    }

    public String getHeathyfileHistory() {
        return heathyfileHistory;
    }

    public void setHeathyfileHistory(String heathyfileHistory) {
        this.heathyfileHistory = heathyfileHistory;
    }

    public String getHeathyfileNow() {
        return heathyfileNow;
    }

    public void setHeathyfileNow(String heathyfileNow) {
        this.heathyfileNow = heathyfileNow;
    }

}