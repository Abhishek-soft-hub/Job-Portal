package com.example.jobPlateForm.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobleExcptionHandler {

	@ExceptionHandler(exception = UserServiceException.class)
	public ResponseEntity<String> userServiceException(UserServiceException userServiceException){
		return new ResponseEntity<>(userServiceException.getMessage(), userServiceException.getHttpStatus());
		
	}
	
	@ExceptionHandler(exception = AddressServiceException.class)
	public ResponseEntity<String> addressServiceException(AddressServiceException addressServiceException){
		return new ResponseEntity<>(addressServiceException.getMessage(), addressServiceException.getHttpStatus());
		
	}
	
	@ExceptionHandler(exception = ProfileServiceException.class)
	public ResponseEntity<String> profileServiceException(ProfileServiceException profileServiceException){
		return new ResponseEntity<>(profileServiceException.getMessage(), profileServiceException.getHttpStatus());
		
	}
	
	
	
	

}
