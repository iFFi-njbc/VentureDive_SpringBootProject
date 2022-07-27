package com.SpringFramework.spring1.Component;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test2 {
    public static void main( String[] args )
    {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/spring1/Component/Componentconfig.xml");

       Student e = context.getBean("student", Student.class);
        System.out.println(e);
        
    }

}
