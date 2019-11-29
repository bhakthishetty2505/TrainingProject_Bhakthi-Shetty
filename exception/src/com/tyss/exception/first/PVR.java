package com.tyss.exception.first;

public class PVR {

	public void book() {
		
		System.out.println("Booking started");
		try {
			
			System.out.println(10/0);
			System.out.println("Booking Logic");
			System.out.println("Booking Confirmed");
			
		}
		catch(ArithmeticException ae) {
			
			System.out.println("Booking Failed");
			throw ae;
			
		}
		
	}
}
