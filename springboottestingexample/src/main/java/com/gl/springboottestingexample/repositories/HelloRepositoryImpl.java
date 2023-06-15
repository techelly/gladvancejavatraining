package com.gl.springboottestingexample.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepositoryImpl implements HelloRepository {


	@Override
	public String getMessage() {
		
		return "Hello Everyone please focus on JUNIT 5 usage";
	}

}
