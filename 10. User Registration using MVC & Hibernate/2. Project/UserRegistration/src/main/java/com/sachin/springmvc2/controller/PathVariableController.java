/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author sachink1
 */
@Controller
public class PathVariableController {
//    @RequestMapping("/user/{id}/{name}")
//    public String pathVariable(@PathVariable("id") int id, @PathVariable("name") String name){
//        System.out.println(id + "---" + name);
//        return "contact_form";
//    }
    
    @RequestMapping(value= "/user/{id}")
    public String exmaple(@PathVariable("id") int id){
        System.out.println(id);
        return "redirect:/complexform";
    }
}
