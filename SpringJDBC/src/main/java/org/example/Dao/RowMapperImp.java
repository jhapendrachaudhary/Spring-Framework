package org.example.Dao;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImp implements RowMapper<Student> {
    @Override
    public Student mapRow(java.sql.ResultSet resultSet, int i) throws java.sql.SQLException {
        Student student = new Student();
        student.setId(resultSet.getInt("id"));
        student.setName(resultSet.getString("name"));
        student.setCity(resultSet.getString("city"));
        return student;
    }
}