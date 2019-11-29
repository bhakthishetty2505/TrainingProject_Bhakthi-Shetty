package com.tyss.collectionframework.list;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Shetty");
		Object o = al.get(0);
		System.out.println(o);
		
		String name = (String) o;
		 System.out.println(name.toUpperCase());	
	}
}
