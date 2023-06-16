package com.gl.springsecurityexample.service;

import java.util.List;

import com.gl.springsecurityexample.exceptions.BookNotFoundException;
import com.gl.springsecurityexample.exceptions.ResourceNotFoundException;
import com.gl.springsecurityexample.model.Book;


public interface IBookService {
	public Book saveBook(Book book);

	public Book updateBook(Book book) throws BookNotFoundException;

	public Book deleteBook(Integer bookId) throws BookNotFoundException;

	public Book viewBookById(Integer bookId) throws BookNotFoundException;

	public Book viewBookByTitle(String title) throws BookNotFoundException;

	public List<Book> viewAllBooks()throws ResourceNotFoundException;

}
