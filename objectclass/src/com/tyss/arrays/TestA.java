package com.tyss.arrays;

public class TestA {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		
		System.out.println("----------------");
		
		int[] number = {10,20,30,40,50};
		for(int i : number) {
			System.out.println(i);
		}
		System.out.println("------------------");
		
		char[] ch = {'a', 'b','c','d'};
		for(char c : ch) {
			System.out.println(c);
		}
		
		byte[] b = {1, 2, 3, 4, 5};
		for(int i = 0; i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("-------------");
		
		for(byte b1 : b) {
			System.out.println(b1);
		}
		
		System.out.println("-------------");
		
		double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
		for(int j = 0; j<d.length; j++) {
			System.out.println(d[j]);
		}
		System.out.println("-------------");
		for(double d1 : d) {
			System.out.println(d1);
		}
		System.out.println("-------------");
		
		String[] names = {"Bhakthi","Asha","Siddhi"};
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("-------------");
		for(String s : names) {
			System.out.println(s);
		}
	}
}