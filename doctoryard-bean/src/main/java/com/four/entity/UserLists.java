package com.four.entity;

import java.io.Serializable;
import java.util.List;

public class UserLists implements Serializable {

    private List<Lists> listsList;
    private List<Address> addressList;


    public List<Lists> getListsList() {
        return listsList;
    }

    public void setListsList(List<Lists> listsList) {
        this.listsList = listsList;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "UserLists{" +
                "listsList=" + listsList +
                ", addressList=" + addressList +
                '}';
    }
}
