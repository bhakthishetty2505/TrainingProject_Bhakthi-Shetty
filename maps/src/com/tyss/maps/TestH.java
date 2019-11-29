package com.tyss.maps;

import java.util.Hashtable;

public class TestH {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(101, "Ajay");
		ht.put(102, "Vijay");
		ht.put(100, "Sonu");
		ht.put(99, "Monu");
		ht.put(101, "Shriram");
//		ht.put(null, "John"); //no null allowed for keys, throws NullPointerException
//		ht.put(101, null); //no null allowed for values, throws NullPointerException
		
		System.out.println("Data is " +ht);
	}
}