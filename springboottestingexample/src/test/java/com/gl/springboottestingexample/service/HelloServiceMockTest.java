package com.gl.springboottestingexample.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.gl.springboottestingexample.repositories.HelloRepository;

@SpringBootTest
public class HelloServiceMockTest {

	@Mock
	private HelloRepository helloRepository;
	
	@InjectMocks
	private HelloService helloService = new HelloServiceImpl();
	
	@BeforeEach
	void setMockOuptut() {
		when(helloRepository.getMessage()).thenReturn("Hello Mockito From Repository");
	}
	
	@DisplayName("Test Mock helloService + helloRepository")
	@Test
	void testGetMessage() {
		assertNotEquals("Hello How are you ?", helloService.getMessage());
	}
	
	
	@DisplayName("Test Mock helloService + helloRepository with Success")
	@Test
	void testGetMessageSuccess() {
		assertEquals("Hello Mockito From Repository", helloService.getMessage());
	}
	
	//For void method use this Mockito doNothing().when() and verify()
	
	@Test
	void testDisplay() {
		HelloService service = mock(HelloService.class);
		
		doNothing().when(service).display();
		service.display();
		
		verify(service,times(1)).display();
	}
}