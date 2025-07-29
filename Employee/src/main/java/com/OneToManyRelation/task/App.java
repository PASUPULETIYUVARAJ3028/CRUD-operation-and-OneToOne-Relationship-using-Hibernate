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
		session.beginTransaction();
		
		/*
		 *  1. 1st create the person class object with zero-para-constructor.
		 *  2. because Person class need the list of bikes.
		 *  3. so, that is the reason to create the zero-para-constructor with Person class Object.
		 * 
		 */
		
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
		
		session.getTransaction().commit();
	}

}
