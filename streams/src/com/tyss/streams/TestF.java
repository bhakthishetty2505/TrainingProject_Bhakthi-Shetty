package com.tyss.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(1, "Veeru");
		Employee e2 = new Employee(4, "Yuvi");
		Employee e3 = new Employee(2, "Dhoni");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Comparator<Employee> comp = (e4, e5) ->{
			return e4.name.compareTo(e5.name);
		};
		List<Employee> l = al.stream().sorted(comp).collect(Collectors.toList());
		
		Iterator<Employee> it = l.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("ID is " +e.id);
			System.out.println("Name is " +e.name);
		}
	}
}
