package com.tyss.assetmanagement.exception;
public class LoginException extends RuntimeException {
  public String getMessage()
	{
		return "Inavalid Username or Password";
	}
}
