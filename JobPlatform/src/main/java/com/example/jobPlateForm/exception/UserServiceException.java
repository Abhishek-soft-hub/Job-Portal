package com.example.jobPlateForm.exception;

import org.springframework.http.HttpStatus;

public class UserServiceException extends RuntimeException{

	private String message;
	private HttpStatus httpStatus;
	
	public String getMessage() {
		return message;
		
	}
	
	public HttpStatus getHttpStatus() {
		return httpStatus;
		
	}
	
	public UserServiceException(String message, HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
		this.message = message;
		
	}

}
