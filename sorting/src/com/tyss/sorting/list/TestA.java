package com.tyss.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12, "Coco", 50.9);
		Student s2 = new Student(2, "sasha", 80);
		Student s3 = new Student(23, "Pebble", 80.7);
		Student s4 = new Student(40, "pluto", 70.5);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		System.out.println("Before Sorting----------");
		displayStudentDetails(al);
		Collections.sort(al);
		System.out.println("After Sorting-----------");
		displayStudentDetails(al);
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			
			Student s = it.next();
			System.out.println("ID is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
			System.out.println("============");
		
		}
	}
}
