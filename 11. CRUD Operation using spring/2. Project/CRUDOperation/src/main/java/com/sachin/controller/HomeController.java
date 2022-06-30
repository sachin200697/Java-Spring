/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.controller;

import com.sachin.dao.ProductDao;
import com.sachin.model.Product;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 *
 * @author sachink1
 */
@Controller
public class HomeController {
    @Autowired
    private ProductDao productDao;
    
    @RequestMapping("/")
    public String home(Model m){
        m.addAttribute("products",this.productDao.getAllProducts());
        return "index";
    }
    
    @RequestMapping("/add-product")
    public String addProduct(Model m){
        m.addAttribute("title", "add product");
        return "add_product_form";
    }
    
    @RequestMapping(path="/handle-add-product", method=RequestMethod.POST)
    public RedirectView habdleAddProduct(@ModelAttribute Product product, HttpServletRequest request){
        RedirectView view = new RedirectView();
        this.productDao.createProdect(product);        
        view.setUrl(request.getContextPath() + "/");
        return view;
    }
    
    @RequestMapping(path="delete/{productId}")
    public RedirectView deleteProduct(@PathVariable("productId") int id, HttpServletRequest request){
        RedirectView view = new RedirectView();
        this.productDao.deleteProdect(id);
        view.setUrl(request.getContextPath() + "/");
        return view;
    }
    
    @RequestMapping(value="edit")
    public String editProduct(@RequestParam("productId") int id, HttpServletRequest request, Model m){
        Product p = this.productDao.getProduct(id);
        m.addAttribute("product", p);
        System.out.println(id);
        return "edit_product_form";
    }
    
}
