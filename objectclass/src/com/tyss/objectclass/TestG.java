package com.tyss.objectclass;

public class TestG {

	public static void main(String[] args) {

		Employee e = new Employee(1, "Bhakthi", 10000);
		Employee e1 = new Employee(2, "Shetty", 20000);
		Employee e2 = new Employee(1, "Bhakthi", 10000);
		Employee e3 = e1; 
		

		boolean isEqual = e.equals(e2);
		System.out.println("isEqual " +isEqual);

		System.out.println("isEqual " +e1.equals(e2));
		System.out.println("isEqual " +e3.equals(e1));
		
		
		String s = e1.toString();
		System.out.println(" " +s);
		
		String s1 = e2.toString();
		System.out.println(" " +s1);
		
		
	}
}
