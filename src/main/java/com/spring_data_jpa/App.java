package com.spring_data_jpa;

import java.util.List;
import java.util.Optional;

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
        StudentDAO dao = container.getBean("studentDAO",StudentDAO.class);
        
        Student asad = new Student();
        asad.setName("Asadullah");
        asad.setEmail("asad@gmail.com");
        
        dao.save(asad);
        List<Student> students = dao.findAll();
        students.forEach(student -> System.out.println(student));
        
        Optional<Student> student = dao.findById(5);
        if(student.isPresent()) {
        	System.out.println("Found one ");
        	System.out.print(student.get());
        }
    }
}
