package com.four.entity;

import java.io.Serializable;

/**
 * 加入购物车的药品(OrderDrug)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:15:20
 */
public class OrderDrug implements Serializable {
    private static final long serialVersionUID = -96808151830496202L;

    private Integer orderDrugId;

    private Integer drugId;

    private Integer userId;
    /**
     * 是否被批准
     */
    private String orderDrugStatus;
    /**
     * 数量
     */
    private Integer orderDrugCount;


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

}