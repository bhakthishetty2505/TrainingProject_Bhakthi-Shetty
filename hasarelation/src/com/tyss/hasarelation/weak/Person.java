package com.tyss.hasarelation.weak;

public class Person {

	String name;
	Marker m = new Marker();

	void sleep() {
		System.out.println("sleep() of Person");
	}

	void eat() {
		System.out.println("eat() of Person");
	}
}
