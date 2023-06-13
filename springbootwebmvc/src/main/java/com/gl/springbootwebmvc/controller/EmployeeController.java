package com.gl.springbootwebmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gl.springbootwebmvc.model.Employee;
import com.gl.springbootwebmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	// Create
	// http://localhost:8080/addemployee
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		Employee emp = empService.createEmployee(employee);
		ModelAndView mv = new ModelAndView();
		if (emp != null) {
			mv.addObject("emp", emp);
			mv.setViewName("emplist");
		} else {
			mv.addObject("msg", "Unable to add employee");
			mv.setViewName("emperror");
		}

		return mv;
	}

	// load form to add employee
	// http://localhost:8080/empform
	@RequestMapping(value = "/empform", method = RequestMethod.GET)
	public ModelAndView addEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empform");
		return mv;
	}

	// http://localhost:8080/retrieveemployee?id=1&name="Raj"
	// Retrieve
	@RequestMapping(value = "/retrieveemployee", method = RequestMethod.GET)
	public ModelAndView retrieveEmployee(@RequestParam("id") Integer empId, @RequestParam("name") String name) {
		Employee emp = empService.retrieveEmployee(empId);
		ModelAndView mv = new ModelAndView();
		if (emp != null) {
			mv.addObject("emp", emp);
			mv.setViewName("emplist");
		} else {
			mv.addObject("msg", "Employee with " + empId + " doesn't exists");
			mv.setViewName("emperror");
		}
		return mv;
	}

	// Update
	// http://localhost:8080/updateemployee
	@RequestMapping(value = "/updateemployee", method = RequestMethod.POST)
	//Thymeleaf is an HTML template engine. 
	//HTML does not support put or delete HTTP methods for its method attribute. 
	//@RequestMapping(value = "/updateemployee", method = RequestMethod.PUT)
	public ModelAndView updateEmployee(@ModelAttribute Employee employee) {
		String message = empService.updateEmployee(employee);
		ModelAndView mv = new ModelAndView();
		if (message != null) {
			mv.addObject("message", message);
			mv.setViewName("emplist");
		} else {
			mv.addObject("msg",
					"Employee with " + employee.getEmpId() + " doesn't exists. So we cannot update the record");
			mv.setViewName("emperror");
		}
		return mv;
	}

	// load form to update employee
	// http://localhost:8080/empupdateform
	@RequestMapping(value = "/empupdateform", method = RequestMethod.GET)
	public ModelAndView updateEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateempform");
		return mv;
	}

	// http://localhost:8080/deleteemployee/1
	// Delete
	@RequestMapping(value = "/deleteemployee/{empid}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("empid") Integer empId) {
		String message = empService.deleteEmployee(empId);
		ModelAndView mv = new ModelAndView();

		if (message != null) {
			mv.addObject("success", message);
			mv.setViewName("deletesucess");
		} else {
			mv.addObject("notsuccess", "Employee with " + empId + " doesn't exists");
			mv.setViewName("notdeletesucess");
		}

		return mv;
	}

	// URL --- http://localhost:8080/deleteempform
	@RequestMapping(value = "/deleteempform", method = RequestMethod.GET)
	public ModelAndView renderDeleteUserForm(@ModelAttribute Employee emp) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deleteempform");
		// mv.addObject("user", usr);
		return mv;
	}

	// URL --- http://localhost:8080/deletemployee
	@RequestMapping(value = "/deletemployee", method = RequestMethod.POST)
	public ModelAndView deleteUserById(@ModelAttribute Employee emp) {
		String message = empService.deleteEmployee(emp.getEmpId());
		ModelAndView mv = new ModelAndView();
		if (message != null) {
			mv.addObject("success", message);
			mv.setViewName("deletesucess");
		} else {
			mv.addObject("notsuccess", "Employee with id " + emp.getEmpId() + " doesn't exists");
			mv.setViewName("notdeletesucess");
		}

		return mv;
	}
}
