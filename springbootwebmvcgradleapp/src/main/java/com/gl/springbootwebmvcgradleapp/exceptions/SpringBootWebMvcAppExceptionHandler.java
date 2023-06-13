package com.gl.springbootwebmvcgradleapp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SpringBootWebMvcAppExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<String> handlBookNotFoundException() {
		return new ResponseEntity<String>("Book not found in a record", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handlCustomerNotFoundException() {
		return new ResponseEntity<String>("Customer not found in a record", HttpStatus.NOT_FOUND);
	}
	

}
