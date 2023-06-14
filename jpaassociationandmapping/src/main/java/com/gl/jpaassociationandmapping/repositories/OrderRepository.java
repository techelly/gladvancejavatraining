package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.manytomany.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Integer> {

}
