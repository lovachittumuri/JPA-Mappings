package com.cl.mappingproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cl.mappingproject.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
