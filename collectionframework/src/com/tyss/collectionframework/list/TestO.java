package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestO {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Coco");
		al.add("Pluto");
		al.add("Sasha");
		al.add("Pebble");
		
		System.out.println("Before Sorting " +al);
		Collections.sort(al);
		System.out.println("After Sorting " +al);
	}
	
	
}
