/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author sachink1
 */
public class Pizza {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" + "price=" + price + '}';
    }
    
    @PostConstruct
    public void start(){
        System.out.println("This is init method of pizza");
    }
    
    @PreDestroy
    public void end(){
        System.out.println("This is destroy method of pizza");
    }
    
}
