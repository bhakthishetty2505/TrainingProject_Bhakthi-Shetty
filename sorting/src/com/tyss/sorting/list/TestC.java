package com.tyss.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(97);
		l.add(67);
		l.add(45);
		
		Integer peekElement = l.peek();
		System.out.println("Peek Element " +peekElement);
		
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element " +peekFirstElement);
		
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last Element " +peekLastElement);
		
		System.out.println("After Peek--------> " +l);
		
		System.out.println("=====================");
		
		Integer pollElement = l.poll();
		System.out.println("Poll Element " +pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Poll First Element " +pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("Poll Last Element " +pollLastElement);
		
		System.out.println("After Poll----------> " +l);
		
		l.push(23);
		System.out.println("After Push " +l);
		
		Integer p = l.pop();
		System.out.println("Popped Element is " +p);
		System.out.println("After Pop " +l);
	}
}
