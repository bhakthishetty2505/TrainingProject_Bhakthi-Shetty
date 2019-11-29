package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestL {

public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher t1 = new Teacher(10, "Bhakthi","Java",50000);
		Teacher t2 = new Teacher(20, "Shetty","Python", 45000);
		Teacher t3 = new Teacher(30, "Coco","Angular", 30000);
		
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		for (int i = 0; i < al.size(); i++) {
			Teacher t = al.get(i);
			System.out.println("ID is " +t.id);
			System.out.println("Name is " +t.name);
			System.out.println("Subject is " +t.subject);
			System.out.println("Salary is " +t.salary);
		}
		
		System.out.println("=====for each=====");
		
		for (Teacher teacher : al) {
			System.out.println(teacher);
		}
		
		System.out.println("====Using Iterator====");
		Iterator<Teacher> it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("====Using List Iterator====");
		ListIterator<Teacher> lt = al.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}
		
		System.out.println("====Using List Iterator Backwards====");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}
}
