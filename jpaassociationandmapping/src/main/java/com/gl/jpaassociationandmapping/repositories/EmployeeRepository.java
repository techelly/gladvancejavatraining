package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.jpaassociationandmapping.entities.onetomany.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
