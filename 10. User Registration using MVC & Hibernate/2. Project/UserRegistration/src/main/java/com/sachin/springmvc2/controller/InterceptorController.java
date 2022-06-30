/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author sachink1
 */
@Controller
public class InterceptorController {
    @RequestMapping("/interceptor")
    public String getInterceptor(){
        return "interceptor_example";
    }
    
    @RequestMapping(path="/welcome", method=RequestMethod.POST)
    public String doWelcome(@RequestParam("name") String name, Model m ){
        m.addAttribute("name", name);
        System.out.println(name);
        return "interceptor_welcome";
    }
}
