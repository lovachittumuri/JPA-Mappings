package com.cl.manytomany.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Project implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long projectId;

	private String projectName;

	@JsonIgnore
	@ManyToMany(mappedBy = "assignedProjects")
	private Set<Employee> employeeSet = new HashSet<>();
}
