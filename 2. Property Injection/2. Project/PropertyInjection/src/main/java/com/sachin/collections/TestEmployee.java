/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class TestEmployee {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/collections/collection-config.xml");
        Employee emp1 = (Employee)context.getBean("employee1");
        System.out.println(emp1);
    }
}
