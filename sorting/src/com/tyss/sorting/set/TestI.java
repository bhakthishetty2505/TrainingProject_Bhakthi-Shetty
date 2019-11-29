package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {

	public static void main(String[] args) {
		
//		SortByName sb = new SortByName();
		SortByMICR sm = new SortByMICR();
//		SortByPincode sp = new SortByPincode();
		TreeSet<Bank> ts = new TreeSet<Bank>(sm);
		
		Bank b1 = new Bank("HDFC", 569068, 678768969);
		Bank b2 = new Bank("SBI", 560098, 55784155);
		Bank b3 = new Bank("ICICI", 560658, 897456161);
		Bank b4 = new Bank("CANARA", 587068, 984551223);
		Bank b5 = new Bank("CANARA", 587068, 984551223);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		
		
		System.out.println("*****Using Iterator*****");
		
		Iterator<Bank> it = ts.iterator();

		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Name is " +b.name);
			System.out.println("Pincode is " +b.pincode);
			System.out.println("MICR number is " +b.micr);
			System.out.println("**********");
		}
	}
}
