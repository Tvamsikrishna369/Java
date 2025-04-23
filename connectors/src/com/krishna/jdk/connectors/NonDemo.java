package com.krishna.jdk.connectors;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class NonDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb";
	
		String userName = "root";
		String password = "Krishn@1";
	
		try (Connection dbconn = DriverManager.getConnection(url,userName, password)){
			System.out.println("Connected...");
//			Statement sqlStatement = dbconn.createStatement();
			java.sql.Statement sqlStatement = dbconn.createStatement();
			String sqlQuery = "select * from student";
//			PreparedStatement statement = dbconn.prepareStatement(sqlQuery);
			ResultSet result = sqlStatement.executeQuery(sqlQuery);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
