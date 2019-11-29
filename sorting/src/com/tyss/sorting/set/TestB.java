package com.tyss.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Coco");
		hs.add("Pebble");
		hs.add("Sasha");
		hs.add("Pluto");
		hs.add("Humphrey");
		System.out.println("********Using for each loop***************");

		for(String s : hs) {
			System.out.println(s);
		}

		System.out.println("********Using Iterator***************");

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}

	}
}
