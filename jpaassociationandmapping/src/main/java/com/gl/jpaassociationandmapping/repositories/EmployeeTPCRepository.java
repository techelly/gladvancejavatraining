package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gl.jpaassociationandmapping.inheritance.tpc.EmployeeTPC;

public interface EmployeeTPCRepository extends CrudRepository<EmployeeTPC, Integer> {

}
