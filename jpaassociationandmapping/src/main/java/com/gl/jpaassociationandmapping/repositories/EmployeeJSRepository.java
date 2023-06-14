package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.inheritance.js.EmployeeJS;

@Repository
public interface EmployeeJSRepository extends CrudRepository<EmployeeJS, Integer> {

}
