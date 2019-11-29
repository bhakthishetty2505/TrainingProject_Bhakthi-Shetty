package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestM {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(42.0);
		al.add(53.4);
		al.add(64.5);
		al.add(12.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, 54.8);
		System.out.println("After adding at second index : " +al );
		
		al.remove(3);
		System.out.println("After removing at third index : " +al );
		
		al.remove(null);
		System.out.println("After removing null : " +al );
		
		double val = al.get(4);
		System.out.println("Object at 4th index : " +val );
		
		al.set(1, 45.0);
		System.out.println("After replacing at first index : " +al );
		
		al.clear();
		System.out.println("After clearing : " +al );
		
		al.contains(12.5);
		System.out.println("Contains : " +al );
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(90.8);
		al1.add(71.6);
		
		al.addAll(al1);
		System.out.println("After addAll() " +al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("After containsAll() " +contain);
		
		System.out.println("Before removing " +al);
		
		boolean res = al.removeAll(al1);
		System.out.println("After removeAll() " +res);
		
		System.out.println("After removing " +al);
		
	}
}
