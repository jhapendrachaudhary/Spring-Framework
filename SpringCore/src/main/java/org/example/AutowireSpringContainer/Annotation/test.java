package org.example.AutowireSpringContainer.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("AutoWireConfig2.xml");
        Emp2 employee = context.getBean("employee" ,Emp2.class);
        Emp2 employee2 = context.getBean("employee" ,Emp2.class);
        System.out.println(employee);
        System.out.println(employee2);
        System.out.println();
//        System.out.println(employee2);
    }
}
