package com.Hibernate.HibernateTutorial.Many2Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        SessionFactory factory = new Configuration().configure().buildSessionFactory();
	        
	        Employee e1 = new Employee();
	        Employee e2 = new Employee();
	        
	        Project p1 = new Project();
	        Project p2 = new Project();
	        
	        List<Employee> emplist = new ArrayList<Employee>();
	        List<Project> projlist = new ArrayList<Project>();
	        
	        emplist.add(e1);
	        emplist.add(e2);
	        
	        projlist.add(p1);
	        projlist.add(p2);
	        
	        e1.setE_id(1);
	        e1.setName("Ifrah");
	        e1.setProjects(projlist);
	        
	        e1.setE_id(2);
	        e2.setName("ushna");
	        
	        p1.setP_id(200);
	        p1.setProject_name("Library Management System");
	        p1.setEmp(emplist);
	        
	        p2.setP_id(201);
	        p2.setProject_name("EmployeeMnagment System");
	        
	        
	        
	        
	    	        //save method is in session class  */
	        Session session = factory.openSession();
	        session.beginTransaction();
	        
	        session.save(e1);
	        session.save(e2);
	        session.save(p1);
	        session.save(p2);

	        
	        session.getTransaction().commit();
	        
	      /*  //fetching
	        QuestionOne2Many newq = (QuestionOne2Many)session.get(QuestionOne2Many.class, 1);
	        System.out.println(newq.getQuestion());
	        for(AnswerOne2Many answer : newq.getAnswers())
	        {
	        	System.out.println(answer.getAnswer());
	        } */
	       
	        
	        session.close();
	        
	        factory.close();
	        
	    }

}
