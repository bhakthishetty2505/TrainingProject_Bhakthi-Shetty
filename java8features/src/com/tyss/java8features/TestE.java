package com.tyss.java8features;

import java.util.function.Supplier;

public class TestE {

	public static void main(String[] args) {
		
		Supplier<Student> s = () -> new Student(2, "Ajay", 65.8);
		
		Student s1 = s.get();
		System.out.println("ID is " +s1.id);
		System.out.println("Name is " +s1.name);
		System.out.println("Percentage is " +s1.percentage);
		
		Supplier<Integer> i = () -> 20;
		
		int val = i.get();
		System.out.println("Value " +val);
		
		Supplier<String> sp = () -> "Good Evening";
		String v = sp.get();
		System.out.println("Value " +v);
	}
}
