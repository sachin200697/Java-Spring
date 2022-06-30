/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author sachink1
 */
public class Pepsi implements InitializingBean, DisposableBean{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Pepsi() {
    }

    @Override
    public String toString() {
        return "Pepsi{" + "price=" + price + '}';
    }              

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is init method of pepsi");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside destroy method of pepsi");
    }
}
