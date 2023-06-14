package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.onetoonebi.AddressBi;

@Repository
public interface AddressBiRepository extends CrudRepository<AddressBi, Integer> {

}
