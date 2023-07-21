package com.cl.mappingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cl.mappingproject.model.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Long> {

}
