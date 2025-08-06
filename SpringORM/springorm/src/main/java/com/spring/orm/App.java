package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       StudentDao studentdao = (StudentDao) context.getBean("studentDao",StudentDao.class);
       Student student = new Student(6, "hello", "Universe");
       
       int r = studentdao.insert(student);
       System.out.println("done" + r);
       
    }
}
