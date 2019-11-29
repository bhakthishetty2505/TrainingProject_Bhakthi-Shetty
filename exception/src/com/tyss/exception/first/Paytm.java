package com.tyss.exception.first;

public class Paytm {

	public void book() {
		System.out.println("Paytm Started");

		IRCTC i = new IRCTC();
		//		try {
		i.confirm();
		//		} 
		//		catch(ArithmeticException ae) {
		//			System.out.println("Exception caught in Paytm");
		//		}


		System.out.println("Paytm Ended");
	}
}
