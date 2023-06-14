package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gl.jpaassociationandmapping.entities.onetooneuni.Address;

public interface AddressRepository extends CrudRepository<Address, Integer> {

}
