package com.four.entity;

import java.io.Serializable;

/**
 * 医生荣誉技能(Dhonor)实体类
 *
 * @author makejava
 * @since 2020-10-06 14:20:45
 */
public class Dhonor implements Serializable {
    private static final long serialVersionUID = -82039367371288316L;

    private Integer dhonorId;
    private Integer doctorId;
    /**
     * 技能荣誉
     */
    private String dhonorText;


    public Integer getDhonorId() {
        return dhonorId;
    }

    public void setDhonorId(Integer dhonorId) {
        this.dhonorId = dhonorId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDhonorText() {
        return dhonorText;
    }

    public void setDhonorText(String dhonorText) {
        this.dhonorText = dhonorText;
    }

}