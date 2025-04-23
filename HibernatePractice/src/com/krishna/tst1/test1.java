package com.krishna.tst1;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test1 {

	public static void main(String[] args) {
		
		try {
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			
			SessionFactory session = config.buildSessionFactory();
			Session openSession = session.openSession();
			boolean open = openSession.isOpen();
			System.out.println(open);
//			openSession.persist(args);
			
			System.out.println("Connected..");
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Connected..");
			e.printStackTrace();
		}
	}

}
