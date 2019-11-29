package com.tyss.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Marker();		//UpCasting
		System.out.println(p.cost);
		p.write();
		
//		System.out.println(p.size);
//		p.color();
		
		Marker m = (Marker) p; //DownCasting
		System.out.println(m.size);
		m.color();
		m.write();
		System.out.println(m.cost);
	}
}
