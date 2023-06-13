package com.gl.springbootwebmvcgradleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.springbootwebmvcgradleapp.entities.Book;
import com.gl.springbootwebmvcgradleapp.service.BookService;

@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	//Create
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	//Retrieve
	@GetMapping("/bookbyid")
	public Book getBookById(@RequestParam("bookId") Integer bookId) {
		return bookService.getBookById(bookId);
	}
	
	/**
	//Update
	public Book updateBook(Book book) throws BookNotFoundException;
	//Delete
	public String deleteBookById(Integer bookId) throws BookNotFoundException;
	
	//Retrieve all books
	public List<Book> getAllBoooks() throws BookNotFoundException;
	//Retrieve book by name
	public Book getBookByName(String bookName) throws BookNotFoundException;
	**/
}
