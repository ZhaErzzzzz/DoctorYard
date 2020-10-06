package com.four.entity;

import java.io.Serializable;

/**
 * 科室(Department)实体类
 *
 * @author makejava
 * @since 2020-10-06 11:28:52
 */
public class Department implements Serializable {
    private static final long serialVersionUID = 222423503855551015L;

    private Integer departmentId;

    private Integer hospitalId;
    /**
     * 科室编号
     */
    private String departmentNum;
    /**
     * 科室名
     */
    private String departmentName;


    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}