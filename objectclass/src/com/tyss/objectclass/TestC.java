package com.tyss.objectclass;

public class TestC {

	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		System.out.println("HashCode of h is " +h );

		String s = m.toString();
		System.out.println("ToString of s is " +s );

		Marker p = new Marker();
		System.out.println(p);

	}
}
