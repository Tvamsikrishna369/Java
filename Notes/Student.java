package com.management.student;

public class Student {
	private int rollNo;
	private String name;
	private String gender;
	private String phone;

	public Student() {
	}

	public Student(int rollNo, String name, String gender, String phone) {
		this.rollNo = rollNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return rollNo + ",\"" + name + "\",\"" + gender + "\",\"" + phone + "\"";
	}

}
