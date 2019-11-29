package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add(420.9);
		ls.add("Pebble");
		ls.add(34);
		ls.add(34);
		ls.add("Pluto");
		ls.add(null);
		ls.add(null);
		
		System.out.println("********Using for each loop***************");

		for(Object s : ls) {
			System.out.println(s);
		}

		System.out.println("********Using Iterator***************");

		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
