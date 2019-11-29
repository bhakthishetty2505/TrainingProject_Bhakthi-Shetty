package com.tyss.lambdaexpressions;

public class TestMultiply {

	public static void main(String[] args) {
		
		MultiplyInterface mult = (a, b) -> a * b;
		int product = mult.multiply(20,12);
		System.out.println("Multiplied value is " +product);
	}
}
