/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.streo;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author sachink1
 */
@Component
public class Student {
    @Value("Sachin Kumar")    
    private String studentName;
    
    @Value("Bulandshahr")
    private String studentCity;
    
    @Value("#{myList}")
    private List<String> friends;
    

    public String getStudentName() {
        return studentName;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" + "studentName=" + studentName + ", studentCity=" + studentCity + ", friends=" + friends + '}';
    }    
    
}
