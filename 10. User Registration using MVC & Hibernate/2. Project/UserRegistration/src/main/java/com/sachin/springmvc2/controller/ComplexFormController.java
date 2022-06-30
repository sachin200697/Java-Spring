/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import com.sachin.springmvc2.model.ComplexStudent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author sachink1
 */
@Controller
public class ComplexFormController {
    @RequestMapping("/complexform")
    public String complexForm(){
        return "complex_form";
    }
    
    @RequestMapping(path="/handlecomplexform", method=RequestMethod.POST)
    public String handleComplexForm(@ModelAttribute("student") ComplexStudent student, BindingResult result, Model m){
        // @ModelAttribute("student"), student => we will get data using kay as "student" now
        
        if(result.hasErrors()){
            return "complex_form";
        }
        System.out.println(student);
        return "show_complex_form_data";
    }
}
