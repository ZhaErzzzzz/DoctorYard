package com.four.entity;

import java.io.Serializable;

/**
 * 总订单(List)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:14:02
 */
public class List implements Serializable {
    private static final long serialVersionUID = 212600830242101478L;

    private Integer listId;

    private Integer userId;

    private Integer addressId;
    /**
     * 订单编号
     */
    private String listNum;
    /**
     * 总价
     */
    private Double listPrice;
    /**
     * 订单状态
     */
    private String listStatus;


    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getListNum() {
        return listNum;
    }

    public void setListNum(String listNum) {
        this.listNum = listNum;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus;
    }

}