package com.tyss.exception.second;

public class TestA {
	public static void main(String[] args){
		
		System.out.println("Main Started");
		
		try {
		
		Thread.sleep(1000);
		System.out.println("Inside Try");
		
		}catch(InterruptedException ie) {
			System.out.println("Exeption caught");
			ie.printStackTrace();
		
		}
		
		System.out.println("Main Ended");
	}
}
