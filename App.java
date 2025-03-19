package com.school.mgmt.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/***
 * Program that writes and reads from file.
 * 
 * The file will be available in the app path. i.e. right click on project
 * select Show In >> System Explorer option. There you can find the file.
 */
public class App {

	public static void main(String[] args) {
		
		final String STUDENT_FILE = "StudentData.txt";
		
		File file = new File(STUDENT_FILE);
		
//		BufferedWriter is used for writing the data to file.
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(STUDENT_FILE))) {
//          This line writes the data to file
			writer.write("Ravi,1,social");
            writer.newLine();
            writer.write("Krishna, 2, java");
//			This line adds new line in file.
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
        if (!file.exists()) 

        	System.out.println("File not found!");
        
//        BufferedReader is used for reading the data from file.
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
//          reader.readLine() is used to read a line from the file.
            while ((line = reader.readLine()) != null) {
            	System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
	}
}
