package stuproj;

import java.util.ArrayList;

class student1 {
	String name;
	int rollNo;
	String phoneNum;
	String studentClass;
	List<Test> tests;
	int attendance;
	
	public Student1(String name, int rollNo, String phoneNum, String studentClass, List<test> tests, int attendance) {
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNum = phoneNum;
		this.studentClass = studentClass;
		this.tests = tests;
		this.attendance = attendance;
		
	}
	
	public void displayDetails() {
		System.out.println("Student Details: ");
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Phone Num: " + phoneNum);
		System.out.println("Class: " + studentClass);
		System.out.println("Attendance: " + attendance + "%");
		System.out.println("Student Details: ");
		System.out.println("Tests: ");
		for (Test test : tests) {
			System.out.println("  Test Name: " + test.testName);
			for(Subject subject : test.subjects) {
				System.out.println("Subject: " + subject.subjectName + )
			}
		}
		
	}
}
public class StuProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		
		
	}

}
