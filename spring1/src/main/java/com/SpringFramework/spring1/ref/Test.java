package com.SpringFramework.spring1.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
    public static void main( String[] args )
    {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/spring1/ref/refconfig.xml");

        
        A a = (A)context.getBean("Aref");

       
        System.out.println(a);
        System.out.println(a.getOb());
        
    }

}
