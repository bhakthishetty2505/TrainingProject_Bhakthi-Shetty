package com.tyss.objectclass;

public class TestE {

	public static void main(String[] args) {

		Car c1 = new Car(550000, "Mustang", "Black");
		int h = c1.hashCode();
		System.out.println(" " +h);

		String s = c1.toString();
		System.out.println(" " +s);
	}

}
