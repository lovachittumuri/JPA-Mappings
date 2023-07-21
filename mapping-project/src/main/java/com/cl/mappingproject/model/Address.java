package com.cl.mappingproject.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Address  implements Serializable  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long addressId;

	String city;
	Long pincode;

	//@OneToOne(mappedBy = "address")
	//private Employee employee;

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
