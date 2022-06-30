/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import com.sachin.springmvc2.model.User;
import com.sachin.springmvc2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sachink1
 */
@Controller
public class ContactController {
    @Autowired
    private UserService userService;
    
    @RequestMapping("/contact")
    public String contact() throws Exception{ 
//        if(1==1) throw new Exception();
        return "contact_form";
    }
    
//    first method to get form data
//    @RequestMapping(path="/processform", method=RequestMethod.POST)
//    public String processForm(HttpServletRequest request){
//        String name =(String) request.getParameter("name");
//        String email = (String) request.getParameter("email");
//        String password = (String) request.getParameter("password");        
//        System.out.println(name + " " + email + " " + password);
//        
//        return "success";
//    }
    
    
    //Second method method to get form data
//    @RequestMapping(path="/processform", method=RequestMethod.POST)
//    public String processForm(
//            @RequestParam(name="name", required=false) String name, 
//            //rquired=false means name is optional but default required is true means parameters are must present
//            @RequestParam("email") String email,
//            @RequestParam("password") String password,
//            Model model
//    ){                
//        System.out.println(name + " " + email + " " + password);
//        
//        User user = new User();
//        user.setName(name);
//        user.setEmail(email);
//        user.setPassword(password);
//        
//        model.addAttribute("user", user);
//        return "success";
//    }
    
    //Third method method to get form data
    @RequestMapping(path="/processform", method=RequestMethod.POST)
    public String processForm(
            @ModelAttribute User user,
            Model model
    ){                
        System.out.println(user);           
        this.userService.createUser(user);
        return "success";
    }
    
    @ModelAttribute
    public void commonDataModel(Model m){
        m.addAttribute("day", "Today is sunday");
        m.addAttribute("city", "BSR");
    }
    
}
