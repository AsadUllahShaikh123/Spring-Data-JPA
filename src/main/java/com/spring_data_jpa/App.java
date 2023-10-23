package com.spring_data_jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_data_jpa.config.AppConfig;
import com.spring_data_jpa.dao.StudentDAO;
import com.spring_data_jpa.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDAO dao = container.getBean("studentDaoImpl",StudentDAO.class);
        
        Student student = new Student();
        student.setName("Asadullah");
        student.setEmail("asad@gmail.com");
        dao.saveStudent(student);
    }
}
