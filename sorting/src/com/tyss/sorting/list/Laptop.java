package com.tyss.sorting.list;

public class Laptop implements Comparable<Laptop> {

	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
	
//	@Override
//	public int compareTo(Laptop l ) {
//		Integer r = this.ram;
//		Integer s = l.ram;
//		return r.compareTo(s);
//	}
	
//	@Override
//	public int compareTo(Laptop l ) {
//		Double a = this.price;
//		Double b = l.price;
//		return a.compareTo(b);
//	}
//	
	@Override
	public int compareTo(Laptop l ) {
		String c = this.name;
		String d = l.name;
		return c.compareTo(d);
	}
	
	
	

	
	
}
