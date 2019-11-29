package com.tyss.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestI {

	public static void main(String[] args) {
		
		Stack li = new Stack();
		li.add(12);
		li.add(42.0);
		li.add("PIZZA");
		li.add(true);
		
		System.out.println("====Using for Loop====");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("====Using foreach loop====");
		for (Object object : li) {
			System.out.println(object);
		}
		
		System.out.println("====Using Iterator====");
		Iterator it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("====Using List Iterator====");
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("====Using List Iterator Backwards====");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}

	}
}
