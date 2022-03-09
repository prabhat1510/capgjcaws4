package com.restfulapp.service;

import java.util.List;

import com.restfulapp.entity.Employee;
import com.restfulapp.exception.EmployeeNotFoundException;

public interface EmployeeService {

	void deleteEmployee(Long id);

	Employee replaceEmployee(Employee newEmployee, Long id);

	Employee one(Long id) throws EmployeeNotFoundException;

	Employee newEmployee(Employee newEmployee);

	List<Employee> all();

}
