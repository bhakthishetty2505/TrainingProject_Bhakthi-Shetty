package com.tyss.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {

	public static void main(String[] args) {
		
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop l1 = new Laptop(25000, 4, "HP");
		Laptop l2 = new Laptop(35000, 6, "Dell");
		Laptop l3 = new Laptop(40000, 12, "Mac");
		Laptop l4 = new Laptop(50000, 8, "Asus");
		
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(new Laptop(20000, 2, "Acer"));
		
		System.out.println("Before Sorting----------");
		displayLaptopDetails(ll);
		Collections.sort(ll);
		System.out.println("After Sorting-----------");
		displayLaptopDetails(ll);
		
	}
	
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop lp =it.next();
			
			System.out.println("Brand name is " +lp.name);
			System.out.println("Storage is " +lp.ram);
			System.out.println("Price is " +lp.price);
			System.out.println("============");
		}
	}
}
