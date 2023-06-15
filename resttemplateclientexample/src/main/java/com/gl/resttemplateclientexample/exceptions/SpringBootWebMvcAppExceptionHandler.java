package com.gl.resttemplateclientexample.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestClientException;

@RestControllerAdvice
public class SpringBootWebMvcAppExceptionHandler {
	
	@ExceptionHandler(BookNotFoundException.class)
	public ResponseEntity<String> handlBookNotFoundException() {
		return new ResponseEntity<String>("Book not found in a record", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(RestClientException.class)
	public ResponseEntity<String> handleRestClientException(RestClientException rce){
		return new ResponseEntity<String>(rce.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	/**

	@ExceptionHandler(CustomerNotFoundException.class)
	public ResponseEntity<String> handlCustomerNotFoundException() {
		return new ResponseEntity<String>("Customer not found in a record", HttpStatus.NOT_FOUND);
	}**/
	
	/**
	@ExceptionHandler(value = CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException ex) {
        //ErrorResponse errorResponse = new com.gl.springbootwebmvcgradleapp.exceptions.ErrorResponse(ex.getMessage());
		ErrorResponse errorResponse = new ErrorResponse(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }**/


}
