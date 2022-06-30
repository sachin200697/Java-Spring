/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author sachink1
 */
public class TestMain {
    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);    
        Student s = context.getBean("student", Student.class);
        s.study();
        
        Teacher t = context.getBean("getTeacher", Teacher.class);
        System.out.println(t);
    }
}
