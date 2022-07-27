package com.Hibernate.HibernateTutorial.One2Many;


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
	        
	/*        QuestionOne2Many q1 = new QuestionOne2Many();
	        q1.setQid(1);
	        q1.setQuestion("What is Python?");
	        
	        
	        
	        AnswerOne2Many a1 = new AnswerOne2Many();
	        a1.setAid(123);
	        a1.setAnswer("A Programming Language");
	        a1.setQuestion(q1);
	        

	        AnswerOne2Many a2 = new AnswerOne2Many();
	        a2.setAid(124);
	        a2.setAnswer("which is very famous nowadays");
	        a2.setQuestion(q1);
	        
	        
	        //setting list of answers
	        List<AnswerOne2Many> answers = new ArrayList<AnswerOne2Many>();
	        answers.add(a1);
	        answers.add(a2);
	        
	     q1.setAnswers(answers);
	        
	        //System.out.println(factory.isClosed());
	        
	        //save method is in session class  */
	        Session session = factory.openSession();
	        session.beginTransaction();
	        
	      /*  session.save(q1);
	        session.save(a1);
	        session.save(a2); */
	        
	        session.getTransaction().commit();
	        
	        //fetching
	        QuestionOne2Many newq = (QuestionOne2Many)session.get(QuestionOne2Many.class, 1);
	        System.out.println(newq.getQuestion());
	        for(AnswerOne2Many answer : newq.getAnswers())
	        {
	        	System.out.println(answer.getAnswer());
	        } 
	       
	        
	        session.close();
	        
	        factory.close();
	        
	    }

}
