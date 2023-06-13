package com.gl.springbootwebmvcgradleapp.service;

import java.util.List;

import com.gl.springbootwebmvcgradleapp.entities.Book;
import com.gl.springbootwebmvcgradleapp.exceptions.BookNotFoundException;

public interface BookService {
	//Create
	public Book addBook(Book book);
	//Retrieve
	public Book getBookById(Integer bookId) throws BookNotFoundException;
	//Update
	public Book updateBook(Book book) throws BookNotFoundException;
	//Delete
	public String deleteBookById(Integer bookId) throws BookNotFoundException;
	
	//Retrieve all books
	public List<Book> getAllBoooks() throws BookNotFoundException;
	//Retrieve book by name
	public Book getBookByName(String bookName) throws BookNotFoundException;
	
}
