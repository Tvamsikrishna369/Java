package com.krishna.streams.classDemo;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int salary;
	public Employee(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", Salary=" + salary + "";
	}
	
	
}



public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "krishna", 25000));
		employees.add(new Employee(2, "Vamsi", 20000));
		employees.add(new Employee(3, "Ram", 19000));
		
		
		
		employees.stream()
		.filter(employee -> employee.getName().length()>4)
		.forEach(employee -> System.out.println(employee));
		
		List<Integer> numbers = new ArrayList<>();
		for(int i=100; i>0; i--) {
			numbers.add(i);
			
			List<Integer> list = numbers.stream()
					.collect(Collectors.toList());
					System.out.println(list);
					
		}
		
		
		
//		System.out.println(employees + "\n");
//		employees.stream()
//		.forEach(employee -> System.out.println(employee.getName().length()));
	}

}
