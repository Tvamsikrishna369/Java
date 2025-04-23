package com.samples.db.hbt.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory;
	
	
	public static void initialize() {
		
		try {
			sessionFactory = new Configuration()
					.configure()
					.buildSessionFactory();
//			config.configure();
//			SessionFactory sessionFactory= config.buildSessionFactory();
//			Session session = sessionFactory.openSession();
			System.out.println("Session Factory Created...");
			
		}catch(Exception e) {
			System.err.println("Session Factory creation Failed...");
			e.printStackTrace();
		}
		
	}
	
	public static Session getSession() {
		if(sessionFactory == null) {
			System.err.println("Sessionfacgory not found... Please inialize..");
			return null;
		}
		return sessionFactory.openSession();
	}
	
}
