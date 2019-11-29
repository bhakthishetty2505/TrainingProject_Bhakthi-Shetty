package com.tyss.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestN {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(12);
		l.add(90);
		l.add(7);
		l.add(2);
		l.add(20);
		
		System.out.println("Before sorting " +l);
		Collections.sort(l);			// return type of this method is void, doesnt return anything
		System.out.println("After sorting " +l);
		
		Collections.reverse(l);			// return type is void.
		System.out.println("After reversing " +l);
		
		Collections.shuffle(l);
		System.out.println("After shuffling " +l);
	}
}
