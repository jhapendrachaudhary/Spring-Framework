package org.example.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpELConfig.xml");
        Example eg= context.getBean("example",Example.class);
        System.out.println(eg);
    }
}
