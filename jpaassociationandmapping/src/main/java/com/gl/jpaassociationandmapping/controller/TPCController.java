package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.inheritance.stc.EmployeeSTC;
import com.gl.jpaassociationandmapping.inheritance.tpc.EmployeeTPC;
import com.gl.jpaassociationandmapping.inheritance.tpc.ManagerTPC;
import com.gl.jpaassociationandmapping.repositories.EmployeeTPCRepository;

@RestController
public class TPCController {
	
	@Autowired
	private EmployeeTPCRepository empTPCRepo;
	
	@PostMapping("/addempdatafortpc")
	public EmployeeTPC addempdatafortpc(@RequestBody EmployeeTPC emp) {
		return empTPCRepo.save(emp);
	}
	
	
	@PostMapping("/addmgrdatafortpc")
	public ManagerTPC addMgrdatafortpc(@RequestBody ManagerTPC mgr) {

		return empTPCRepo.save(mgr);
	}
}
