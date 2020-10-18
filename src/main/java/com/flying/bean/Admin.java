package com.flying.bean;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {
    private Integer id;
    private String adminname;
    private String sex;
    @JSONField(serialzeFeatures = SerializerFeature.WriteNullStringAsEmpty)
    private String headimg;
    private Integer jurisdiction;
    private String phone;
    @JSONField(format = "yyyy-mm-dd HH:mm:ss")
    private Date registertime;
    private String adname;
    private String pwd;
    public Admin() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public Integer getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(Integer jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", sex='" + sex + '\'' +
                ", headimg='" + headimg + '\'' +
                ", jurisdiction=" + jurisdiction +
                ", phone='" + phone + '\'' +
                ", registertime=" + registertime +
                ", adname='" + adname + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
