/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.dao;

import com.sachin.model.Product;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author sachink1
 */
@Component
public class ProductDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    public void createProdect(Product p){
        this.hibernateTemplate.saveOrUpdate(p);
    }
    
    public List<Product> getAllProducts(){
        List<Product> products = this.hibernateTemplate.loadAll(Product.class);
        return products;
    }
    
    public Product getProduct(int id){
        Product product = this.hibernateTemplate.get(Product.class, id);
        return product;
    }
    
    @Transactional
    public void updateProdect(Product p){
        this.hibernateTemplate.update(p);
    }
    
    @Transactional
    public void deleteProdect(int id){
        Product product = this.hibernateTemplate.load(Product.class, id);
        this.hibernateTemplate.delete(product);
    }
    
}
