package com.sample.hbt.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyUtil {
	
	public static void initialize() {
		SessionFactory = new Configuration()
				.configure().
				buildSessionFactory();
	}

}
