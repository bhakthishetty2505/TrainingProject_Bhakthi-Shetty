package com.tyss.java8features;

import java.util.ArrayList;

public class TestG {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Helper h = new Helper();
		
		al.add(new Student(5, "Vikram", 56.7));
		al.add(new Student(3, "Vijay", 37.8));
		al.add(new Student(6, "Yash", 35.7));
		al.add(new Student(2, "Akshay", 65.8));
		al.add(new Student(1, "Aishu", 90.99));
		
		//h.displayAllStudent(al);
		//h.displayFailedStudents(al);
		//h.displayPassedStudents(al);
		h.displayTopperOfClass(al);
	}
}
