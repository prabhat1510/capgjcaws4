package jpawithgradle.service;

import java.util.List;

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

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDAO.getAllEmployee();
	}


	@Override
	public Employee getEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeByName(empName);
	}

	@Override
	public void deleteEmployeeById(Integer empId) {
		employeeDAO.deleteEmployeeById(empId);;
		
	}

	@Override
	public void updateEmployee(Employee employee) {
	employeeDAO.updateEmployee(employee);
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		employeeDAO.updateEmployee(id,name);
		
	}

	@Override
	public Employee getEmployeeUsingTypedQuery(Integer empId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeeUsingTypedQuery(empId);
	}

	@Override
	public List<Employee> getEmployeesUsingTypedQuery() {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployeesUsingTypedQuery();
	}

}
