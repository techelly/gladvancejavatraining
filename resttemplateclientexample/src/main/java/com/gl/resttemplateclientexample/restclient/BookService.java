package com.gl.resttemplateclientexample.restclient;

import java.util.List;

import com.gl.resttemplateclientexample.exceptions.BookNotFoundException;
import com.gl.resttemplateclientexample.model.Book;

public interface BookService {
	//Create
	public Book addBook(Book book);
	//Retrieve
	public Book getBookById(Integer bookId) throws BookNotFoundException;
	//Update
	public void updateBook(Book book) throws BookNotFoundException;
	//Delete
	public void deleteBookById(Integer bookId) throws BookNotFoundException;
	
	//Retrieve all books
	public List<Book> getAllBoooks() throws BookNotFoundException;
	//Retrieve book by name
	public Book getBookByName(String bookName) throws BookNotFoundException;
	
	//Retrieve
	public List<Book> getBookByPublisherAndPrice(String publisher,Double price);
	
	
}
