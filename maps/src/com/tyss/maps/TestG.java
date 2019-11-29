package com.tyss.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(2, "Coco", 40000);
		Employee e2 = new Employee(5, "Pluto", 45000);
		Employee e3 = new Employee(34, "Pebble", 20000);
		Employee e4 = new Employee(4, "Bruno", 15000);
		Employee e5 = new Employee(4, "Humphrey", 25000);
		Employee e6 = new Employee(4, "Naomi", 19000);
		Employee e7 = new Employee(4, "Roxy", 22000);
		Employee e8 = new Employee(4, "Brad", 39000);
		Employee e9 = new Employee(4, "Alex", 48000);		
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		ArrayList<Employee> al1 = new ArrayList<>();
		al1.add(e4);
		al1.add(e5);
		al1.add(e6);
		
		ArrayList<Employee> al2 = new ArrayList<>();
		al2.add(e7);
		al2.add(e8);
		al2.add(e9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("Manager1", al);
		hm.put("Manager2", al1);
		hm.put("Manager3", al2);
		
		ArrayList<Employee> first = hm.get("Manager1");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Name is " +e.name);
			System.out.println("ID is " +e.id);
			System.out.println("Salary is " +e.salary);
			System.out.println("************");
		}
	}
}
