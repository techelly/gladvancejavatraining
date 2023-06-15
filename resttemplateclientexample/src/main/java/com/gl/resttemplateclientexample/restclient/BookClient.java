package com.gl.resttemplateclientexample.restclient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gl.resttemplateclientexample.exceptions.BookNotFoundException;
import com.gl.resttemplateclientexample.model.Book;

@Service
public class BookClient implements BookService{
	@Autowired
	private RestTemplate restTemplate;
	
	//Another service url
	private final String ROOT_URI = "http://localhost:8080";
	@Override
	public Book addBook(Book book) {
		ResponseEntity<Book> response = restTemplate.postForEntity(ROOT_URI+"/addbook", book, Book.class);
		return response.getBody();
	}

	@Override
	public Book getBookById(Integer bookId) throws BookNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateBook(Book book) throws BookNotFoundException {
		restTemplate.put(ROOT_URI+"/updatebook", book);
	}

	@Override
	public void deleteBookById(Integer bookId) throws BookNotFoundException {
		/**
		ResponseEntity<String> response = restTemplate.getForEntity(ROOT_URI+"/deletebookbyid"+bookId, String.class);
		System.out.println(response.getBody());
		**/
		restTemplate.delete(ROOT_URI+"/deletebookbyid",bookId);
	}

	@Override
	public List<Book> getAllBoooks() throws BookNotFoundException {
		ResponseEntity<Book[]> response = restTemplate.getForEntity(ROOT_URI+"/allbooks", Book[].class);
		//System.out.println(Arrays.asList(response.getBody()));
		return Arrays.asList(response.getBody());
	}

	@Override
	public Book getBookByName(String bookName) throws BookNotFoundException {
		ResponseEntity<Book> response = restTemplate.getForEntity(ROOT_URI + "/bookbyname/"+bookName, Book.class);
		return response.getBody();
	}

	@Override
	public List<Book> getBookByPublisherAndPrice(String publisher, Double price) {
		// TODO Auto-generated method stub
		return null;
	}
}
