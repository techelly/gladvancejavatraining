package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.onetooneuni.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
