/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.javaconfig;

import org.springframework.beans.factory.annotation.Value;

/**
 *
 * @author sachink1
 */
class Subject {
    @Value("Drawing")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Subject{" + "name=" + name + '}';
    }
    
    
}
