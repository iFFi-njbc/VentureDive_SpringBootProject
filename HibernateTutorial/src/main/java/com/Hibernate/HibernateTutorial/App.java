package com.Hibernate.HibernateTutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student st = new Student(2, "Shazia", "Gilgit");
        Address ad = new Address();
        ad.setCity("Lahore");
        ad.setId(1);
        ad.setStreet("Madina Street");
        ad.setDate(new Date());

        //reading image
        FileInputStream fio = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[fio.available()];
        fio.read(data);
        ad.setImage(data);
        
        
        System.out.println(st);
        //System.out.println(factory.isClosed());
        Session session = factory.openSession();
        session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        session.getTransaction().commit();
        
        session.close();
        
    }
}
