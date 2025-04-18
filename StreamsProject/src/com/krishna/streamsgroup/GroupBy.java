package com.krishna.streamsgroup;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


class Student{
	private int rollNo;
	private String name;
	private int age;
	private String branch;
	public Student(int rollNo, String name, int age, String branch) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.branch = branch;
	}

	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", branch=" + branch + "]";
	}	
}


public class GroupBy {

	public static void main(String[] args) {
		
//		Using by class
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "Krishna", 30, "EEE"));
		students.add(new Student(2, "Kiran", 25, "ECE"));
		students.add(new Student(3, "Arun", 24, "Mech"));
		students.add(new Student(4, "Vamsi", 28, "ECE"));
		students.add(new Student(5, "Usha", 31, "ECE"));
		students.add(new Student(6, "Kranthi", 21, "ECE"));
		students.add(new Student(7, "Vamsi", 23, "ECE"));

		
		Map<Integer, List<Student>> groupByAge = students.stream()
				.collect(Collectors.groupingBy(student -> (student.getAge()%10)));
		
		System.out.println(groupByAge);
		
		Map<Integer, List<Student>> groupByRollNO = students.stream()
				.collect(Collectors.groupingBy(student -> (student.getRollNo())));
		
		System.out.println("Group By Roll No: " + groupByRollNO);
		
//---------------------------------------------------------------------------------------------		
		
		List<Integer> numbers = Arrays.asList(-1, -45, -250,0, 1,2,3,4,5,6,7,8,9,10);
		
		Map<Object, List<Integer>> numberByEvenOdd = numbers.stream()
				.collect(Collectors.groupingBy(n -> n%2 == 0 ? "Even" : "Odd"));
		
		System.out.println("Grouping number by even/Odd : " + numberByEvenOdd);
		
			
//		Map<Object, List<Integer>> numberByPveNve= numbers.stream() // object is given by system before completing the operation/function
		Map<String, List<Integer>> numberByPveNve = numbers.stream()
				.collect(Collectors.groupingBy(n -> n < 0 ? "Negetive" : n > 0 ? "Possitve":"Zero"));
		
		System.out.println(numberByPveNve);
		
		
		List<String> listName = Arrays.asList("ravi", "Aruna", "Vamsi", "Krishna", "Kiran", "Arun");
		
		Map<Character, List<String>> fLetter = listName.stream()
				.collect(Collectors.groupingBy(name -> name.charAt(0)));
		
		System.out.println(fLetter);
		
		
		List<String> listNameNo = Arrays.asList("ravi", "Aruna", "Vamsi", "Krishna", "Kiran", "Arun");
		
		Map<Object, Long> fLetterNo = listNameNo.stream()
				.collect(Collectors.groupingBy(count -> count.charAt(0),Collectors.counting()));
		
		System.out.println(fLetterNo);
		
//---------------------------------------------------------------------------------------------				
	}
}
