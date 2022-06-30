/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.ref;

/**
 *
 * @author sachink1
 */
public class A {
    private int x;
    private B b;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public A() {
    }

    public A(int x, B b) {
        this.x = x;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" + "x=" + x + ", b=" + b + '}';
    }
    
    
    
}
