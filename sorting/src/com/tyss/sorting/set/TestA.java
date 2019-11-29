package com.tyss.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		hs.add(12);
		hs.add(97);
		hs.add(97);
		hs.add("Bhakthi");
		hs.add(121.7);
		hs.add(null);
		hs.add(null);
		
		System.out.println("********Using for each loop***************");
		
		for(Object o : hs) {
			System.out.println(o);
		}
		
		System.out.println("********Using Iterator***************");
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next();
			System.out.println(s);
		}
	}
}
