package com.gl.resttemplateclientexample.restclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.resttemplateclientexample.exceptions.BookNotFoundException;
import com.gl.resttemplateclientexample.model.Book;
import com.gl.resttemplateclientexample.restclient.BookClient;

@RestController
public class BookRestClientController {
	
	@Autowired
	private BookClient restClient;
	
	@GetMapping("/restclient/allbooks")
	public List<Book> getAllBoooks(){
		return restClient.getAllBoooks();
	}
	
	@GetMapping("/restclient/bookbyname/{name}")
	public ResponseEntity<Book> getBookByName(@PathVariable("name") String bookName) throws BookNotFoundException{
		//return restClient.getBookByName(bookName);
		Book book =  restClient.getBookByName(bookName);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@PostMapping("/restclient/addbook")
	public Book addBook(@RequestBody Book book){
		return restClient.addBook(book);
	}
	
	@PutMapping("/restclient/updatebook")
	public void updateBook(@RequestBody Book book){
		restClient.updateBook(book);
	}
	
	
	@DeleteMapping("/restclient/deletebookbyid")
	public void deleteBookById(@RequestParam("id") Integer id) {
		restClient.deleteBookById(id);
	}
}
