package org.example.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoTypeConfig.xml");
        Student stud= context.getBean("student", Student.class);
        Room room= context.getBean("room", Room.class);
        System.out.println(stud);
        System.out.println(room);
    }
}
