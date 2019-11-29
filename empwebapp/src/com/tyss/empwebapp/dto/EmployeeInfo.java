package com.tyss.empwebapp.dto;

import lombok.Data;


@Data // gives all getters() and setters() + toString() + equals() + hashCode()

public class EmployeeInfo {

	private int id;
	private String name;
	private String email;
	private String password;
	
	
}
