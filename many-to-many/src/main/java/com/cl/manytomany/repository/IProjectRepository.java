package com.cl.manytomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cl.manytomany.model.Project;

@Repository
public interface IProjectRepository extends JpaRepository<Project, Long> {

}
