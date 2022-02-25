package jpawithgradle.service;

import jpawithgradle.data.Employee;

public interface EmployeeService {
	//Retrieve data
	public Employee getEmployee(Integer empId);
	//Create data or insert data
	public void addEmployee(Employee employee);
	
	//Delete data
	public void deleteEmployee(Employee employee);
}
