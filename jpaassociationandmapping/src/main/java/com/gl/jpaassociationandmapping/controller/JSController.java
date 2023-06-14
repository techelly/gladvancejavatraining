package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.inheritance.js.EmployeeJS;
import com.gl.jpaassociationandmapping.inheritance.js.ManagerJS;
import com.gl.jpaassociationandmapping.inheritance.tpc.EmployeeTPC;
import com.gl.jpaassociationandmapping.repositories.EmployeeJSRepository;

@RestController
public class JSController {
	
	@Autowired
	private EmployeeJSRepository empJSRepo;
	
	@PostMapping("/addempdataforjs")
	public EmployeeJS addempdataforjs(@RequestBody EmployeeJS emp) {
		return empJSRepo.save(emp);
	}
	
	
	@PostMapping("/addmgrdataforjs")
	public ManagerJS addMgrdataforjs(@RequestBody ManagerJS mgr) {

		return empJSRepo.save(mgr);
	}
}
