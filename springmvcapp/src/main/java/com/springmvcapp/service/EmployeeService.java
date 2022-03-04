package com.springmvcapp.service;

import java.util.List;

import com.springmvcapp.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getEmployees();
	public List<Employee> getAllEmployees();
	public Boolean addEmployee(Employee employee);
}
