package com.four.entity;

import java.io.Serializable;

public class OrderDetailVo implements Serializable {

    private Integer listDetailId;
    private  Integer listId;
    private  Integer drugId;
    private  Integer listDetailCount;
    private  Double listDetailPrice;
    private  String  drugKinds;
    private  String drugNum;
    private  String drugName;
    private  Double drugPrice;
    private  String drugDescribe;
    private  String drugType;

    public Integer getListDetailId() {
        return listDetailId;
    }

    public void setListDetailId(Integer listDetailId) {
        this.listDetailId = listDetailId;
    }

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public Integer getListDetailCount() {
        return listDetailCount;
    }

    public void setListDetailCount(Integer listDetailCount) {
        this.listDetailCount = listDetailCount;
    }

    public Double getListDetailPrice() {
        return listDetailPrice;
    }

    public void setListDetailPrice(Double listDetailPrice) {
        this.listDetailPrice = listDetailPrice;
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

    @Override
    public String toString() {
        return "OrderDetailVo{" +
                "listDetailId=" + listDetailId +
                ", listId=" + listId +
                ", drugId=" + drugId +
                ", listDetailCount=" + listDetailCount +
                ", listDetailPrice=" + listDetailPrice +
                ", drugKinds='" + drugKinds + '\'' +
                ", drugNum='" + drugNum + '\'' +
                ", drugName='" + drugName + '\'' +
                ", drugPrice=" + drugPrice +
                ", drugDescribe='" + drugDescribe + '\'' +
                ", drugType='" + drugType + '\'' +
                '}';
    }
}
