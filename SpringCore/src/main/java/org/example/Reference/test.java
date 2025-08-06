package org.example.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("refConfig.xml");
       ClassA a= (ClassA) context.getBean("aref");
       ClassB b=(ClassB) context.getBean("bref");

        System.out.println(a);
        System.out.println(b);
    }
}
