/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author sachink1
 */
@Configuration

//use only if we are using @Component for any class
// but if we are using @Bean annotation then, we don't need to use it
// but if we are using for a class @Component and for second one @Bean then we will have to use it
@ComponentScan(basePackages="com.sachin.javaconfig")    
public class JavaConfig {
    
    @Bean
    //now to getBean method we need to use name of bean as below method name "getTeacher"
    public Teacher getTeacher(){
        Teacher t = new Teacher("Saurabh Sukhla", getSubject());
        return t;
    }
    
    @Bean(name={"subject1", "subject2"})    
    //to give the name to the bean if we don't want to use method name as bean
    //as we are providing an array, so can give more than one name
    public Subject getSubject(){
        return new Subject();
    }
    
}
