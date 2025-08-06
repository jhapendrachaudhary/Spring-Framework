package org.example.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ConstInjConfig.xml");
        Person p = (Person) context.getBean("person");
        System.out.println(p);
    }
}
