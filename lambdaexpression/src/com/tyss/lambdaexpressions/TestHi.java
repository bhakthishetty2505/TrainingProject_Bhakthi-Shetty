package com.tyss.lambdaexpressions;

public class TestHi {

	public static void main(String[] args) {
		HiInterface h= () -> 
		{
			return "Hi";
		};
		String s = h.sayHi();
		System.out.println("String is " +s);
	}
}
