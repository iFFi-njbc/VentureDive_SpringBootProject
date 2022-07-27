package com.SpringFramework.spring1.xmlautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringFramework.spring1.ref.A;

public class Test {
    public static void main( String[] args )
    {
 
        ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringFramework/spring1/xmlautowired/configXMLanno.xml");

        Employee e = context.getBean("Employee", Employee.class);
        System.out.println(e);
        
    }

}
