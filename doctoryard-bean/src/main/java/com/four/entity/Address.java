package com.four.entity;

import java.io.Serializable;

/**
 * 收货信息(Address)实体类
 *
 * @author makejava
 * @since 2020-10-06 14:15:40
 */
public class Address implements Serializable {
    private static final long serialVersionUID = -14658899126179462L;

    private Integer userId;

    private Integer addressId;
    /**
     * 收货人
     */
    private String addressName;
    /**
     * 联系方式
     */
    private String addressTel;
    /**
     * 收货城市
     */
    private String addressCity;
    /**
     * 收货地址
     */
    private String addressLocation;


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

}