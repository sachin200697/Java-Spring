/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.streo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/streo/streo.xml");
        Student s = context.getBean("student", Student.class);
        
        System.out.println(s);
        System.out.println(s.getFriends().getClass().getName());
        
        //for scope testing singleton(default scope)
        Student s2 = context.getBean("student", Student.class);
        System.out.println(s.hashCode() + " - " + s2.hashCode()); 
        //both will be same as bydefault signleton scope is used.
        
        //for scope testing
        Teacher t1 = context.getBean("teacher", Teacher.class);
        Teacher t2 = context.getBean("teacher", Teacher.class);
        System.out.println(t1.hashCode() + " - " + t2.hashCode()); 
        //both will be different as in Teacher class we mentioned prototype scope using annotation .

    }
    
}
