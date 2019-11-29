package com.tyss.exception.first;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main Started");

		int[] a = {10,20,30};

		System.out.println(a[1]);
		try {
			System.out.println(a[2]);
		}catch(ArrayIndexOutOfBoundsException ae)	{
			System.out.println("Index is not present");

		}

		System.out.println("Main Ended");
	}
}
