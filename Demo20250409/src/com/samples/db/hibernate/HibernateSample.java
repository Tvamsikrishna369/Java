package com.samples.db.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.samples.db.hibernate.model.Student;

public class HibernateSample {

	public static void main(String[] args) {
		
		
		try {
			// Configuration -> This will specify the DB details.
			Configuration config = new Configuration();
			
			// Configuration - configure()
//			config.configure();
			config.configure("resources/hibernate.cfg.xml");
			
			// SessionFactory -> This is used to implement the sessions.
			SessionFactory sessionFactory = config.buildSessionFactory();
			
			// Session - To execute the database crud operations.
			Session session = sessionFactory.openSession();
			
			Query<Student> query = session.createQuery("from Student", Student.class);
			List<Student> results = query.getResultList();
//			System.out.println(results);
			results.stream().forEach(student -> System.out.println(student));
			
//			Student student = session.find(Student.class, 1);
//			System.out.println(student);
//			
//			Transaction txn = session.beginTransaction();
//			Student student1 = new Student(8,"somename", 18, "M", "ECE");
//			session.persist(student1);
//			txn.commit();
			
			
			System.out.println("Connected.");			
		} catch (Exception e) {
			System.err.println("Exception");
			e.printStackTrace();
		}

		
	}

}
