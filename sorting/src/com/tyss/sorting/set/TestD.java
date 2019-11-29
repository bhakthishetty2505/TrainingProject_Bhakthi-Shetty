package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		
		ls.add(420.9);
		ls.add(56.7);
		ls.add(45.0);
		ls.add(86.97);
		ls.add(null);
		
		System.out.println("********Using for each loop***************");

		for(Object s : ls) {
			System.out.println(s);
		}

		System.out.println("********Using Iterator***************");

		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
