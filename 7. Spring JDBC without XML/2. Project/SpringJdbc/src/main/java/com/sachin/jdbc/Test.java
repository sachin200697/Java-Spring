
package com.sachin.jdbc;

import com.sachin.jdbc.dao.StudentDao;
import com.sachin.jdbc.entity.Student;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {
    public static void main(String args[]){
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
        Student s1 = new Student(2, "Pradeep", "BSR");
        Student s2 = new Student(2, "Pradeep", "Bulandshahr");
        
        int c1 = studentDao.insert(s1);
        int c2 = studentDao.change(s2);
        int c3 = studentDao.delete(2);
        
        Student s = studentDao.getStudent(1);
        
        List<Student> list = studentDao.getAllStudents();
        
        System.out.println("Record insdrted: "+c1);
        System.out.println("Record updated: "+c2);
        System.out.println("Record deleted: "+c3);
        System.out.println(s.getId() + " - " + s.getName() + " - " + s.getCity());
        
        for(Student std: list){
            System.out.println(std.getId() + " - " + std.getName() + " - " + std.getCity());
        }
        
    }
}
