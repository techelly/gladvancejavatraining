package com.gl.springbootwebmvcgradleapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springbootwebmvcgradleapp.dao.BookRepository;
import com.gl.springbootwebmvcgradleapp.entities.Book;
import com.gl.springbootwebmvcgradleapp.exceptions.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookRepo;
	@Override
	public Book addBook(Book book) {
		
		return bookRepo.save(book);
	}

	@Override
	public Book getBookById(Integer bookId) throws BookNotFoundException{
		Optional<Book> bok = bookRepo.findById(bookId);
		if(bok.isPresent()) {
			return bok.get();
		}else {
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

}
