/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import java.util.LinkedList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author sachink1
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Sachin Controller");
        model.addAttribute("name", "Sachin Kumar");
        model.addAttribute("id", 15635);
        List<String> friends = new LinkedList();
        friends.add("Sachin");
        friends.add("Pradeep");
        model.addAttribute("friends", friends);
        return "index";
    }
    
    @RequestMapping("/")
    public String Default(Model model){
        System.out.println("Sachin Default Controller");
        model.addAttribute("name", "Default");
        model.addAttribute("id", -1);
        List<String> friends = new LinkedList();        
        model.addAttribute("friends", friends);
        return "index";
    }
    
    @RequestMapping("/help")
    public ModelAndView help(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "Sachin Kumar");
        
        //passing array
        modelAndView.addObject("arr", new Integer[]{34, 3, 56});
        modelAndView.setViewName("help");
        return modelAndView;
    }
}
