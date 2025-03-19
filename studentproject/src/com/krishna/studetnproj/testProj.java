package com.krishna.studetnproj;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    String address;
    String phoneNumber;
    int rollNo;
    String className;
    int tests;
    ArrayList<String> subjects = new ArrayList<>();
    ArrayList<Integer> marks = new ArrayList<>();
    int attendance;

    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Class: " + className);
        System.out.println("Tests: " + tests);
        System.out.println("Subjects and Marks: ");
        for (int i = 0; i < subjects.size(); i++) {
            System.out.println("Subject: " + subjects.get(i) + ", Marks: " + marks.get(i));
        }
        System.out.println("Attendance: " + attendance);
    }
}

public class testProj {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100]; // Assuming we can store details of up to 100 students
        int studentCount = 0;

        while (true) {
            System.out.println("\n1. Enter student details");
            System.out.println("2. Search and display student details");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();  // Consume newline

            if (option == 1) {
                Student student = new Student();

                System.out.print("Enter student's name: ");
                student.name = sc.nextLine();

                System.out.print("Enter student's address: ");
                student.address = sc.nextLine();

                System.out.print("Enter student's phone number: ");
                student.phoneNumber = sc.nextLine();

                System.out.print("Enter student's roll number: ");
                student.rollNo = sc.nextInt();

                sc.nextLine();  // Consume newline

                System.out.print("Enter student's class: ");
                student.className = sc.nextLine();

                System.out.print("Enter number of tests: ");
                student.tests = sc.nextInt();

                sc.nextLine();  // Consume newline

                for (int i = 0; i < student.tests; i++) {
                    System.out.print("Enter subject name for test " + (i + 1) + ": ");
                    student.subjects.add(sc.nextLine());

                    System.out.print("Enter marks for " + student.subjects.get(i) + ": ");
                    student.marks.add(sc.nextInt());

                    sc.nextLine();  // Consume newline
                }

                System.out.print("Enter student's attendance: ");
                student.attendance = sc.nextInt();

                students[studentCount] = student;
                studentCount++;

            } else if (option == 2) {
                System.out.print("Enter roll number to search: ");
                int rollNo = sc.nextInt();

                boolean found = false;
                for (int i = 0; i < studentCount; i++) {
                    if (students[i].rollNo == rollNo) {
                        students[i].displayDetails();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student with roll number " + rollNo + " not found.");
                }
            } else if (option == 3) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }
}