package hrmsapp.dao;

import java.util.ArrayList;
import java.util.List;

import hrmsapp.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public String addEmployeeDetails(Employee employee) {
			employeeList.add(employee);
			
			if(employeeList.contains(employee)) {
				return "Employee added successfully";
				
			}else {
				return "Employee not added";
			}
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		for(Employee employee:employeeList) {
			if(employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return null;
	}

}
