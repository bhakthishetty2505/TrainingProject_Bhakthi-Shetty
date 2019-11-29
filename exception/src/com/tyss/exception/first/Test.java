package com.tyss.exception.first;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main Started");

		Paytm p = new Paytm();
		try {
			p.book();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught in main");
		}
		finally {
			System.out.println("Executing Finally");
		}

		System.out.println("Main Ended");
	}
}
