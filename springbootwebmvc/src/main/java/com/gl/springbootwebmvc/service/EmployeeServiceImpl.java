package com.gl.springbootwebmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.springbootwebmvc.dao.EmployeeDAO;
import com.gl.springbootwebmvc.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO empDAO;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return empDAO.createEmployee(employee);
	}

	@Override
	public Employee retrieveEmployee(Integer empId) {
		return empDAO.retrieveEmployee(empId);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return empDAO.updateEmployee(employee);
	}

	@Override
	public String deleteEmployee(Integer empId) {
		return empDAO.deleteEmployee(empId);
	}

}
