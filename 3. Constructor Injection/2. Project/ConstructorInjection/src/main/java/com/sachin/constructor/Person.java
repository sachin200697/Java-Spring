/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.constructor;

/**
 *
 * @author sachink1
 */
public class Person {
    private String name;
    private int personId;
    private Certificate certi;

    public Person(String name, int personId, Certificate certi) {
        this.name = name;
        this.personId = personId;
        this.certi=certi;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", personId=" + personId + ", certi=" + certi + '}';
    }      
}
