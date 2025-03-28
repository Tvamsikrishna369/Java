package com.krishna.jdk.connectors;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.exceptions.ConnectionIsClosedException;

public class ConnectorsDemo {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306";
		
		String userName = "root";
		String password = "Krishn@1";
		
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("Connected...");
			
//			Statement sqlStatement = connection.createStatement();
//			String sqlQuery= "selcet * from student";
//			ResultSet result = sqlStatement.execute(sqlQuery);
			
			
		} catch (SQLException e) {
			System.err.println("Exception Occurred");
			e.printStackTrace();
		}
		
		
	}

}
