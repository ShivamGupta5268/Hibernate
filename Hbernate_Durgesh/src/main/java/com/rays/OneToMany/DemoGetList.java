package com.rays.OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DemoGetList {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		
		Questionn q = (Questionn) session.get(Questionn.class, 100);
		System.out.println(q.getQuestion());
		
		for(Answerr a : q.getAnswer()) {
			System.out.println(a.getAnswer());
		}
		
		
	}
}
