package com.restfulapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restfulapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
