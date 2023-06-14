package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gl.jpaassociationandmapping.entities.onetooneuni.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
