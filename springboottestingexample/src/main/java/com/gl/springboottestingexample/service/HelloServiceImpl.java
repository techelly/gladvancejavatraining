package com.gl.springboottestingexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springboottestingexample.repositories.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	private HelloRepository helloRepo;
	@Override
	public String getMessage() {
		
		return helloRepo.getMessage();
	}

}
