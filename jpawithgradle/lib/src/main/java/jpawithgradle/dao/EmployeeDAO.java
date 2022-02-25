package jpawithgradle.dao;

import jpawithgradle.data.Employee;

public interface EmployeeDAO {

	// Retrieve data
	public Employee getEmployee(Integer empId);

	// Create data or insert data
	public void addEmployee(Employee employee);

	// Delete data
	public void deleteEmployee(Employee employee);

}
