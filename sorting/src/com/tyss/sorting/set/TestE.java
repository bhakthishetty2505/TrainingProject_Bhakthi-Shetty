package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(420);
		ts.add(56);
		ts.add(45);
		ts.add(86);
		
		System.out.println("********Using for each loop***************");

		for(Object s : ts) {
			System.out.println(s);
		}

		System.out.println("********Using Iterator***************");

		Iterator<Integer> it = ts.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
