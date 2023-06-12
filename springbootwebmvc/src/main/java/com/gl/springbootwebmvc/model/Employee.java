package com.gl.springbootwebmvc.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
		
	private Integer empId;
	private String empName;
	//private Department department;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public Employee(Integer empId, String empName, Department department) {
	 * this.empId = empId; this.empName = empName; this.department = department; }
	 */

	public Integer getEmpId() {
		return empId;
	}
	public Employee(Integer empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	/*
	 * public Department getDepartment() { return department; }
	 * 
	 * public void setDepartment(Department department) { this.department =
	 * department; }
	 */
	
	
	
	
}
