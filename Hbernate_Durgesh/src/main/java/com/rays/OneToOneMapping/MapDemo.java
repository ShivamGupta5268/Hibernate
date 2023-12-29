package com.rays.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		
		Answer ans1 = new Answer();
		ans1.setAnswerId(200);
		ans1.setAnswer("java is OOP language");
		
		Question que1 = new Question();
		que1.setQuestionId(100);
		que1.setQuestion("what is java");
		que1.setAnswer(ans1);
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(201);
		ans2.setAnswer("pythod is language");
		
		Question que2 = new Question();
		que2.setQuestionId(101);
		que2.setQuestion("what is python");
		que2.setAnswer(ans2);
		
		Transaction tx = session.beginTransaction();
		session.save(que1);
		session.save(que2);
		
		session.save(ans1);
		session.save(ans2);
		
		tx.commit();
		session.close();		
		
	}
}
