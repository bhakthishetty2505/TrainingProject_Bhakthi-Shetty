package com.tyss.exception.first;

public class IRCTC {

	public void confirm() {
		System.out.println("IRCTC Started");
		//		try {
		System.out.println(10/0);
		System.out.println("Confirmed");
		//		}
		//		catch(ArithmeticException ae) {
		//			System.out.println("Exception caught in IRCTC");
		//			throw ae;
		//		}


		System.out.println("IRCTC Ended");
	}
}
