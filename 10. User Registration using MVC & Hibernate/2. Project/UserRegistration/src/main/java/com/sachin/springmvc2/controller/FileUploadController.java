/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 *
 * @author sachink1
 */
@Controller
public class FileUploadController {
    @RequestMapping("/uploadfileform")
    public String showUploadForm(){
        return "upload_file_form";
    }
    
    @RequestMapping(path="/uploadimage", method=RequestMethod.POST)
    public String uploadImage(@RequestParam("file") CommonsMultipartFile file, HttpSession session, Model model){
        System.out.println(file.getContentType());
        System.out.println(file.getName()); //it will give the html name that we used in input tag
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getSize());
        System.out.println(file.getStorageDescription());
        
        System.out.println(session.getServletContext().getRealPath("/"));        
        //it will give the path of build 
        //C:\Users\sachink1\Documents\Courses\11. Spring\10. User Registration using MVC & Hibernate\2. Project\UserRegistration\target\SpringMVC2-1.0-SNAPSHOT\
        
        String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources" + File.separator + "img" + File.separator + file.getOriginalFilename();
        
        try{
            FileOutputStream fout = new FileOutputStream(path);
            fout.write(file.getBytes());
            model.addAttribute("file", file.getOriginalFilename());
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("Error in file uploading");
        }
        
        return "show_uploaded_file";
    }
}
