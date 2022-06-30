package com.sachin.jdbc.dao;

import com.sachin.jdbc.entity.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
 
public class RowMapperImplementation implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student s = new Student();
        s.setId(rs.getInt("id"));
        s.setName(rs.getString("name"));
        s.setCity(rs.getString("city"));
        
        return s;
    }
    
}
