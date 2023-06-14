package com.gl.jpaassociationandmapping.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.entities.onetoonebi.AddressBi;
import com.gl.jpaassociationandmapping.entities.onetoonebi.StudentBi;
import com.gl.jpaassociationandmapping.repositories.AddressBiRepository;
import com.gl.jpaassociationandmapping.repositories.StudentBiRepository;

@RestController
public class OneToOneBiController {

	@Autowired
	private StudentBiRepository studentRepo;
	
	@Autowired
	private AddressBiRepository addressRepo;

	@PostMapping("/addStudentBi")
	public StudentBi addStudent(@RequestBody StudentBi studentBi) {
		return studentRepo.save(studentBi);
	}
	
	@GetMapping("/getstudentBi")
	public StudentBi getStudentBi(@RequestParam("id") Integer id) {
		Optional<StudentBi>  studentBi = studentRepo.findById(id);
		if(studentBi.isPresent()) {
			StudentBi stu = studentBi.get();
			return stu;
		}
		return null;
	}
	
	@GetMapping("/getAddressBi")
	public AddressBi getAddressBi(@RequestParam("id") Integer id) {
		Optional<AddressBi>  addressBi = addressRepo.findById(id);
		if(addressBi.isPresent()) {
			AddressBi addr = addressBi.get();
			return addr;
		}
		return null;
	}
}
