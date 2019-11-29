package com.tyss.immutable;

public class MyString {

	private int rollno;
	private String name;
	
	public MyString(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	public int getRollNo() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public MyString changeContent(int rollno, String name) {
		MyString m = new MyString(rollno, name);
		return m;
	}
	
}
