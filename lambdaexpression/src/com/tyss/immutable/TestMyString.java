package com.tyss.immutable;


public class TestMyString {

	public static void main(String[] args) {
		
		MyString m1 = new MyString(10, "Bhakthi");
		System.out.println("RollNo is " +m1.getRollNo());
		System.out.println("Name is " +m1.getName());
		System.out.println(m1);
		
		MyString m2 = m1.changeContent(20, "Shetty");
		System.out.println("RollNo is " +m1.getRollNo());
		System.out.println("Name is " +m1.getName());
		
		System.out.println("============");
		System.out.println("RollNo is " +m2.getRollNo());
		System.out.println("Name is " +m2.getName());
	}
}
