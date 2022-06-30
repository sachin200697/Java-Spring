/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author sachink1
 */
@Component("demo")
public class Demo {
    @Value("#{98+2}")
    private int sum;
    
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double squareRoot;
    
    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{new java.lang.String('The kapil sharma show'}")
    private String showName;
    
    //for boolean values
    @Value("#{3>2}")
    private boolean isReady;

    public boolean isIsReady() {
        return isReady;
    }

    public void setIsReady(boolean isReady) {
        this.isReady = isReady;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
    
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getSquareRoot() {
        return squareRoot;
    }

    public void setSquareRoot(double squareRoot) {
        this.squareRoot = squareRoot;
    }
    

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Demo{" + "sum=" + sum + ", squareRoot=" + squareRoot + ", pi=" + pi + ", showName=" + showName + ", isReady=" + isReady + '}';
    }

    
}
