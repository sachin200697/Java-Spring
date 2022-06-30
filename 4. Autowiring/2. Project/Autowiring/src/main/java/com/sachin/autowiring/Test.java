/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sachin.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/autowiring/autowiring.xml");
        
        //Employee e = (Employee)context.getBean("employee");
        //to avoid type casting we can also use like below
        Employee e = context.getBean("employee", Employee.class);
        System.out.println(e);
        
        //by type example
        Employee e2 = context.getBean("employee2", Employee.class);
        System.out.println(e2);
        
        //by type constructor
        Employee e3 = context.getBean("employee3", Employee.class);
        System.out.println(e3);
    }
}
