package com.gl.springbootwebmvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

import com.gl.springbootwebmvc.model.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
	private static List<Employee> empList = new ArrayList<Employee>();
	
	@Override
	public Employee createEmployee(Employee employee) {
		empList.add(employee);
		return employee;
	}

	@Override
	public Employee retrieveEmployee(Integer empId) {
		for(Employee e : empList) {
			if(e.getEmpId() == empId){
				return e;
			}
		}
		return null;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		for(Employee e: empList) {
			if(e.getEmpId() == employee.getEmpId()) {
				//e.setDepartment(employee.getDepartment());
				e.setEmpName(employee.getEmpName());
			}
		}
		return employee;
	}

	@Override
	public String deleteEmployee(Integer empId) {
		for(Employee e: empList) {
			if(e.getEmpId() == empId) {
				empList.remove(e);
				return "Employee with "+empId+ " deleted successfully";
			}
		}
		return null;
		
	}

}
