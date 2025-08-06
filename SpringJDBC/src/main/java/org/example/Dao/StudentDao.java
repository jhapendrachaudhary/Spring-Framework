package org.example.Dao;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(Student student);
    public Student getStudentById(int id);
    public List<Student> getAllStudents();
}
