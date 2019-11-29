package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("Coco");
		ts.add("Pluto");
		ts.add("Pascal");
		ts.add("Pebble");
		ts.add("Sasha");
		
		System.out.println("********Using for each loop***************");

		for(String s : ts) {
			System.out.println(s);
		}

		System.out.println("********Using Iterator***************");

		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}

	
}
