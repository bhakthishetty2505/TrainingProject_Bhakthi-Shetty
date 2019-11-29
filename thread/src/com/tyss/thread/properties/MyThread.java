package com.tyss.thread.properties;

public class MyThread extends Thread{

	public static void main(String[] args) {

		System.out.println("Main Started");

		String tname = Thread.currentThread().getName(); //gets the name of the current thread
		System.out.println("Current Thread name is " +tname);
		
		MyThread t = new MyThread();
		String name = t.getName();
		System.out.println("MyThread name is " +name);
		
		Thread.currentThread().setName("SuperiorThread");
		
		t.setName("Golu");
		System.out.println("MyThread name is " +t.getName());
		
		System.out.println(10 / 0);
		
		System.out.println("Main Ended");
	}
}
