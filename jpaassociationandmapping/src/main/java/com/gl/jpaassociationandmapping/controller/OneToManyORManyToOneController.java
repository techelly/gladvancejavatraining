package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.entities.onetomany.Employee;
import com.gl.jpaassociationandmapping.repositories.EmployeeRepository;

@RestController
public class OneToManyORManyToOneController {
	@Autowired
	private EmployeeRepository emRepo;

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return emRepo.save(emp);
	}
}
