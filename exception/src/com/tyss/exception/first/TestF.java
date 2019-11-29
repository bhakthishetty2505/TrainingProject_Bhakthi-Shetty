package com.tyss.exception.first;

public class TestF {

	public static void main(String[] args) {

		System.out.println("Main Started");

		String s = "Hello";		//null can't be converted to toUpperCase
		int[] a = {10,20,30};
		int b = 10;

		try {
			String s1 = s.toUpperCase();
			System.out.println(s1);
			System.out.println(a[4]);
			System.out.println(b/0);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main Ended");
	}
}
