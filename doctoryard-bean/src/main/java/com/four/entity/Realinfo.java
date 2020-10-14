package com.four.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * 真实信息(Realinfo)实体类
 *
 * @author makejava
 * @since 2020-10-13 22:15:51
 */
public class Realinfo implements Serializable {
    private static final long serialVersionUID = 192913561282025818L;

    private Integer realinfoId;
    /**
     * 姓名
     */
    private String realinfoName;
    /**
     * 联系方式
     */
    private String realinfoTel;
    /**
     * 生日
     */
    private Date realinfoBirthday;
    /**
     * 免冠照
     */
    private String realinfoImg;
    /**
     * 血型
     */
    private String realinfoBloodtype;
    /**
     * 身份证
     */
    private String realinfoIdcard;
    /**
     * 职业
     */
    private String realinfoWorktype;
    /**
     * 工作单位
     */
    private String realinfoCompany;
    /**
     * 婚姻史
     */
    private String realinfoMarried;
    /**
     * 现居住地
     */
    private String realinfoLocation;
    /**
     * 户籍地址
     */
    private String realinfoOldlocation;

    private Integer userId;

    private String realinfoSex;


    public Integer getRealinfoId() {
        return realinfoId;
    }

    public void setRealinfoId(Integer realinfoId) {
        this.realinfoId = realinfoId;
    }

    public String getRealinfoName() {
        return realinfoName;
    }

    public void setRealinfoName(String realinfoName) {
        this.realinfoName = realinfoName;
    }

    public String getRealinfoTel() {
        return realinfoTel;
    }

    public void setRealinfoTel(String realinfoTel) {
        this.realinfoTel = realinfoTel;
    }

    public Date getRealinfoBirthday() {
        return realinfoBirthday;
    }

    public void setRealinfoBirthday(Date realinfoBirthday) {
        this.realinfoBirthday = realinfoBirthday;
    }

    public String getRealinfoImg() {
        return realinfoImg;
    }

    public void setRealinfoImg(String realinfoImg) {
        this.realinfoImg = realinfoImg;
    }

    public String getRealinfoBloodtype() {
        return realinfoBloodtype;
    }

    public void setRealinfoBloodtype(String realinfoBloodtype) {
        this.realinfoBloodtype = realinfoBloodtype;
    }

    public String getRealinfoIdcard() {
        return realinfoIdcard;
    }

    public void setRealinfoIdcard(String realinfoIdcard) {
        this.realinfoIdcard = realinfoIdcard;
    }

    public String getRealinfoWorktype() {
        return realinfoWorktype;
    }

    public void setRealinfoWorktype(String realinfoWorktype) {
        this.realinfoWorktype = realinfoWorktype;
    }

    public String getRealinfoCompany() {
        return realinfoCompany;
    }

    public void setRealinfoCompany(String realinfoCompany) {
        this.realinfoCompany = realinfoCompany;
    }

    public String getRealinfoMarried() {
        return realinfoMarried;
    }

    public void setRealinfoMarried(String realinfoMarried) {
        this.realinfoMarried = realinfoMarried;
    }

    public String getRealinfoLocation() {
        return realinfoLocation;
    }

    public void setRealinfoLocation(String realinfoLocation) {
        this.realinfoLocation = realinfoLocation;
    }

    public String getRealinfoOldlocation() {
        return realinfoOldlocation;
    }

    public void setRealinfoOldlocation(String realinfoOldlocation) {
        this.realinfoOldlocation = realinfoOldlocation;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealinfoSex() {
        return realinfoSex;
    }

    public void setRealinfoSex(String realinfoSex) {
        this.realinfoSex = realinfoSex;
    }

}