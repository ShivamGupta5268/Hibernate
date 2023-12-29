package com.rays;

import java.io.FileOutputStream;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetLoad {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
	
		/*
		 * Address student = session.get(Address.class, 1);
		 * System.out.println(student.getImage());
		 */
		Certificate cer = new Certificate();
		cer.setCourse("math");
		cer.setDuration("1 month");
				
		Stud s = new Stud();		
		s.setId(1);
		s.setName("Shivam");
		s.setCert(cer);		
		
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		
	}
}
