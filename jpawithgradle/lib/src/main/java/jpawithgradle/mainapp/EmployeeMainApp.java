package jpawithgradle.mainapp;

import jpawithgradle.data.Employee;
import jpawithgradle.service.EmployeeService;
import jpawithgradle.service.EmployeeServiceImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		Employee employee = employeeService.getEmployee(5);
		System.out.println(employee);
		/**
		Employee emp = new Employee();
		emp.setEmpId(7);
		emp.setEmpName("Borris Johnson");
		//At this point of execution emp entity is in new state or transient state
		//employeeService.addEmployee(emp);
		//Delete an entity instance
		employeeService.deleteEmployee(emp);
		**/
		System.out.println(employeeService.getAllEmployee());
		System.out.println(employeeService.getEmployeeByName("Anjali Kumari"));
		//employeeService.deleteEmployeeById(6);
		//employee.setEmpName("Rajnath Singh");
		//Update employee using method which takes employee object as an argument or parameter
		//employeeService.updateEmployee(employee);
		
		//Update employee using method which takes id and name as an arguments
		//employeeService.updateEmployee(5,"Jyotiradtiya Scindhia");
		System.out.println(employeeService.getEmployeeUsingTypedQuery(5));
		System.out.println(employeeService.getEmployeesUsingTypedQuery());
	}

}
