package jpawithgradle.service;

import jpawithgradle.dao.EmployeeDAO;
import jpawithgradle.dao.EmployeeDAOImpl;
import jpawithgradle.data.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	 private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	@Override
	public Employee getEmployee(Integer empId) {
			
		return employeeDAO.getEmployee(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeDAO.addEmployee(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeDAO.deleteEmployee(employee);

	}

}
