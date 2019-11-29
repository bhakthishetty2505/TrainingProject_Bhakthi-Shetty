package com.tyss.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {
		System.out.println("Main Started");

		MyJoinThread mj = new MyJoinThread();
		mj.start();
		try {
			mj.join(10000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		System.out.println("Main Ended");
	}
}
