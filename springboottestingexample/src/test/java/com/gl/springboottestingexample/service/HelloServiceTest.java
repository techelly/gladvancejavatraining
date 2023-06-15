package com.gl.springboottestingexample.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * @author UD SYSTEMS
 * Using JUNIT 5 how to write test case
 */
@SpringBootTest
public class HelloServiceTest {
	
	@Autowired
	HelloService helloService;
	
	@DisplayName("Test Spring @Autowired  Integration")
	@Test
	void testGetMessage() {
		assertNotEquals("Hello How are you ?", helloService.getMessage());
	}
	
	
	@DisplayName("Test Spring @Autowired  Integration with Success")
	@Test
	void testGetMessageSuccess() {
		assertEquals("Hello Everyone please focus on JUNIT 5 usage", helloService.getMessage());
	}
	
	//For asserting iterables use below example
	@Test
	void testTwoLists() {
		List<Integer> listOfNums = Arrays.asList(1,2,3,4,5,6);
		List<Integer> listOfNums2 = Arrays.asList(1,2,3,4,5,6);
		
		assertArrayEquals(listOfNums.toArray(), listOfNums2.toArray());
		
		assertIterableEquals(listOfNums, listOfNums2);
		
	}
	
	
}
