package com.cl.manytomany.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cl.manytomany.model.Employee;
import com.cl.manytomany.model.Project;
import com.cl.manytomany.repository.IEmployeeRepository;
import com.cl.manytomany.repository.IProjectRepository;

@RestController
public class HomeController {

	@Autowired
	IEmployeeRepository employeeRepository;

	@Autowired
	IProjectRepository projectRepository;

	@GetMapping("/")
	String home() {
		return "Good Morning Lova Chittumuri";
	}

	@PostMapping("/saveProjects")
	List<Project> saveProject(@RequestBody List<Project> projectsList) {
		List<Project> savedProjects = projectRepository.saveAll(projectsList);
		return savedProjects;
	}

	@GetMapping("/getProjects")
	List<Project> getProjects() {
		List<Project> savedProjects = projectRepository.findAll();
		return savedProjects;
	}

	@PostMapping("/saveEmployee")
	List<Employee> saveEmployee(@RequestBody List<Employee> employeeList) {
		List<Employee> savedEmployee = employeeRepository.saveAll(employeeList);
		return savedEmployee;
	}

	@GetMapping("/getAllEmployee")
	List<Employee> getAllEmployee() {
		List<Employee> empList = employeeRepository.findAll();
		return empList;
	}

	@PutMapping("/{empId}/project/{projectId}")
	Employee saveEmployeeData(@PathVariable Long empId, @PathVariable Long projectId) {
		Set<Project> projectSet = null;
		Employee employee = employeeRepository.findById(empId).get();
		Project project = projectRepository.findById(projectId).get();
		projectSet = employee.getAssignedProjects();
		projectSet.add(project);
		employee.setAssignedProjects(projectSet);
		return employeeRepository.save(employee);
	}
	
	@GetMapping("/getemp/{empId}")
	Employee getEmpData(@PathVariable Long empId) {
		Employee employee = employeeRepository.findById(empId).get();
		return employee;
	}

}
