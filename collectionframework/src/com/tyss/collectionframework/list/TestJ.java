package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(10, "Bhakthi", 42.0);
		Student s2 = new Student(20, "Shetty", 78.0);
		Student s3 = new Student(30, "Asha", 67.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("ID is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
		}
		
		System.out.println("=====for each=====");
		
		for (Student student : al) {
			System.out.println(student);
		}
	}
}
