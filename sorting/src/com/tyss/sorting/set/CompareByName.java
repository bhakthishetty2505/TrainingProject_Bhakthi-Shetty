package com.tyss.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class CompareByName {
	public static void main(String[] args) {

		Comparator<Employee1> comp = (e1,e2) -> {

			String s = e1.name;
			String t = e2.name;
			return s.compareTo(t);
			// return e1.name.compareTo(e2.name);
		};
		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);

		Employee1 e1 = new Employee1(4, "Coco", 5.6);
		Employee1 e2 = new Employee1(3, "Sasha", 4.9);
		Employee1 e3 = new Employee1(9, "Pluto", 6.0);
		Employee1 e4 = new Employee1(1, "Pebble", 4.1);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("****Using iterator*****");

		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()) {
			Employee1 e = it.next();
			System.out.println("Name is " +e.name);
			System.out.println("ID is " +e.id);
			System.out.println("Height is " +e.height);
			System.out.println("******************");
		}
	}
}
