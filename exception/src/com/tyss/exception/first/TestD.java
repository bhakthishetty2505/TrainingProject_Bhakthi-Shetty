package com.tyss.exception.first;

public class TestD {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int a[] = {10,20,30};
		int b = 10;
		try {
			System.out.println(b/2);
		}

		catch(ArithmeticException ae) {
			System.out.println("Number divided by 0");
		}
		try {
			System.out.println(a[4]);
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Index is out of bound");
		}

		System.out.println("Main Ended");
	}

}

