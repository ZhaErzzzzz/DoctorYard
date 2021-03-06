package com.four.entity;

import java.io.Serializable;

/**
 * 订单详情(ListDetail)实体类
 *
 * @author makejava
 * @since 2020-10-07 19:15:00
 */
public class ListDetail implements Serializable {
    private static final long serialVersionUID = 614246488449964159L;

    private Integer listDetailId;

    private Integer listId;

    private Integer drugId;
    /**
     * 数量
     */
    private Integer listDetailCount;

    private Double listDetailPrice;


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

}