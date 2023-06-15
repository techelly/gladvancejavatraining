package com.gl.springbootwebmvcgradleapp.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springbootwebmvcgradleapp.dao.BookRepository;
import com.gl.springbootwebmvcgradleapp.entities.Book;
import com.gl.springbootwebmvcgradleapp.exceptions.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {
	
	private static final Logger logger = LogManager.getLogger(BookServiceImpl.class);
	@Autowired
	private BookRepository bookRepo;
	@Override
	public Book addBook(Book book) {
		Optional<Book> bok= bookRepo.findById(book.getBookId());
		if(bok.isPresent()) {
			logger.warn("Book already exist in the database " + book.getBookName());
			return bok.get();
		}else {
			logger.info("Book added successfully with book id --- " + book.getBookId());
			return bookRepo.save(book);
		}
	}

	@Override
	public Book getBookById(Integer bookId) throws BookNotFoundException{
		Optional<Book> bok = bookRepo.findById(bookId);
		if(bok.isPresent()) {
			logger.info("Book is present in the database " +bookId);
			return bok.get();
		}else {
			logger.info("Book with id "+bookId+" does not exists in our record");
			throw new BookNotFoundException("Book with id "+bookId+" does not exists in our record");
		}
		
		
	}

	@Override
	public Book updateBook(Book book) throws BookNotFoundException{
		if(bookRepo.existsById(book.getBookId())){
			return bookRepo.save(book);
		}else {
			throw new BookNotFoundException("Book with id "+book.getBookId()+" does not exists in our record");
		}
	}

	@Override
	public String deleteBookById(Integer bookId) throws BookNotFoundException{
		if(bookRepo.existsById(bookId)) {
			bookRepo.deleteById(bookId);
			return "Book with book id "+bookId+" deleted successfully";
		}else {
			throw new BookNotFoundException("Book with id "+bookId+" does not exists in our record");
		}
	}

	@Override
	public List<Book> getAllBoooks() throws BookNotFoundException{
		List<Book> bookList = (List<Book>) bookRepo.findAll();
		if(bookList != null) {
		return bookList;
		}else {
			throw new BookNotFoundException("Books not found");
		}
 	}

	@Override
	public Book getBookByName(String bookName) throws BookNotFoundException {
		
		Optional<Book> bok = bookRepo.findByBookName(bookName);
		if(bok.isPresent()) {
			return bok.get();
		}else {
			throw new BookNotFoundException("Book with name  "+bookName+" does not exists in our record");
		}
	}

	@Override
	public List<Book> getBookByPublisherAndPrice(String publisher, Double price) {
		Optional<List<Book>> books= bookRepo.findByPublisherAndPrice(publisher, price);
		if(books.isPresent()){
			return books.get();
		}
		return null;
	}

}
