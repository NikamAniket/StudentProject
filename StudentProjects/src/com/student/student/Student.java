package com.student.student;

public class Student {
	int roll_no;
	String name;
	double marks;

	public Student(int roll_no, String name, double marks) {
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;

	}

	public void displyStudentInformation() {
		System.out.println("Student Roll Number is : " + roll_no);
		System.out.println("Student Roll Number is : " + name);
		System.out.println("Student Roll Number is : " + marks);
		System.out.println("__________________________________");
	}

}
