package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByCName sb = new SortByCName();
		TreeSet<Customer> ts = new TreeSet<Customer>(sb);

		Customer c1 = new Customer("Coco", 10, 50000);
		Customer c2 = new Customer("Pluto", 56, 55000);
		Customer c3 = new Customer("Pascal", 3, 30000);
		Customer c4 = new Customer("Sasha", 87, 35000);
		Customer c5 = new Customer("Pebble", 45, 40000);

		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);



		System.out.println("*****Using Iterator*****");

		Iterator<Customer> it = ts.iterator();

		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Name is " +c.name);
			System.out.println("ID is " +c.id);
			System.out.println("Salary is " +c.salary);
			System.out.println("**********");
		}
	}
}
