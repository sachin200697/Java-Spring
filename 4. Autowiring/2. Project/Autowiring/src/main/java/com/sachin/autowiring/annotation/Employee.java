/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author sachink1
 */
public class Employee {
    //@Autowired
    //@Qualifier("address")   //if there are more than one bean of same Class then we can give name
    private Address address;

    public Address getAddress() {
        return address;
    }

    //@Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired    
    public Employee(Address address) {
        this.address = address;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + "address=" + address + '}';
    }
    
    
}
