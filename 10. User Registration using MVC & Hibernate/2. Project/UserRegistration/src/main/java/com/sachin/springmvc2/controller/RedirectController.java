/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sachink1
 */
@Controller
public class RedirectController {
    @RequestMapping("/one")
    public String one(){
        return "redirect:/enjoy";
    }
    
    @RequestMapping("/enjoy")
    public String second(){
        return "complex_form";
    }
}
