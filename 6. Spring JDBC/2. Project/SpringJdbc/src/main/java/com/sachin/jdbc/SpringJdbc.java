/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sachin.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author sachink1
 */
public class SpringJdbc {

    public static void main(String[] args) {
        
        //Steps to use jdbc in spring
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/jdbc/config.xml");
        
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        
        int recordInserted = jdbcTemplate.update(query, 1, "Sachin", "BSR");
        
        System.out.println("Record inserted: "+recordInserted);
    }
}
