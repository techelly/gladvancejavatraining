package com.gl.springbootwebmvc.service;

import com.gl.springbootwebmvc.model.Employee;

public interface EmployeeService {
	// CRUD
	// Create
	public Employee createEmployee(Employee employee);

	// Retrieve
	public Employee retrieveEmployee(Integer empId);

	// Update
	public String updateEmployee(Employee employee);

	// Delete
	public String deleteEmployee(Integer empId);
}
