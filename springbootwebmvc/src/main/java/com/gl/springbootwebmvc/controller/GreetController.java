package com.gl.springbootwebmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	//http://localhost:8080/greetings
	@GetMapping("/greetings")
	public String greet() {
		return "Good Morning Everyone";
	}
}
