package org.example.BeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext abstcontext = new ClassPathXmlApplicationContext("BeanLifeCycleConfig.xml");
        Books book = (Books) abstcontext.getBean("book");
        UsingInterface pen = (UsingInterface) abstcontext.getBean("pen");
        UsingAnnotation interest = (UsingAnnotation) abstcontext.getBean("interest");
        System.out.println(book);
        System.out.println(" ");
        System.out.println(pen);
        System.out.println(" ");
        System.out.println(interest);
        abstcontext.registerShutdownHook();
    }
}
