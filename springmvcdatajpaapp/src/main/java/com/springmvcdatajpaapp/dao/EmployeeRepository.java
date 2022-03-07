package com.springmvcdatajpaapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.springmvcdatajpaapp.model.Employee;
/**
 * 
 * @author UD SYSTEMS
 * Spring Data JPA focuses on using JPA to store data in a Relational DB.
 * Its most compelling feature is the ability to create repository implementations automatically,
 * at runtime, from a repository interface
 */

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

}
