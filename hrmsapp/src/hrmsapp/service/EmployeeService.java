package hrmsapp.service;

import hrmsapp.data.Employee;

public interface EmployeeService {
	
	public String addEmployeeDetails(Employee employee);
	public Employee getEmployeeById(Integer employeeId);
}
