package com.Hibernate.HibernateTutorial.One2one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	  public static void main( String[] args )
	    {
	        System.out.println( "Hello World!" );
	        SessionFactory factory = new Configuration().configure().buildSessionFactory();
	        
	        Question q1 = new Question();
	        q1.setQid(1);
	        q1.setQuestion("What is Java?");
	        Answer a1 = new Answer();
	        a1.setAid(200);
	        a1.setAnswer("A Programming Language");
	        a1.setQuestion(q1);
	        
	        q1.setAnswer(a1);
	        
	        Question q2 = new Question();
	        q2.setQid(4);
	        q2.setQuestion("What is Python?");
	        Answer a2 = new Answer();
	        a2.setAid(201);
	        a2.setAnswer("A programming Lnagugae");
	        a2.setQuestion(q2);
	        
	        q2.setAnswer(a2);
	        
	        //System.out.println(factory.isClosed());
	        
	        //save method is in session class
	        Session session = factory.openSession();
	        session.beginTransaction();
	        
	        session.save(q1);
	        session.save(q2);
	        session.save(a1);
	        session.save(a2);
	        
	        session.getTransaction().commit();
	        
	        //fetching
	        Question newq = (Question)session.get(Question.class, 4);
	        System.out.println(newq.getQuestion());
	        System.out.println(newq.getAnswer().getAnswer()); //one getAnswer method of Question class and then going to Answer class and executing
	        													//getanswer() method of it 
	       
	        
	        session.close();
	        
	        factory.close();
	        
	    }

}
