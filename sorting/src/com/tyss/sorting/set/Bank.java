package com.tyss.sorting.set;

public class Bank{

	String name;
	int pincode;
	long micr;
	
	public Bank(String name, int pincode, long micr) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.micr = micr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (micr ^ (micr >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pincode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bank other = (Bank) obj;
		if (micr != other.micr)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}
	
	
	
}
