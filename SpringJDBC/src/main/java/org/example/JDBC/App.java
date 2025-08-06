package org.example.JDBC;

import org.example.Dao.Student;
import org.example.Dao.StudentDao;
import org.example.Dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Database connection using help of SpringJdbc Templet...." );
//        ApplicationContext context = new ClassPathXmlApplicationContext("SpringJDBCConfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
       StudentDao studentDao = (StudentDao) context.getBean("studentDao", StudentDao.class);

       //insert operation using spring jdbc
//       Student student = new Student();
//       student.setId(5);
//       student.setName("Rajesh");
//       student.setCity("Chennai");
//       int result = studentDao.insert(student);
//       System.out.println("Result of insert operation is "+result);

        // Update operation using springframework
//        Student student = new Student();
//        student.setId(5);
//        student.setName("Vajra ");
//        student.setCity("Vajrapur ");
//        int result = studentDao.update(student);
//        System.out.println("Result of update operation is "+result);

        //Delete operation using springframework
//        Student student = new Student();
//        student.setId(3);
//        int result = studentDao.delete(student);
//        System.out.println("Result of delete operation is "+result);

        //Read operation only one data fetch using springframework
//        Student student = studentDao.getStudentById(2);
//        System.out.println("Student name is "+student.getName()+" and city is "+student.getCity());

        //Read operation all data fetch using springframework
        List<Student> students = studentDao.getAllStudents();
        for(Student student:students){
            System.out.println("Student name is "+student.getName()+" and city is "+student.getCity());
        }
    }
}
