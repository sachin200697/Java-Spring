/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author sachink1
 */
@ControllerAdvice
public class CentralizeExceptionController {
    @RequestMapping("/errorexample")
    public String getError(){
        String s=null;
        s.length();
        return "/home";
    }
    
    
    //handle exception for NullPoint and NumberFormat
    @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    public String exceptionHandeler(Model m){
        m.addAttribute("msg", "NullPointException or NumberFormatException occur");
        return "error_exception";
    }
    
    //handle ClassNotFoundException 
    @ExceptionHandler(value=ClassNotFoundException.class)
    public String secondExceptionHandeler(Model m){
        m.addAttribute("msg", "Class not found exception occur");
        return "error_exception";
    }
    
    //handle exception for every other exception
    @ExceptionHandler(value=Exception.class)
    public String allExceptionHandeler(Model m){
        m.addAttribute("msg", "Some Exception occur");
        return "error_exception";
    }
}
