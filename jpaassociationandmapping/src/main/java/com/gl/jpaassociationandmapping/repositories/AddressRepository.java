package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.onetooneuni.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {

}
