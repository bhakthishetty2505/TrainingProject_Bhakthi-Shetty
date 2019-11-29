package com.tyss.exception.first;

public class TestB {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int b = 0;
		try {
			b = 10/2;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Happy Haloween");
		}catch(ArithmeticException ae) {
			System.out.println("Number divided by 0");
		}

		System.out.println("Main Ended");
	}
}
