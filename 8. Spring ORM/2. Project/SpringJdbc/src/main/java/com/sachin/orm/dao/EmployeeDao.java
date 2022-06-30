/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.orm.dao;

import com.sachin.orm.entities.Employee;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author sachink1
 */
public class EmployeeDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
    
    @Transactional
    public int insert(Employee employee){
        int idOfEmployee;
        idOfEmployee = (int)this.hibernateTemplate.save(employee);
        return idOfEmployee;
    }  
    
    public Employee getEmployee(int employeeId){
        Employee employee = this.hibernateTemplate.get(Employee.class, employeeId);
        return employee;
    }
    
    public List<Employee> getAllEmployees(){
        List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
        return employees;
    }
    
    @Transactional
    public void deleteEmployee(int employeeId){
        Employee emp = this.hibernateTemplate.get(Employee.class, employeeId);
        this.hibernateTemplate.delete(emp);
    }
    
    @Transactional
    public void updateEmployee(Employee emp){
        this.hibernateTemplate.update(emp);
    }
}
