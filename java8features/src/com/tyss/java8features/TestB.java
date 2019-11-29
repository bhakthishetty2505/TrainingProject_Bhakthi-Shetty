package com.tyss.java8features;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		
		Predicate<Student> p = (s) -> {
			if(s.percentage >= 35) {
				return true;
			}
			return false;
		};
		
		Student s = new Student(1, "Coco", 35.0);
		boolean b = p.test(s);
		System.out.println("Passed or no : " +b);
		
	}
}
