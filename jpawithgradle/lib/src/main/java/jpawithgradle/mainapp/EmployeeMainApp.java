package jpawithgradle.mainapp;

import jpawithgradle.data.Employee;
import jpawithgradle.service.EmployeeService;
import jpawithgradle.service.EmployeeServiceImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		Employee employee = employeeService.getEmployee(7);
		System.out.println(employee);
		
		Employee emp = new Employee();
		emp.setEmpId(7);
		emp.setEmpName("Borris Johnson");
		//At this point of execution emp entity is in new state or transient state
		//employeeService.addEmployee(emp);
		//Delete an entity instance
		employeeService.deleteEmployee(emp);
		

	}

}
