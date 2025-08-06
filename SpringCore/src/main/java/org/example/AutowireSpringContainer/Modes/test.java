package org.example.AutowireSpringContainer.Modes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("AutoWireConfig.xml");
        Emp employee = context.getBean("emp1" ,Emp.class);
        Emp employee2 = context.getBean("emp2" ,Emp.class);
        System.out.println(employee);
        System.out.println();
        System.out.println(employee2);
    }
}
