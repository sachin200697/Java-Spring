/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/expressionlanguage/expression-language.xml");
        Demo d = context.getBean("demo", Demo.class);
        
        System.out.println(d);
    }
    
}
