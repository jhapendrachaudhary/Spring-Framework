package com.controller;

import com.model.Student;
import com.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id = Integer.parseInt(req.getParameter("id"));
       String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
       String course = req.getParameter("course");

        Student stu = new Student(id,name,age,course);

        StudentService s1 = new StudentService();
        s1.insert(stu);

    }
}
