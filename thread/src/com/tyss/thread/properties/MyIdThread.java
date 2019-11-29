package com.tyss.thread.properties;

public class MyIdThread extends Thread {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread " +mi.getId());
		
		System.out.println("Priority " +Thread.currentThread().getPriority());
		
		//Thread.currentThread().setPriority(16); Throws IllegalArgumentException if the priority is set to less than 1 or greater than 10
		
		
		//mi.setId(); can't set the id, only can get the id of the thread
		
		System.out.println("Main Ended");
	}
}
