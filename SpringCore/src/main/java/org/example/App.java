package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Students student = (Students) context.getBean("student1");
        Students student3 = (Students) context.getBean("student3");
        Students student2 = (Students) context.getBean("student2");

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);


    }
}
