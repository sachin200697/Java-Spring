/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sachin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class SpringIntroduction {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/app-context.xml");
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
        
    }
}
