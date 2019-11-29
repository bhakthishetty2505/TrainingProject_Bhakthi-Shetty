package com.tyss.accessmodifiers.pkg1;

import com.tyss.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {

	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.a);         Can't access private members outside the class 
//		d.add();
		
		Sample s = new Sample();
		
		/*
		 * System.out.println(d.b); // default variables methods can be accessed outside
		 * the class d.sub();
		 */
		
		System.out.println(s.c);	//  Protected members
		s.mul();
		
		System.out.println(d.name);	//  Public members
		d.div();
	}
}
