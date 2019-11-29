package com.tyss.objectclass;

public class Employee {

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public boolean equals(Object obj) {
		if(this == obj)
		{
			return true;
		}
		Employee e1 = (Employee) obj;

		if(this.id == e1.id) {
			if(this.name.equals(e1.name)) {
				if(this.salary == e1.salary) {
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
