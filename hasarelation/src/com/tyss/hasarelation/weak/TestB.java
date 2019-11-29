package com.tyss.hasarelation.weak;

public class TestB {

	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		c.move();
		c.accelerate();
		System.out.println("==============");

		System.out.println(c.m.name);
		c.m.listen();

	}
}