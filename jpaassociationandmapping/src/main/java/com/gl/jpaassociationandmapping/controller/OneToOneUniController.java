package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.entities.onetooneuni.Student;
import com.gl.jpaassociationandmapping.repositories.StudentRepository;

@RestController
public class OneToOneUniController {

	@Autowired
	private StudentRepository studentRepo;

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
}
