package com.gl.springbootwebmvcgradleapp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gl.springbootwebmvcgradleapp.entities.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {
		public Optional<Book> findByBookName(String bookName);
		public Optional<Book> findByPublisher(String publisher);


		@Query(value = "SELECT * FROM Book t WHERE t.publisher = :publisher and t.price = :price", nativeQuery = true)
		public Optional<List<Book>> findByPublisherAndPrice(@Param("publisher") String publisher, @Param("price") Double price);
			
}
