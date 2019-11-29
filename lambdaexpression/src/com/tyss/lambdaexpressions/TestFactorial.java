package com.tyss.lambdaexpressions;

public class TestFactorial {

	public static void main(String[] args) {
		FactorialInterface fi = (n) -> {
			
			int fact = 1;
			for(int i = 2; i <= n; i++) {
				fact = fact * i;
			}
			return fact;
		};
		
		int factTotal = fi.factorial(5);
		System.out.println("Factorial is " +factTotal);
	}
}
