package com.gl.springbootwebmvc.dao;

import com.gl.springbootwebmvc.model.Employee;

public interface EmployeeDAO {
	//CRUD
	//Create
		public Employee createEmployee(Employee employee);
	//Retrieve
		public Employee retrieveEmployee(Integer empId);
	//Update
		public Employee updateEmployee(Employee employee);
	//Delete
		public String deleteEmployee(Integer empId);
}
