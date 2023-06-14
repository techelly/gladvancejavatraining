package com.gl.jpaassociationandmapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl.jpaassociationandmapping.entities.manytomany.Order;
import com.gl.jpaassociationandmapping.entities.manytomany.Product;
import com.gl.jpaassociationandmapping.repositories.OrderRepository;
import com.gl.jpaassociationandmapping.repositories.ProductRepository;

@RestController
public class ManyToManyController {
	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private OrderRepository orderRepo;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product emp) {
		return productRepo.save(emp);
	}
	
	
	@PostMapping("/addOrder")
	public Order addOrder(@RequestBody Order emp) {
		return orderRepo.save(emp);
	}
}
