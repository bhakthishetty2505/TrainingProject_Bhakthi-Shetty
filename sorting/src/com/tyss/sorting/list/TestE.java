package com.tyss.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();

		al.add(new Marker (50, "Blue"));
		al.add(new Marker (70, "Black"));
		al.add(new Marker (60, "Brown"));
		al.add(new Marker (40, "Maroon"));

		System.out.println("Before Sorting ----- ");
		display(al);
		
//		SortByPrice sb = new SortByPrice();
		SortByColor sc = new SortByColor();
		
//		Collections.sort(al, sb);
		Collections.sort(al, sc);
		
		System.out.println("After Sorting -----");
		display(al);
		
		
		
		
		
	}

	static void display(ArrayList<Marker> a) {
		Iterator<Marker> it = a.iterator();
		while(it.hasNext()) {
			Marker m = it.next();
			System.out.println("Price is " +m.price);
			System.out.println("Color is " +m.color);
			System.out.println("----------------");
		}
	}
}
