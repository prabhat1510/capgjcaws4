package com.restfulapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restfulapp.entity.Employee;
import com.restfulapp.exception.EmployeeNotFoundException;
import com.restfulapp.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository repository;
	@Override
	public void deleteEmployee(Long id) {
		repository.deleteById(id);

	}

	@Override
	public Employee replaceEmployee(Employee newEmployee, Long id) {
		return repository.findById(id)
			      .map(employee -> {
			        employee.setName(newEmployee.getName());
			        employee.setRole(newEmployee.getRole());
			        return repository.save(employee);
			      })
			      .orElseGet(() -> {
			        newEmployee.setId(id);
			        return repository.save(newEmployee);
			      });
	}

	//Single employee
	@Override
	public Employee one(Long id) throws EmployeeNotFoundException {
		 return repository.findById(id)
			      .orElseThrow(() -> new EmployeeNotFoundException(id));
	}

	@Override
	public Employee newEmployee(Employee newEmployee) {
		return repository.save(newEmployee);
	}

	@Override
	public List<Employee> all() {
		return repository.findAll();
	}

}
