package com.four.entity;

import java.io.Serializable;

/**
 * 药品(Drug)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:11:18
 */
public class Drug implements Serializable {
    private static final long serialVersionUID = 640252448066232397L;

    private Integer drugId;

    private String drugKinds;
    /**
     * 药品编号
     */
    private String drugNum;
    /**
     * 药品名
     */
    private String drugName;
    /**
     * 单价
     */
    private Double drugPrice;
    /**
     * 描述
     */
    private String drugDescribe;
    /**
     * 是否处方药
     */
    private String drugType;


    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugKinds() {
        return drugKinds;
    }

    public void setDrugKinds(String drugKinds) {
        this.drugKinds = drugKinds;
    }

    public String getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(String drugNum) {
        this.drugNum = drugNum;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(Double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugDescribe() {
        return drugDescribe;
    }

    public void setDrugDescribe(String drugDescribe) {
        this.drugDescribe = drugDescribe;
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

}