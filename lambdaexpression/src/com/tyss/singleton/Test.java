package com.tyss.singleton;

public class Test {

	public static void main(String[] args) {
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "Hello";
		
		System.out.println("HashCode of ms is " +ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "Hi";
		
		System.out.println("HashCode of mx is " +mx.hashCode());
		
		boolean HashCode = ms.equals(mx);
		System.out.println("Is HashCode equal " +HashCode);
		
		System.out.println(ms.s);
		System.out.println(mx.s);
		
	}
}

