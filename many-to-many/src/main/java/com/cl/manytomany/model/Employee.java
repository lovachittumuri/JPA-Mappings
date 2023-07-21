package com.cl.manytomany.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long empId;

	String name;
	Long age;

	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name="employee_id"),inverseJoinColumns = @JoinColumn(name="project_id"))
	private Set<Project> assignedProjects = new HashSet<>();

		
	
}
