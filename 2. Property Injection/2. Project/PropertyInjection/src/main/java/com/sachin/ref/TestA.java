/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class TestA {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/ref/reference-config.xml");
        A a = (A)context.getBean("aref");
        System.out.println(a);
        
        A a2 = (A)context.getBean("aref2");
        System.out.println(a2);
    }
}
