package com.learn.hiber.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        // cfg.configure() automatically loaded the "hibernate.cfg.xml"
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        Employee emp = new Employee("Anil", 25000, "associative", "dev");
        session.persist(emp);
        
        session.getTransaction().commit();
    }
}
