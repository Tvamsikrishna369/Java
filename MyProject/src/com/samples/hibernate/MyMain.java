package com.samples.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyMain {

	public static void main(String[] args) {

		try {
			Configuration config = new Configuration();
			config.addAnnotatedClass(Employee.class);
			config.configure();
			SessionFactory sessionFactory = config.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Transaction txn = session.beginTransaction();
			Employee emp = new Employee();
			emp.setId(1);
			emp.setName("abc");
			session.persist(emp);
			txn.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
