/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.orm;

import com.sachin.orm.dao.EmployeeDao;
import com.sachin.orm.entities.Employee;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sachink1
 */
public class Application {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/sachin/orm/orm-config.xml");
    
        EmployeeDao empDao = context.getBean("employeeDao", EmployeeDao.class);
//        Employee e = new Employee(1, "Sachin", "No Temper");
//        int count = empDao.insert(e);
//        System.out.println("Tolat employee inserted: " + count);
//        
//        empDao.insert(new Employee(2, "Pradeep", "Meerpur"));
        
        empDao.updateEmployee(new Employee(1, "Sachin Kumar", "BSR"));
        
        Employee e1 = empDao.getEmployee(1);
        System.out.println(e1);
        
        List<Employee> employees = empDao.getAllEmployees();
        for(Employee emp : employees){
            System.out.println(emp);
        }
        
        empDao.deleteEmployee(2);
        
    }
}
