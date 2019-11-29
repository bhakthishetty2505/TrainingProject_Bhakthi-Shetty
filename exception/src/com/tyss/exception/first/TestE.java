package com.tyss.exception.first;

public class TestE {

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
		catch(NullPointerException npe) {
			System.out.println("Null Value cannot be parsed");
		}
		catch(ArrayIndexOutOfBoundsException aio)	{
			System.out.println("Index is out of bound");
		}
		catch(ArithmeticException ae){
			System.out.println("Number divided by 0");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main Ended");
	}
}
