package com.gl.resttemplateclientexample.exceptions;
//user defined exception or custom exception
public class BookNotFoundException extends RuntimeException{
	
	private String message;

	public BookNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
