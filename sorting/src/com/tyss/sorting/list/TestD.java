package com.tyss.sorting.list;

import java.util.Stack;

public class TestD {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		s.add(32);
		s.add(42);
		s.add(78);
		
		System.out.println("Using get() -----");
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
		}
		
		int j = s.size();
		
		System.out.println("Using pop() -----");
		for (int i = 0; i < j; i++) {
			System.out.println(s.pop());
		}
	}
}
