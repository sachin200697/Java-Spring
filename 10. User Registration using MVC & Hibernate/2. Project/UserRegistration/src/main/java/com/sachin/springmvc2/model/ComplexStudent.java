/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.model;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author sachink1
 */
public class ComplexStudent {
    private String name;
    private Long id;
    
    @DateTimeFormat(pattern="dd/MM/yyyy")   //we can use it but it is not necessary //here dd/MM/yyy  MM is capital because mm is for minut
    private Date dob;
    private List<String> multipleselect;
    private String gender;
    private String singleselect;
    
    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public List<String> getMultipleselect() {
        return multipleselect;
    }

    public void setMultipleselect(List<String> multipleselect) {
        this.multipleselect = multipleselect;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSingleselect() {
        return singleselect;
    }

    public void setSingleselect(String singleselect) {
        this.singleselect = singleselect;
    }

    @Override
    public String toString() {
        return "ComplexStudent{" + "name=" + name + ", id=" + id + ", dob=" + dob + ", multipleselect=" + multipleselect + ", gender=" + gender + ", singleselect=" + singleselect + ", address=" + address + '}';
    }             
}
