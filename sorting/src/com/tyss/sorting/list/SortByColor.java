package com.tyss.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {

	public int compare(Marker m1, Marker m2) {
		
		String s = m1.color;
		String t = m2.color;
		return s.compareTo(t);
		
	}

	
}
