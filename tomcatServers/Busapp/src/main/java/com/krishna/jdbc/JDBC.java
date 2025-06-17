package com.krishna.jdbc;

import javax.naming.ConfigurationException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class JDBC {
	public static void main(String[] args) {

		try {
			Configuration config = new Configuration();
			
//			config.configure("../../../hibernate.cfg.xml");
			
//			config.configure("/Busapp/src/hibernate.cfg.xml");
			
			config.configure();
			
//			config.addAnnotatedClass(null)
			SessionFactory openSession = config.buildSessionFactory();
			
			Session session = openSession.openSession();
			
			
			System.out.println("Connected...");
			
		} catch (HibernateException e) {

			System.out.println("Not Connected...");
			e.printStackTrace();
		}
		
		
		
	}
}
