package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.inheritance.stc.EmployeeSTC;
import com.gl.jpaassociationandmapping.inheritance.stc.ManagerSTC;
import com.gl.jpaassociationandmapping.repositories.EmployeeSTCRepository;

@RestController
public class STCController {
	
	@Autowired
	private EmployeeSTCRepository empStcRepo;
	
	@PostMapping("/addempdataforstc")
	public EmployeeSTC adddataforstc(@RequestBody EmployeeSTC emp) {
		return empStcRepo.save(emp);
	}
	
	
	@PostMapping("/addmgrdataforstc")
	public ManagerSTC addMgrdataforstc(@RequestBody ManagerSTC mgr) {

		return empStcRepo.save(mgr);
	}
}
