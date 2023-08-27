package com.student.client;
import com.student.makestudent.MakeStudent;
import com.student.student.Student;
public class Client {

	public static void main(String[] args) {
		Student st1=MakeStudent.student1();
		Student st2=MakeStudent.student2();
		st1.displyStudentInformation();
		st2.displyStudentInformation();
	}

}
