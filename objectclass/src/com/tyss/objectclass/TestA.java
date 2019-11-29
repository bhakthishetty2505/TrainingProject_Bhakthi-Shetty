package com.tyss.objectclass;

public class TestA {

	public static void main(String[] args) {
		Pendrive p = new Pendrive();
		USBPort.connect(p);

		Mouse m = new Mouse();
		USBPort.connect(m);
	}
}
