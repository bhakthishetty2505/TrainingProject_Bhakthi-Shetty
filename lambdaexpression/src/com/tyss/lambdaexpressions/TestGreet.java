package com.tyss.lambdaexpressions;

public class TestGreet {

	public static void main(String[] args) {
		GreetInterface greet1 = (message) -> {
			System.out.println("Hello");
			return message;
		};
		String s = greet1.greet("Hi");
		
		
		System.out.println("Message is " +s );
	}
}
