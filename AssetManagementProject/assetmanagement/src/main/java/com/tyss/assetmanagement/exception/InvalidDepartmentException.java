package com.tyss.assetmanagement.exception;
public class InvalidDepartmentException extends RuntimeException {
	public String getMessage()
	{
		return "Invalid Department Id";
	}
}