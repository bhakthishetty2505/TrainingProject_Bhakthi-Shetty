package com.tyss.typecasting.primitive;

public class TestA {

	public static void main(String[] args) {
		
		byte a = 10;
		int b = a;		//Implicit casting
		System.out.println("b is " +b);
		
		int p = 20;
		double q = p;
		System.out.println("q is " +q);
		
		System.out.println("===================");
		
		double x = 69.420;
		int y = (int) x;
		System.out.println("Value of y is " +y);
		byte z = (byte) x;
		System.out.println("Value of z is " +z);
		char r = (char) x;
		System.out.println("Value of r is " +r);
	}
}
