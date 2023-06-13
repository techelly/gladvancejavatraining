package com.gl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	//http://localhost:8080/greet
	@GetMapping("/greet")
	public String greet() {
		return "Good Morning Everyone";
	}
}
