package com.tyss.sorting.set;

import java.util.Comparator;

public class SortByMICR implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long k = o1.micr;
		Long l = o2.micr;
		return k.compareTo(l);
		
	}

}
