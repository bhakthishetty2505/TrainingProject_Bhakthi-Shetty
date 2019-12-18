package com.tyss.assetmanagement.exception;
public class StatusExcpetion extends RuntimeException {
	public String getMessage()
	{
		return "Can't Set STatus:Invalid Allocation Id";
	}
}
