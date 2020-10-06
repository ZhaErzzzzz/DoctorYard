package com.four.entity;

import java.io.Serializable;

/**
 * 挂号单(RegistPay)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:16:45
 */
public class RegistPay implements Serializable {
    private static final long serialVersionUID = 993217264601043600L;

    private Integer registPayId;
    /**
     * 挂号费
     */
    private Double registPayPrice;
    /**
     * 付款状态
     */
    private String registPayStatus;


    public Integer getRegistPayId() {
        return registPayId;
    }

    public void setRegistPayId(Integer registPayId) {
        this.registPayId = registPayId;
    }

    public Double getRegistPayPrice() {
        return registPayPrice;
    }

    public void setRegistPayPrice(Double registPayPrice) {
        this.registPayPrice = registPayPrice;
    }

    public String getRegistPayStatus() {
        return registPayStatus;
    }

    public void setRegistPayStatus(String registPayStatus) {
        this.registPayStatus = registPayStatus;
    }

}