package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.onetoonebi.StudentBi;

@Repository
public interface StudentBiRepository extends CrudRepository<StudentBi, Integer> {

}
