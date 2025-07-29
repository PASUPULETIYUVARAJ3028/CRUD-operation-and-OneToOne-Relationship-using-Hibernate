package com.ManyToManyRelation.task;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

import java.util.*;

public class App {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		
		Trainer tr1 = new Trainer();
		Trainer tr2 = new Trainer();
		Trainer tr3 = new Trainer();
		
		List<Trainer> trainerList_1 = new ArrayList<Trainer>();
		trainerList_1.add(tr1);
		trainerList_1.add(tr2);
		
		List<Trainer> trainerList_2 = new ArrayList<Trainer>();
		trainerList_2.add(tr1);
		trainerList_2.add(tr3);
		
		List<Trainer> trainerList_3 = new ArrayList<Trainer>();
		trainerList_3.add(tr2);
		
		List<Trainer> trainerList_4 = new ArrayList<Trainer>();
		trainerList_4.add(tr2);
		trainerList_4.add(tr3);
		
		Tech tech1 = new Tech(111, "java", trainerList_1);
		Tech tech2 = new Tech(222, "sql", trainerList_2);
		Tech tech3 = new Tech(333, "python", trainerList_3);
		Tech tech4 = new Tech(444, "react", trainerList_4);
		
		List<Tech> techList1 = new ArrayList<>();
		techList1.add(tech1);
		techList1.add(tech2);
		
		List<Tech> techList2 = new ArrayList<>();
		techList2.add(tech1);
		techList2.add(tech3);
		techList2.add(tech4);
		
		List<Tech> techList3 = new ArrayList<>();
		techList3.add(tech2);
		techList3.add(tech4);
		
		tr1.setTrainerId(1);
		tr1.setTrainerName("ayush");
		tr1.setListTech(techList1);
		
		tr2.setTrainerId(2);
		tr2.setTrainerName("deep");
		tr2.setListTech(techList2);
		
		tr3.setTrainerId(3);
		tr3.setTrainerName("ankit");
		tr3.setListTech(techList3);
		
		session.persist(tech1);
		session.persist(tech2);
		session.persist(tech3);
		session.persist(tech4);
		
		session.persist(tr1);
		session.persist(tr2);
		session.persist(tr3);
		
		session.getTransaction().commit();
	}

}
