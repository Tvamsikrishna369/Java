package com.management;

import java.util.Scanner;

//import stdproj.Student;

public class Appmanagement {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int rollNo = sc.nextInt();
		sc.next();
		String name = sc.nextLine();
		sc.reset();
//		String phone = sc.nextLine();
		String phone = sc.nextLine();
//		sc.reset();
		System.out.println(rollNo + name + phone);
		
//		Student students = new Student(rollNo, name, phone);
		
//		List<Student> students = new ArrayLIst<>(); // for get data from user
		
//		students.add(new Student());  //for predefined value
		

			

		
	}

}
