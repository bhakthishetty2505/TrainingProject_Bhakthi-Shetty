package com.tyss.arrays;

public class TestC {

	public static void main(String[] args) {

		Student s1 = new Student(1,"Arya", 78.99);
		Student s2 = new Student(2,"Nithin", 67.88);
		Student s3 = new Student(3,"Chinku", 45.66);

		Student[] students = new Student[3];

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

		for(Student s : students) {
			System.out.println(s);
		}
		recieve(students);

	}
	
	static void recieve(Student[] stu) {
		for(Student s : stu) {
			System.out.println(s);
		}
	}
}
