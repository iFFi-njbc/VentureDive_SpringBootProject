package com.ORM.ORMlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ORM.ORMlearning.dao.StudentDAO;
import com.ORM.ORMlearning.entities.Student;

import antlr.collections.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/ORM/ORMlearning/config.xml");
        StudentDAO dao = context.getBean("studentdao", StudentDAO.class);
        
        Student st = new Student(2, "Ifrah", "Lahore");
        
        Integer r = dao.insert(st);
        System.out.println("DONE : " + r);
        System.out.println("ALL RECORDS: " + "\n" + dao.getAllStudents());
        
    }
}
