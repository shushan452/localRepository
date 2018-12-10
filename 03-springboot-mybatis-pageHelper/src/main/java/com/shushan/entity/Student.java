package com.shushan.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

public class Student {

    private Integer id;

    private String code;    //学号

    private String name;    //姓名

    private String phone;   //电话

    private String address; //地址

    private Date birthDay;    //生日

    public Integer getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
}
