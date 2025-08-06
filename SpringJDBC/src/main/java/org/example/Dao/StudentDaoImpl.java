package org.example.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class StudentDaoImpl implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public int insert(Student student) {
        String query = "Insert into student(id,name,city) values(?,?,?)";
        int result =  jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "Update student set name = ?, city=? where id = ?";
        int result = jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
        return result;
    }

    @Override
    public int delete(Student student) {
        String query = "Delete from student where id = ?";
      int result =  jdbcTemplate.update(query,student.getId());
        return result;
    }

    @Override
    public Student getStudentById(int id) {
        String query = "Select * from student where id = ?";
//        RowMapper<Student> rowMapper = new RowMapperImp();
        Student student = jdbcTemplate.queryForObject(query, new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setCity(rs.getString("city"));
                return student;
            }
            }, id);

        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        String query = "Select * from student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImp());
        return students;
    }


}
