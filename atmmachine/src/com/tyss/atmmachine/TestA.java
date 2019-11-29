package com.tyss.atmmachine;

public class TestA {

	public static void main(String[] args) {
		Machine m = new Machine();

		HDFC h1 = new HDFC();
		m.slot(h1);

		ICICI i = new ICICI();
		m.slot(i);

		SBI s = new SBI();
		m.slot(s);
	}
}
