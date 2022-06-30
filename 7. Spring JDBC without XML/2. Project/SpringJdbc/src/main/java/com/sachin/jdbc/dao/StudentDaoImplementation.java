/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sachin.jdbc.dao;

import com.sachin.jdbc.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDao")    //if not want to use Bean then use it
public class StudentDaoImplementation implements StudentDao{
    @Autowired  //to inject the JdbcTemplate object automatically
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int count = this.template.update(query, student.getId(), student.getName(), student.getCity());
        
        return count;
    }

    @Override
    public int change(Student student) {
        String query = "update student set name = ?, city=? where id = ?";
        int c = this.template.update(query, student.getName(), student.getCity(), student.getId());
        return c;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id = ?";
        int c = this.template.update(query, studentId);
        return c;
    }

    @Override
    public Student getStudent(int studentId) {
        String query = "Select * from student where id = ?";
        RowMapper rowMapper = new RowMapperImplementation();
        Student s = (Student) this.template.queryForObject(query, rowMapper, studentId);
        return s;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "select * from student";
        RowMapper rowMapper = new RowMapperImplementation();
        List<Student> list = this.template.query(query, rowMapper);
        return list;
    }
    
}
