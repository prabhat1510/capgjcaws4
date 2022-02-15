package hrmsapp.dao;

import hrmsapp.data.Employee;

public interface EmployeeDAO {
	public String addEmployeeDetails(Employee employee);

	public Employee getEmployeeById(Integer employeeId);
}
