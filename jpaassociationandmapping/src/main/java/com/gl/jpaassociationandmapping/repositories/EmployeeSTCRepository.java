package com.gl.jpaassociationandmapping.repositories;

import org.springframework.data.repository.CrudRepository;

import com.gl.jpaassociationandmapping.inheritance.stc.EmployeeSTC;

public interface EmployeeSTCRepository extends CrudRepository<EmployeeSTC, Integer> {

}
