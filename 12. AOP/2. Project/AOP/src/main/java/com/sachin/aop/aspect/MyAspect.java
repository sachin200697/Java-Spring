/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 *
 * @author sachink1
 */
@Aspect
public class MyAspect {
    //@Before to make method an advice 
    // * com.sachin.aop.services.PaymentServiceImp.makePayment here * represents any return type of makePayment method
    // to tell every method : * com.sachin.aop.services.PaymentServiceImp.*
    @Before("execution(* com.sachin.aop.services.PaymentServiceImp.makePayment())")
    public void printBefore(){
        System.out.println("Payment started");
    }
    
    
    @After("execution(* com.sachin.aop.services.PaymentServiceImp.makePayment())")
    public void printAfter(){
        System.out.println("Payment Ented");
    }
    
}
