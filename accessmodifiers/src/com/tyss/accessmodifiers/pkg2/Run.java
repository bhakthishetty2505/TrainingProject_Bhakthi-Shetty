package com.tyss.accessmodifiers.pkg2;

public class Run {

	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.a);         Can't access private members outside the class 
//		d.add();
		
		System.out.println(d.b); 	// default variables methods can be accessed outside the class
		d.sub();
		
		System.out.println(d.c);	//  Protected members
		d.mul();
		
		System.out.println(d.name);	//  Public members
		d.div();
	}
}
