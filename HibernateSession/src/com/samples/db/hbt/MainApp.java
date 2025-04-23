package com.samples.db.hbt;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.db.hbt.entity.Student;
import com.samples.db.hbt.util.HibernateUtils;

public class MainApp {

	public static void main(String[] args) {
		
		
		try {
			HibernateUtils.initialize();
			Session session = HibernateUtils.getSession();
			System.out.println("Connected...");
			Transaction tnx = session.beginTransaction();			
			Student student = new Student(1,"Krishna",30);
			session.persist(student);
			tnx.commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
