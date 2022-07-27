package com.SpringFramework.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFramework.spring1.ref.A;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student st1 = (Student)context.getBean("Student1");
        Student st2 = (Student)context.getBean("Student2");
        

        System.out.println(st1);
    ;
        System.out.println(st2);
    }
}
