package com.rays;

// Shivam gupta

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) throws IOException {

		System.out.println("h");

		SessionFactory sf = new Configuration().configure("com/rays/hibernate.cfg.xml").buildSessionFactory();

		Address ad = new Address();
		ad.setCity("Satana");
		ad.setAddedDate(new Date());
		ad.setOpen(true);
		ad.setX(111);
		
		FileInputStream file = new FileInputStream("src/main/java/com/rays/rays.jpg");
		byte [] data = new byte[file.available()];
		file.read(data);
		ad.setImage(data);
		
		Student student = new Student();
		student.setId(101);
		student.setName("Shivam");
		student.setCity("Satna");

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(student);
		session.save(ad);
		tx.commit();
		session.close();

	}
}
