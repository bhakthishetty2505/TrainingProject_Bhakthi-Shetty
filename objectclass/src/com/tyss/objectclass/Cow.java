package com.tyss.objectclass;

public class Cow {

	int id;
	String name;
	double cost;

	public Cow(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public boolean equals(Object obj) {
		if(this == obj)
		{
			return true;
		}
		Cow c1 = (Cow) obj;

		if(this.id == c1.id) {
			if(this.name.equals(c1.name)) {
				if(this.cost == c1.cost) {
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


}
