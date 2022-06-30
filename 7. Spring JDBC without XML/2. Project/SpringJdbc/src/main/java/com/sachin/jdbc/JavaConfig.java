package com.sachin.jdbc;

import com.sachin.jdbc.dao.StudentDao;
import com.sachin.jdbc.dao.StudentDaoImplementation;
import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan("com.sachin.jdbc")
public class JavaConfig {
    @Bean("ds")
    public DataSource getDataSource(){
        DriverManagerDataSource dms =  new DriverManagerDataSource();
        dms.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dms.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        dms.setUsername("sachin");
        dms.setPassword("sachin");
        return dms;
    }
    
    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate template = new JdbcTemplate();
        template.setDataSource(getDataSource());
        return template;
    }
    
    //we can use below or we can use autowiring 
//    @Bean("studentDao")
//    public StudentDao getStudentDao(){
//        StudentDaoImplementation  sdm = new StudentDaoImplementation();
//        sdm.setTemplate(getJdbcTemplate());
//        return sdm;
//    }
    
}
