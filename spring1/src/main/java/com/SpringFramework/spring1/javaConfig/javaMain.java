package com.SpringFramework.spring1.javaConfig;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class javaMain {
    public static void main( String[] args )
    {
 
        ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);

       Student e = context.getBean("student", Student.class);
        System.out.println(e);
        
    }

}
