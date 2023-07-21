package com.cl.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cl.manytomany.model.Employee;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {

}
