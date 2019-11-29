package com.tyss.thread.pausing;

public class Slider {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Sliding");
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
}
