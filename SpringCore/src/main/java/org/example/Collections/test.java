package org.example.Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml");
        Employee emp = (Employee) context.getBean("Employee");
        System.out.println(emp.getName());
        System.out.println(emp.getAddress());
        System.out.println(emp.getPhoneNo());
        System.out.println(emp.getCourse());
        System.out.println(emp.getPro());
    }
}
