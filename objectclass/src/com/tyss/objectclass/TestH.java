package com.tyss.objectclass;

public class TestH {

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p1 = new Person(12, "Ravi");

		System.out.println(" ID is of p1 " +p1.id);
		System.out.println(" Name is of p1 " +p1.name);

		Object o = p1.clone();

		Person p2 = (Person) o;
		
		System.out.println(" ID of p2 is " +p2.id);
		System.out.println(" Name of p2 is " +p2.name);
		
		p2.id = 200;
		p2.name = "Surya";
		
		System.out.println("------------After Cloning------------");
		
		System.out.println(" ID is of p1 " +p1.id);
		System.out.println(" Name is of p1 " +p1.name);
		System.out.println(" ID of p2 is " +p2.id);
		System.out.println(" Name of p2 is " +p2.name);

	}
	
}
