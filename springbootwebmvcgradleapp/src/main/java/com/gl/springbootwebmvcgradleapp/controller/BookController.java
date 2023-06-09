package com.gl.springbootwebmvcgradleapp.controller;


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

import com.gl.springbootwebmvcgradleapp.entities.Book;
import com.gl.springbootwebmvcgradleapp.exceptions.BookNotFoundException;
import com.gl.springbootwebmvcgradleapp.service.BookService;

import lombok.extern.slf4j.Slf4j;
//@Controller + @ResponseBody = @RestController
@RestController
@Slf4j
public class BookController {
	@Autowired
	private BookService bookService;
	//private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BookController.class);
	//Create
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book){
		return bookService.addBook(book);
	}
	//Retrieve
	@GetMapping("/bookbyid")
	public ResponseEntity<Book> getBookById(@RequestParam("bookId") Integer bookId) throws BookNotFoundException{
		Book book =  bookService.getBookById(bookId);
		log.info("Using Sl4j logging ---- Book retrieved successfully ! book id is "+bookId);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	
	//Update
	@PutMapping("/updatebook")
	public ResponseEntity<Book> updateBook(Book book) throws BookNotFoundException{
		Book bok =  bookService.updateBook(book);
		return new ResponseEntity<Book>(bok,HttpStatus.OK);
	}
	//Delete
	@DeleteMapping("/deletebookbyid")
	public ResponseEntity<String> deleteBookById(@RequestParam("id") Integer bookId) throws BookNotFoundException{
		String msg = bookService.deleteBookById(bookId);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	//Retrieve all books
	@GetMapping("/allbooks")
	public  ResponseEntity<List<Book>> getAllBoooks() throws BookNotFoundException{
		List<Book> books =  bookService.getAllBoooks();
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	}
	//Retrieve book by name
	@GetMapping("/bookbyname/{name}")
	public ResponseEntity<Book> getBookByName(@PathVariable("name") String bookName) throws BookNotFoundException{
		Book book =  bookService.getBookByName(bookName);
		return new ResponseEntity<Book>(book,HttpStatus.OK);
	}
	
	@GetMapping("/bookbypublishserandprice")
	public ResponseEntity<List<Book>> getBookByPublisherAndPrice(@RequestParam("publisher") String bookName, @RequestParam("price") Double price) throws BookNotFoundException{
		List<Book> books =  bookService.getBookByPublisherAndPrice(bookName, price);
		
		return new ResponseEntity<List<Book>>(books,HttpStatus.OK);
	}
	
}
