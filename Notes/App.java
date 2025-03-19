package com.management;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.management.student.Student;

public class App {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "ravi", "male", "234"));
		students.add(new Student(2, "jaya", "female", "1234"));
		students.add(new Student(3, "kumar", "male", "2345"));
		students.add(new Student(4, "raju", "male", "23467"));
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
			System.out.println("Started writing");
			writer.write("rollNo,name,gender,phone");
			writer.newLine();
			for(Student student : students) {
				writer.write(student.toString());
				writer.newLine();
			}
//			writer.write("1, \"ravi\", \"male\", \"234\"");
//			writer.newLine();
//			writer.write("2, \"jaya\", \"female\", \"1234\"");
//			writer.newLine();
//			writer.write("3, \"kumar\", \"male\", \"2345\"");
//			writer.newLine();
			System.out.println("Completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
			System.out.println("Started Reader");
			String line=null;
			boolean flgRead = false;
			int ctr = 0;
			while((line=reader.readLine()) != null) {
				if(flgRead == true) {

					line = line.replaceAll("\"", "");
					String[] lines = line.split(",");
//					System.out.println(lines[0] + "," + lines[1]);
					Student student = new Student();
					student.setRollNo(Integer.parseInt(lines[0]));
					student.setName(lines[1]);
					student.setGender(lines[2]);
					student.setPhone(lines[3]);
					System.out.println(student);
				} else {
					flgRead = true;
				}
//				if(ctr==1 || ctr==3)
//					System.out.println(line);
//				ctr++;
			}
			reader.close();
			System.out.println("Completed");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		for(int i=0;i<2; i++) {
//			students.add(addStudent());
//		}
//
//		for(Student student : students) {
//			System.out.println(student);
//		}
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
//		LocalDate date = LocalDate.of(2024, 1, 3);
//		String formattedDate = date.format(dtf);
//		System.out.println(formattedDate);
//		YearMonth yearMonth = YearMonth.of(2025, 3);
//		LocalDate atDay = yearMonth.atDay(1);
//		int lengthOfMonth = yearMonth.lengthOfMonth();
//		System.out.println(yearMonth);
//		System.out.println(atDay);
//		System.out.println(lengthOfMonth);
//		System.out.println(LocalDate.now());
	}
	
//	private static Student addStudent() {
//		int rollNo = 0;
//		String name = null;
//		String phone = null;
//		try {
//			rollNo = sc.nextInt();
//			sc.next();
//			name = sc.nextLine();
//			sc.reset();
//			phone = sc.nextLine();
//			sc.reset();
//			} catch (Exception e) {
//			System.err.println("Exception" + e);
//		}		
//		return new Student(rollNo, name, phone);
//	}

}
