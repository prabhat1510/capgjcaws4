package com.springmvcdatajpaapp.service;

import java.util.List;

import com.springmvcdatajpaapp.model.Employee;

public interface EmployeeService {
	//Retrieve
	public List<Employee> getAllEmployees();
	//Create
	public Employee addEmployee(Employee employee);
	//Retrieve
	public Employee getEmployeeById(Integer empId);
	
	//Delete
	public Boolean deleteEmployeeById(Integer empId);
	public Boolean deleteEmployee(Employee employee);
	
	//Update
	public Boolean updateEmployee(Employee employee);
}
