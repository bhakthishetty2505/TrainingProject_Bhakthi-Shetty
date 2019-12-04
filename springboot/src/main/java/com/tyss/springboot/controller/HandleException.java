package com.tyss.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.springboot.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Exception occurred");
		return response;
		
	}
		
}
