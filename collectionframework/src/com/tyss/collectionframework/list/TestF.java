package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Bhakthi");
		al.add("Shetty");
		al.add("Asha");
		al.add("Sunitha");
		
		String name = al.get(1);
		System.out.println(name.toUpperCase());
		
		Iterator<String> li = al.iterator();
		
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		System.out.println("======Using List Iterator======");
		ListIterator<String> l = al.listIterator();
		while(l.hasNext()) {
			String s = l.next();
			System.out.println(s);
		}
		System.out.println("=====Using foreach=====");
		
		for(String n : al) {
			System.out.println(n);
		}
	}
}
