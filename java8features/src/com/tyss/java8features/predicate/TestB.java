package com.tyss.java8features.predicate;

import java.util.function.Predicate;



public class TestB {

	public static void main(String[] args) {
		Predicate<Car> p = (c) -> {
			if(c.price >= 850000) {
				return true;
			}
			return false;
		};
		
		Car c = new Car("Mustang", 900000, "Color");
		boolean b = p.test(c);
		System.out.println("true or false : " +b);
		
	}
}
