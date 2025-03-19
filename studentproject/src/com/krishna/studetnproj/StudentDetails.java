package com.krishna.studetnproj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class Student {
//    String name;
//    int rollNo;
//    String phoneNum;
//    String studentClass;
//    List<Test> tests;
//
//    public Student(String name, int rollNo, String phoneNum, String studentClass, List<Test> tests) {
//        this.name = name;
//        this.rollNo = rollNo;
//        this.phoneNum = phoneNum;
//        this.studentClass = studentClass;
//        this.tests = tests;
//    }
//
//    public void displayDetails() {
//        System.out.println("Student Details:");
//        System.out.println("Name: " + name);
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Phone Num: " + phoneNum);
//        System.out.println("Class: " + studentClass);
//        System.out.println("Tests:");
//        for (Test test : tests) {
//            System.out.println("  Test Name: " + test.testName);
//            for (Subject subject : test.subjects) {
//                System.out.println("    Subject: " + subject.subjectName + ", Marks: " + subject.marks);
//            }
//        }
//    }
//}
//
//class Test {
//    String testName;
//    List<Subject> subjects;
//
//    public Test(String testName, List<Subject> subjects) {
//        this.testName = testName;
//        this.subjects = subjects;
//    }
//}
//
//class Subject {
//    String subjectName;
//    int marks;
//
//    public Subject(String subjectName, int marks) {
//        this.subjectName = subjectName;
//        this.marks = marks;
//    }
//}


class Student {
    String name;
    int rollNo;
    String phoneNum;
    String studentClass;
    List<Test> tests;
    int attendance;

    public Student(String name, int rollNo, String phoneNum, String studentClass, List<Test> tests, int attendance) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNum = phoneNum;
        this.studentClass = studentClass;
        this.tests = tests;
        this.attendance = attendance;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Phone Num: " + phoneNum);
        System.out.println("Class: " + studentClass);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Tests:");
        for (Test test : tests) {
            System.out.println("  Test Name: " + test.testName);
            for (Subject subject : test.subjects) {
                System.out.println("    Subject: " + subject.subjectName + ", Marks: " + subject.marks);
            }
        }
    }
}

class Test {
    String testName;
    List<Subject> subjects;

    public Test(String testName, List<Subject> subjects) {
        this.testName = testName;
        this.subjects = subjects;
    }
}

class Subject {
    String subjectName;
    int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }
}

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter student name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter roll no: ");
//        int rollNo = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//
//        System.out.print("Enter phone number: ");
//        String phoneNum = scanner.nextLine();
//
//        System.out.print("Enter class: ");
//        String studentClass = scanner.nextLine();
//
//        List<Test> tests = new ArrayList<>();
//        System.out.print("Enter number of tests: ");
//        int numTests = scanner.nextInt();
//        scanner.nextLine();  // Consume newline
//
//        for (int i = 0; i < numTests; i++) {
//            System.out.print("Enter test name: ");
//            String testName = scanner.nextLine();
//            List<Subject> subjects = new ArrayList<>();
//
//            System.out.print("Enter number of subjects for " + testName + ": ");
//            int numSubjects = scanner.nextInt();
//            scanner.nextLine();  // Consume newline
//
//            for (int j = 0; j < numSubjects; j++) {
//                System.out.print("Enter subject name: ");
//                String subjectName = scanner.nextLine();
//
//                System.out.print("Enter marks for " + subjectName + ": ");
//                int marks = scanner.nextInt();
//                scanner.nextLine();  // Consume newline
//
//                subjects.add(new Subject(subjectName, marks));
//            }
//
//            tests.add(new Test(testName, subjects));
//        }
//
//        Student student = new Student(name, rollNo, phoneNum, studentClass, tests);
//        student.displayDetails();
//
//        scanner.close();

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll no: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter phone number: ");
        String phoneNum = scanner.nextLine();

        System.out.print("Enter class: ");
        String studentClass = scanner.nextLine();

        System.out.print("Enter attendance percentage: ");
        int attendance = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        List<Test> tests = new ArrayList<>();
        System.out.print("Enter number of tests: ");
        int numTests = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numTests; i++) {
            System.out.print("Enter test name: ");
            String testName = scanner.nextLine();
            List<Subject> subjects = new ArrayList<>();

            System.out.print("Enter number of subjects for " + testName + ": ");
            int numSubjects = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter subject name: ");
                String subjectName = scanner.nextLine();

                System.out.print("Enter marks for " + subjectName + ": ");
                int marks = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                subjects.add(new Subject(subjectName, marks));
            }

            tests.add(new Test(testName, subjects));
        }
	
	}

}
