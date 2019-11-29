 package com.tyss.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("Coco", 989525890);
		hm.put("Pebble", 845125842);
		hm.put("Sasha", 745568751);
		hm.put("Bruno", 987542120);
		hm.put(null, 547896241);
		hm.put(null, 214789632);
		
		System.out.println("Data " +hm);
		
		hm.put("Coco", 975123659);
		System.out.println("After Modifying " +hm);
		
		hm.put("Pluto", 975123659);
		System.out.println("After Modifying " +hm);
		
		Object phoneno = hm.get("Coco");
		System.out.println("Value " +phoneno);
		
		Object phoneno1 = hm.get("Humphrey");
		System.out.println("Value " +phoneno1);
		
		Object value = hm.remove("Pebble");
		System.out.println("Removed Value is " +value);
		
		System.out.println("After Removing " +hm);
	}
}
