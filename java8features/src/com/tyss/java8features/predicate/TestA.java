package com.tyss.java8features.predicate;

import java.util.function.Predicate;

public class TestA {

	public static void main(String[] args) {
		Predicate<Teacher> p = (t) -> {
			if(t.salary >= 30000) {
				return true;
			}
			return false;
		};
		
		Teacher t = new Teacher(1, "Coco", "Java", 35000);
		boolean b = p.test(t);
		System.out.println("true or false : " +b);
		
	}
}
