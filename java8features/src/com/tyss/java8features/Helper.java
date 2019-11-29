package com.tyss.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	Comparator<Student> comp = (s1, s2) -> {
		if(s1.percentage > s2.percentage) {
			return 1;
		}else if(s1.percentage < s2.percentage) {
			return -1;
		}
		return 0;
	};

	void displayAllStudent(ArrayList<Student> al) {

		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("ID is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
		}
	}

	void displayFailedStudents(ArrayList<Student> al) {

		List<Student> l = al.stream().filter(student -> student.percentage < 40).collect( Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Failed Students are " +s.percentage);
		}
	}

	void displayPassedStudents(ArrayList<Student> al) {

		List<Student> l = al.stream().filter(student -> student.percentage > 40).collect( Collectors.toList());

		Iterator<Student> it = l.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Passed Students are " +s.percentage);
		}
	}
	void displayTopperOfClass(ArrayList<Student> al) {
		Comparator<Student> comp = (s1, s2) -> {
			if(s1.percentage > s2.percentage) {
				return 1;
			}else if(s1.percentage < s2.percentage) {
				return -1;
			}
			return 0;
		};

		Student s = al.stream().max(comp).get();
		System.out.println("Name is " +s.name);
		System.out.println("ID is " +s.id);
		System.out.println("Percentage is " +s.percentage);
	}
}
