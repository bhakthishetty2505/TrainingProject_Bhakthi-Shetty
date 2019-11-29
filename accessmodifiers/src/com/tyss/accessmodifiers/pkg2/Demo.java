package com.tyss.accessmodifiers.pkg2;

public class Demo {

	private int a = 10;
	long b = 700;
	protected double c = 76.89;
	public String name = "Bhakthi";
	
	private void add() {
		System.out.println("add() of Demo");
	}
	
	void sub() {
		System.out.println("sub() of Demo");
	}
	
	protected void mul() {
		System.out.println("mul() of Demo");
	}
	
	public void div() {
		System.out.println("div() of Demo");
	}
}
