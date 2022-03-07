package com.springmvcdatajpaapp.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springmvcdatajpaapp.model.Employee;
/**
 * 
 * @author UD SYSTEMS
 * Spring Data JPA focuses on using JPA to store data in a Relational DB.
 * Its most compelling feature is the ability to create repository implementations automatically,
 * at runtime, from a repository interface
 */

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

	@Query("FROM Employee e where e.empName=:eName")
	Employee findEmployeeByName(@Param("eName") String empName);
	
	@Modifying
	@Query("update Employee e set e.empName=:empName where e.empId=:empId")
	Integer updateEmployee(@Param("empId") Integer empId,@Param("empName") String empName);

}
