package com.tyss.beanobject.bean;

public class TestA {

	public static void main(String[] args) {
		Student s = new Student();
		s.setID(12);
		s.setName("Shivagami");
		s.setRollNo(134);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(12);
		e.setSalary(400000);
		e.setName("Bhakthi");
		e.setDept(01);
		e.setDesignation("Software Developer");
		
		db.save(e);
		
		
	}
}
