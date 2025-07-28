package com.learn.hiber.Employee;

import java.util.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


// performing CRUD operation 

public class App2 {

	public static void main(String[] args)  {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.buildSessionFactory();
	}
	
	static void taskCRUDOperation(SessionFactory factory) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. insert");
		System.out.println("2. update");
		System.out.println("3. delete");
		System.out.println("4. display");
		System.out.println("5. exist");
		
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		
	}

}
