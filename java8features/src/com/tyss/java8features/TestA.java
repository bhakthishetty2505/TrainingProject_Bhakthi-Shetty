package com.tyss.java8features;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> {
			if(i%2 == 0) {
				return true;
			}
			return false;
		};
		boolean b = p.test(19);
		System.out.println("isTrue? " +b);
	}
}
