package com.four.entity;

import java.io.Serializable;

/**
 * 历史处方记录(DrugDoctor)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:12:12
 */
public class DrugDoctor implements Serializable {
    private static final long serialVersionUID = -78278374417459972L;

    private Integer drugId;

    private Integer doctorId;

    private Integer drugDoctorId;


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getDrugDoctorId() {
        return drugDoctorId;
    }

    public void setDrugDoctorId(Integer drugDoctorId) {
        this.drugDoctorId = drugDoctorId;
    }

}