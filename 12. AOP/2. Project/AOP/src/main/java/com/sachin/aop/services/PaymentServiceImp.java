/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.aop.services;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author sachink1
 */


public class PaymentServiceImp implements PaymentService {

    @Override
    public void makePayment() {
        System.out.println("Cash withdraw...");
        
        
        System.out.println("Cash crediated");
    }
    
}
