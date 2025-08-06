package org.example.StandaloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("StandaloneCollectConfig.xml");
        Person person1 = context.getBean("person1",Person.class);
        System.out.println(person1);
        System.out.println("------------------------------");

        System.out.println(person1.getStudents().getClass().getName());
        System.out.println("___________________");
        System.out.println(person1.getCourses());
        System.out.println(person1.getCourses().getClass().getName());
        System.out.println("___________________");
        System.out.println(person1.getBenefits());
        System.out.println(person1.getBenefits().getClass().getName());
    }
}
