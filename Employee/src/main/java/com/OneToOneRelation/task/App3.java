package com.OneToOneRelation.task;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        // cfg.configure() automatically loaded the "hibernate.cfg.xml"
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        Person p = new Person();
        
        AadharCard as  = new AadharCard(3002,"Durga","address1234","male",p);
        
        p.setId(102);
        p.setNickName("Durga");
        p.setCard(as);
        
        session.persist(p);
        session.persist(as);
        
        session.getTransaction().commit();
        
        
	}

}
