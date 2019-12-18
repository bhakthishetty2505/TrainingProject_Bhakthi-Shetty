package com.tyss.assetmanagement.exception;
public class RaiseRequestException extends RuntimeException {
	public String getMessage()
	{
		return "Employee for whom you raise the request is not in the organisation";
	}
}