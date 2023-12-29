package com.rays.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetOneToOneTest {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		
		Question q = session.get(Question.class, 100);
		System.out.println(q);
		
		
	}
}
