package com.gl.springbootwebmvcgradleapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	//http://localhost:8080/hello
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello Everyone";
	}
	
	//http://localhost:8080/message
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String meessage() {
		return "I am learning REST API using gradle and spring boot";
	}
}
