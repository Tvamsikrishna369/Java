package com.krishna.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import stdproj.Student;

public class Bufferwriter {
	
	List<Student> students = new ArrayList<>();
		students.add(new Student(1, "ravi", "123"));

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("Started Writing");
			FileWriter fileWriter = new FileWriter("output.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("rollNo, name, phoneNO");
			for(Student student : students) {
				writer.write(student.toString());
				writer.newLine();
			}
			
			
//			FileWriter fileWriter = new FileWriter("output.txt");
//			BufferedWriter writer = new BufferedWriter(fileWriter);
//			writer.write("1, krishna, 123");
//			writer.newLine();
//			writer.write("1,\" "krishna\", "\123");
//			writer.newLine();
//			writer.write("1, ravi, 123");
//			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("Started REader");
			FileReader fileReader = new FileReader("output.txt");
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			
			
			while((line=reader.readLine()) != null){
			
				Student student = new Student();
				String[] lines = line.split(",");
				System.out.println(lines[0] + "," + lines[1]);
				student.setRollNo(Integer.parseInt(lines[0]));
				student.setName(lines[1].replaceAll("\"", ""));
				student.setPhoneNo(lines[2].replaceAll("\"", ""));
				System.out.println();
				
				
			}
			reader.close();
			System.out.println("completed");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
