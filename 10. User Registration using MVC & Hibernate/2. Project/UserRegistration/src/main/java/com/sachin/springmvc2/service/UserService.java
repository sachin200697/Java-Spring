/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.springmvc2.service;

import com.sachin.springmvc2.dao.UserDao;
import com.sachin.springmvc2.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sachink1
 */
@Service    
//to tell the container that bean should be created for this class and object need to be injected
public class UserService {
    @Autowired
    private UserDao userDao;
    
    public int createUser(User user){
        return this.userDao.saveUser(user);
    }
}
