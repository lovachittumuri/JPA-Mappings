package com.cl.mappingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl.mappingproject.model.Employee;
import com.cl.mappingproject.repository.IEmployeeRepository;

@RestController
public class HomeController {
	
	@Autowired
	IEmployeeRepository repository;
	

	@GetMapping("/")
	String home() {
		return "Good Morning Lova Chittumuri";
	}

	
	//one to one Mapping
	@PostMapping("/saveEmployee")
	List<Employee> saveEmployee(@RequestBody List<Employee> employee) {
		List<Employee>  employeeList = repository.saveAll(employee);
		return employeeList;
	}
	
	@GetMapping("/getEmplist")
	List<Employee> getEmplist() {
		List<Employee>  employeeList = repository.findAll();
		return employeeList;
	}


	
	
	
}
