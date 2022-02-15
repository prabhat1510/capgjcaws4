package hrmsapp.service;

import hrmsapp.dao.EmployeeDAO;
import hrmsapp.dao.EmployeeDAOImpl;
import hrmsapp.data.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	@Override
	public String addEmployeeDetails(Employee employee) {
		String message = employeeDAO.addEmployeeDetails(employee);
		return message;
	}
	@Override
	public Employee getEmployeeById(Integer employeeId) {
		
		return employeeDAO.getEmployeeById(employeeId);
	}

}
