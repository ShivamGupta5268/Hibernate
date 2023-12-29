package com.rays.OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();
		
		Questionn que = new Questionn();
		que.setQuestionId(100);
		que.setQuestion("what is java");
		
		Answerr ans1 = new Answerr();
		ans1.setAnswerId(200);
		ans1.setAnswer("java is oop language");
		ans1.setQuestion(que);
		
		Answerr ans2 = new Answerr();
		ans2.setAnswerId(201);
		ans2.setAnswer("java is class based");
		ans2.setQuestion(que);
		
		Answerr ans3 = new Answerr();
		ans3.setAnswerId(202);
		ans3.setAnswer("java is high level");
		ans3.setQuestion(que);
		
		List<Answerr> list = new ArrayList<Answerr>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		que.setAnswer(list); 
		
		Transaction tx = session.beginTransaction();
		/*
		 * session.save(ans1); session.save(ans2); session.save(ans3);
		 */
		session.save(que);
		
		session.save(ans1);
		session.save(ans2);
		session.save(ans3);
		
		tx.commit();
		session.close();
		
		
		
		
	}
}
