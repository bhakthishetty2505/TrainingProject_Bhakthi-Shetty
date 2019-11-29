package com.tyss.arrays;

public class TestB {

	public static void main(String[] args) {

		int[] nums = {10,20,30,40};
		//		System.out.println(nums[10]); ArrayIndexOutOfBoundsException
		System.out.println(nums[3]);
		receive(nums);
		int[] values = getArray();
		for(int val : values) {
			System.out.println(val);
		}

		System.out.println("-------------------------------");

		String[] names = {"Bhakthi", "Asha", "Siddhi","Kavya","Navya"};
		System.out.println(names[3]);

		receive(names);

		String[] values1 = getString();
		for(String val : values1) {
			System.out.println(val);
		}
	}


	static void receive(int[] numbers) {

		for(int num : numbers) {
			System.out.println(num);
		}
	}

	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}

	static void receive(String[] name) {

		for(String names : name) {
			System.out.println(name);
		}
	}

	static String[] getString() {
		String[] values1 = {"abc","bcd","def","efg"};
		return values1;
	}
}

