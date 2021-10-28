package com.cybage.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalException {

	@ExceptionHandler({CustomerException.class})
	public ResponseEntity<String> handleException(CustomerException customerException) {
		return new ResponseEntity<>(customerException.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
