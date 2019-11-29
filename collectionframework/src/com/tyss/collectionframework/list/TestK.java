package com.tyss.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestK {

public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(10, "Bhakthi",50000);
		Employee e2 = new Employee(20, "Shetty", 45000);
		Employee e3 = new Employee(30, "Coco", 30000);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println("ID is " +e.eid);
			System.out.println("Name is " +e.ename);
			System.out.println("Salary is " +e.salary);
		}
		
		System.out.println("=====for each=====");
		
		for (Employee emp : al) {
			System.out.println(emp);
		}
		
		System.out.println("====Using Iterator====");
		Iterator<Employee> it = al.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("====Using List Iterator====");
		ListIterator<Employee> lt = al.listIterator();
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
