package com.krishna.streams.stringlength;

import java.util.ArrayList;
import java.util.List;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> employee = new ArrayList<>();
			employee.add("vamsi");
			employee.add("Krishna");
			employee.add("Ramesh");
			employee.add("Rahul");

			
			employee.stream()
			.filter((employees -> employees.length()>5))
			.forEach(employees -> System.out.println(employees));

		
	}

}
