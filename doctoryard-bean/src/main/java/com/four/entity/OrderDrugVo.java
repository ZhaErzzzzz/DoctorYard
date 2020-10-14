package com.four.entity;

import java.io.Serializable;

public class OrderDrugVo implements Serializable {

    private Integer orderDrugId;
    private Integer drugId;
    private Integer userId;
    private String  orderDrugStatus;
    private Integer orderDrugCount;
    private String drugName;
    private  Double drugPrice;


    public Integer getOrderDrugId() {
        return orderDrugId;
    }

    public void setOrderDrugId(Integer orderDrugId) {
        this.orderDrugId = orderDrugId;
    }

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

    public String getOrderDrugStatus() {
        return orderDrugStatus;
    }

    public void setOrderDrugStatus(String orderDrugStatus) {
        this.orderDrugStatus = orderDrugStatus;
    }

    public Integer getOrderDrugCount() {
        return orderDrugCount;
    }

    public void setOrderDrugCount(Integer orderDrugCount) {
        this.orderDrugCount = orderDrugCount;
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


    @Override
    public String toString() {
        return "OrderDrugVo{" +
                "orderDrugId=" + orderDrugId +
                ", drugId=" + drugId +
                ", userId=" + userId +
                ", orderDrugStatus='" + orderDrugStatus + '\'' +
                ", orderDrugCount=" + orderDrugCount +
                ", drugName='" + drugName + '\'' +
                ", drugPrice=" + drugPrice +
                '}';
    }
}
