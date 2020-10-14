package com.four.entity;

import java.io.Serializable;

public class OrderVo implements Serializable {

    private  Integer listId;
    private  Integer userId;
    private  Integer addressId;
    private  String listNum;
    private  Double listPrice;
    private  String listStatus;
    private String addressName;
    private  String  addressTel;
    private   String addressCity;
    private  String addressLocation;


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

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public String getAddressTel() {
        return addressTel;
    }

    public void setAddressTel(String addressTel) {
        this.addressTel = addressTel;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressLocation() {
        return addressLocation;
    }

    public void setAddressLocation(String addressLocation) {
        this.addressLocation = addressLocation;
    }

    @Override
    public String toString() {
        return "OrderVo{" +
                "listId=" + listId +
                ", userId=" + userId +
                ", addressId=" + addressId +
                ", listNum='" + listNum + '\'' +
                ", listPrice=" + listPrice +
                ", listStatus='" + listStatus + '\'' +
                ", addressName='" + addressName + '\'' +
                ", addressTel='" + addressTel + '\'' +
                ", addressCity='" + addressCity + '\'' +
                ", addressLocation='" + addressLocation + '\'' +
                '}';
    }
}
