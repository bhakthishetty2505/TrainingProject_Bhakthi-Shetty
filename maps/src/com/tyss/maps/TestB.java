package com.tyss.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Coco", 989525890);
		hm.put("Pebble", 845125842);
		hm.put("Sasha", 745568751);
		
		
		HashMap<String, Integer> hm1 = new HashMap<>();
		hm1.put("Roxy", 478963212);
		hm1.put("Naomi", 654789632);
		hm1.put("Riya", 987456321);
		
		boolean hasKey = hm.containsKey("Coco");
		System.out.println("Present? " +hasKey);
		
		boolean hasValue = hm.containsValue(987456321);
		System.out.println("Present? " +hasValue);
		
		hm.putAll(hm1);
		System.out.println("After putAll() " +hm);
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Is map empty? " +isEmpty);
		
		hm.clear();
		System.out.println("After clearing " +hm);
	}
}
