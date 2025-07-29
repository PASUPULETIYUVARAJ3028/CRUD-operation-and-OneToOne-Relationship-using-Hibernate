package com.OneToManyRelation.task;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class App {

	public static void main(String[] args) {
		// auto-matically load the hibernate.cfg.xml
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		//session.beginTransaction();
		
		/*
		 *  1. 1st create the person class object with zero-para-constructor.
		 *  2. because Person class need the list of bikes.
		 *  3. so, that is the reason to create the zero-para-constructor with Person class Object.
		 * 
		 */
		/*
		Person p = new Person();
		
		Bike b1 = new Bike(1001, "pulsar", 97000, p);
		Bike b2 = new Bike(1002, "apache", 77000, p);
		
		List<Bike> bikesList = new ArrayList<Bike>();
		bikesList.add(b1);
		bikesList.add(b2);
		
		p.setId(3001);
		p.setName("Baskar");
		p.setBikesList(bikesList);
		
		// save the obj
		session.persist(p);
		session.persist(b1);
		session.persist(b2);
		*/
		
		session.beginTransaction();
		
		Person p2 = new Person();
		
		Bike b3 = new Bike(1003, "Discover 123", 59000, p2);
		Bike b4 = new Bike(1004, "TVs 150", 40000, p2);
		
		List<Bike> bikesList2 = new ArrayList<Bike>();
		bikesList2.add(b3);
		bikesList2.add(b4);
		
		p2.setId(3002);
		p2.setName("Durga");
		p2.setBikesList(bikesList2);
		
		
		// ==========================
		
		Person p3 = new Person();
		
		Bike b5 = new Bike(1005, "Tvs scooty", 59000, p3);
		Bike b6 = new Bike(1006, "Eletric bike Tata", 40000, p3);
		
		List<Bike> bikesListP3 = new ArrayList<Bike>();
		bikesListP3.add(b5);
		bikesListP3.add(b6);
		
		p3.setId(3003);
		p3.setName("Praneeth");
		p3.setBikesList(bikesListP3);
		
		
		// save the obj
		
		session.persist(p2);
		session.persist(b3);
		session.persist(b4);
		
		session.persist(p3);
		session.persist(b5);
		session.persist(b6);
		
		session.getTransaction().commit();
	}

}
