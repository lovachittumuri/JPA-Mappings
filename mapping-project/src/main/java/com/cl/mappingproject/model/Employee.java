package com.cl.mappingproject.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long empId;

	String name;
	Long age;


	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "addressId")
	//private Address address;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId",referencedColumnName = "empId")
	private List<Address> address;
	
	
	
	
}
