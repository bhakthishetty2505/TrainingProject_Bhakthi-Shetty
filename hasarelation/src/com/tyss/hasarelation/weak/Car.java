package com.tyss.hasarelation.weak;

public class Car {

	String name;
	Music m = new Music();

	void move() {
		System.out.println("move() of Car");
	}

	void accelerate() {
		System.out.println("accelerate() of Car");
	}

}
