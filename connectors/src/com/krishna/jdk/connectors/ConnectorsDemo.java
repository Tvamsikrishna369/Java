//package com.krishna.jdk.connectors;
//
//import java.beans.Statement;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.mysql.cj.exceptions.ConnectionIsClosedException;
//
//public class ConnectorsDemo {
//
//	public static void main(String[] args) {
//
//		String url = "jdbc:mysql://localhost:3306";
//		
//		String userName = "root";
//		String password = "Krishn@1";
//		
//		try {
//			Connection connection = DriverManager.getConnection(url, userName, password);
//			System.out.println("Connected...");
//			
////			Statement sqlStatement = connection.createStatement();
////			String sqlQuery= "selcet * from student";
////			ResultSet result = sqlStatement.execute(sqlQuery);
//			
//			
//		} catch (SQLException e) {
//			System.err.println("Exception Occurred");
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//}

//31-03-2025

package com.krishna.jdk.connectors;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

class Student{
	private int roll_no;
	private String name;
	private int age;
	private String email;
	
	public Student(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.email = email;
	}
	
	public int getRoll_no() {
		return roll_no;
	}


	public void setRollNo(int rollNo) {
		this.roll_no= rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + roll_no + ", name=" + name + ", age=" + age + ", Email=" + email + "]";
	}
	
	
	
}



public class ConnectorsDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=Krishn@1";
//		String url = "jdbc:mysql://localhost:3306/mydb";
//		String userName = "root";
//		String password = "Krishn@1";
		
		try {
//			Connection connection = DriverManager.getConnection(url, userName, password);
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connected...");
			
//			Statement sqlStatement = connection.createStatement();
			Statement sqlStatement= connection.createStatement();
			
//			String sqlQuery= "select * from sampletext";
			
			String sqlQuery= "select * from new_table";
//			ResultSet result = sqlStatement.executeQuery(sqlQuery);
			ResultSet result = sqlStatement.executeQuery(sqlQuery);
			System.out.println(result);
			while(result.next()){
				Student student = new Student(result.getInt("roll_no"),
						result.getString("name"));
//						result.getString("name"),);
				System.out.println(student);
			}
			
//			System.out.println(connection.getMetaData().getConnection());			
		} catch (SQLException e) {
			System.err.println("Exception Occurred");
			e.printStackTrace();
		}
		
		
	}

}
