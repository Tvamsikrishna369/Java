package com.krishna.jdk.connectors.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public student{
	private int roll_no;
	private String name;
	
	
}

public class testConnectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/mydb?user=root&password=Krishn@1";
		
		try {
			Connection connection = DriverManager.getConnection(url);
			Statement statement = connection.createStatement();
			System.out.println("Connected..");
			
			String query = "select * from mydb.new_table";
			
			ResultSet result = statement.executeQuery(query);
			System.out.println(result);
			
			while(result.next()) {
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.err.println("Not Connected..");
			e.printStackTrace();
			
		}
		
	}

}
