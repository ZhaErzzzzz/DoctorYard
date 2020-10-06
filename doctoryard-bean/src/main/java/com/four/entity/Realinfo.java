package com.four.entity;

import java.io.Serializable;

/**
 * 真实信息(Realinfo)实体类
 *
 * @author makejava
 * @since 2020-10-06 15:15:55
 */
public class Realinfo implements Serializable {
    private static final long serialVersionUID = 206557264668639899L;

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
    private String realinfoBirthday;
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
    private String realinfoWorktpype;
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

    public String getRealinfoBirthday() {
        return realinfoBirthday;
    }

    public void setRealinfoBirthday(String realinfoBirthday) {
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

    public String getRealinfoWorktpype() {
        return realinfoWorktpype;
    }

    public void setRealinfoWorktpype(String realinfoWorktpype) {
        this.realinfoWorktpype = realinfoWorktpype;
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

}