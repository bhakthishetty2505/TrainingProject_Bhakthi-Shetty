package com.tyss.beanobject.bean;

public class Database {

	void receive(Student s) {
		System.out.println("ID is " +s.getID());
		System.out.println("Name is " +s.getName());
		System.out.println("Roll No is " +s.getRollNo());
		System.out.println("==========================");
	}
	
	void save (Employee e) {
		System.out.println("ID is " +e.getId());
		System.out.println("Salary is " +e.getSalary());
		System.out.println("Name is "+e.getName());
		System.out.println("Department is " +e.getDept());
		System.out.println("Designation is " +e.getDesignation());
	}
}
