/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.aop;

import com.sachin.aop.services.PaymentServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class App {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/aop/services/config.xml");
        PaymentServiceImp payment = context.getBean("payment", PaymentServiceImp.class);
        
        payment.makePayment();
    }   
    
}
