/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.autowiring;

/**
 *
 * @author sachink1
 */
public class Employee {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

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
