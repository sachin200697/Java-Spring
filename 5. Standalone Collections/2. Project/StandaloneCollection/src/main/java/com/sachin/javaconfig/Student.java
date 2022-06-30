/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.javaconfig;

import org.springframework.stereotype.Component;

/**
 *
 * @author sachink1
 */
@Component("student")
public class Student {
    public void study(){
        System.out.println("Student is studying");
    }
}
