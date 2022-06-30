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
class Teacher {
    //@Value("Saurabh Gupta")   //we can also use it
    private String name;
    
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public Teacher() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", subject=" + subject + '}';
    }

       
    
}
