package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.manytomany.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
