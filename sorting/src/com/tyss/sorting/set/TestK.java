package com.tyss.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(12);
		pq.add(420);
		pq.add(30);
		pq.add(2);
		pq.offer(1);
		
		System.out.println("Before Poll " +pq);
		System.out.println("*****Using iterator*****");
		
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("After poll " +pq);
 	}
}
