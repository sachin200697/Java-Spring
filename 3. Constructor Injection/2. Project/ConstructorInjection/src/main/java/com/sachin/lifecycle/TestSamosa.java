/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class TestSamosa {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/lifecycle/lifecycle-config.xml");
        Samosa s1 = (Samosa) context.getBean("s1");
        System.out.println(s1);                
        
        Pepsi p1 = (Pepsi)context.getBean("p1");
        System.out.println(p1);
        
        Pizza pizza1 = (Pizza)context.getBean("pizza1");
        System.out.println(pizza1);
        
        context.registerShutdownHook();
    }
    
}
