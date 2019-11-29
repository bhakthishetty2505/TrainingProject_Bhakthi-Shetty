package com.tyss.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		
		Student s1 = new Student(2, "Coco", 67.8);
		Student s2 = new Student(5, "Pluto", 75.8);
		Student s3 = new Student(34, "Pebble", 42.0);
		Student s4 = new Student(4, "Bruno", 98.9);
		Student s5 = new Student(4, "Humphrey", 76.0);
		Student s6 = new Student(4, "Naomi", 45.8);
		Student s7 = new Student(4, "Roxy", 55.3);
		Student s8 = new Student(4, "Brad", 43.8);
		Student s9 = new Student(4, "Alex", 76.5);		
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third", al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Name is " +s.name);
			System.out.println("ID is " +s.id);
			System.out.println("Percentage is " +s.percentage);
		}
	}
}
