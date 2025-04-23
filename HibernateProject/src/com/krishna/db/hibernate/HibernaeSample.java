package com.krishna.db.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernaeSample {

	public static void main(String[] args) {
		
try {
	//		Configuration => this will specify the DB details.
			Configuration config = new Configuration();
			
	//		Configuration => configure();
			config.configure("resource/hibernate.cfg.xml");
			
	//		SessionFactory => this is used to implement the sessions.
			SessionFactory sessionFactory = config.buildSessionFactory();
			
	//		Session => to excecute the DB CRUD operation
			Session session = sessionFactory.openSession();
			
			session.persist(args);
			
			System.out.println("Connected..");
} catch (HibernateException e) {
	// TODO Auto-generated catch block
	System.err.println("Not Connected");
	e.printStackTrace();
}
		
	}

}
