package com.org.test;

import com.org.bean.Student;

public class Test {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setGender("male");
		s.setStudentId(101);
		s.setPhone(256858985);
		
		System.out.println(s);
	}
}
