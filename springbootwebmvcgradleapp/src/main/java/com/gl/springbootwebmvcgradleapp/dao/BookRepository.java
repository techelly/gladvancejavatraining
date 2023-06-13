package com.gl.springbootwebmvcgradleapp.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.springbootwebmvcgradleapp.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
		public Optional<Book> findByBookName(String bookName);
}
