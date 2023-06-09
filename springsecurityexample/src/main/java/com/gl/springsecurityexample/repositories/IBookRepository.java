package com.gl.springsecurityexample.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.springsecurityexample.entities.BookEntity;

@Repository
public interface IBookRepository extends CrudRepository<BookEntity, Integer> {
	public Optional<BookEntity> findByTitle(String title);
}
