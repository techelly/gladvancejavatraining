package com.gl.springbootwebmvcgradleapp.exceptions;

public class CustomerNotFoundException extends RuntimeException{
	
	private String message;

	public CustomerNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
