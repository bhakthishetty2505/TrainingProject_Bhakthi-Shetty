package com.tyss.objectclass;

public class TestF {

	public static void main(String[] args) {

		Cow c = new Cow(1, "Ganga", 10000);
		Cow c1 = new Cow(2, "Gowri", 20000);
		Cow c2 = new Cow(1, "Ganga", 10000);

		boolean isEqual = c.equals(c2);
		System.out.println("isEqual " +isEqual);

		System.out.println("isEqual " +c1.equals(c2));
	}
}
