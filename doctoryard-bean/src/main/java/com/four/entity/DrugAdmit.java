package com.four.entity;

import java.io.Serializable;

/**
 * 用户可购处方药(DrugAdmit)实体类
 *
 * @author makejava
 * @since 2020-10-06 17:00:33
 */
public class DrugAdmit implements Serializable {
    private static final long serialVersionUID = -18708021449319178L;

    private Integer drugId;

    private Integer userId;

    private Integer doctorId;

    private Integer drugAdmitId;


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
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

    public Integer getDrugAdmitId() {
        return drugAdmitId;
    }

    public void setDrugAdmitId(Integer drugAdmitId) {
        this.drugAdmitId = drugAdmitId;
    }

}