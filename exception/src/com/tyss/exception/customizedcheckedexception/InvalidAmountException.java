package com.tyss.exception.customizedcheckedexception;

public class InvalidAmountException extends Exception {
	
	String message = "Daily limit is 40,000";
	
	@Override
	public String getMessage() {
		return message;
	}

}
