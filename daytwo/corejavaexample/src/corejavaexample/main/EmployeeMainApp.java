package corejavaexample.main;

public class EmployeeMainApp {

	public static void main(String args[]) {
		
		//Creating an instance or an object using new keyword . 
		//new keyword invoke the constructor of the class of which we want object
		
		Department departmentIT = new Department();
		departmentIT.setDeptId(1);
		departmentIT.setDeptName("IT");

		Department departmentFinance = new Department();
		departmentFinance.setDeptId(2);
		departmentFinance.setDeptName("Finance");
		
		
		Address addressOne = new Address();
		addressOne.addressId="10A";
		addressOne.setCity("Kolkatta");
		addressOne.setStreet("MG Road");
		addressOne.setState("W. B.");
		addressOne.setHouseName("Sonar Bangla");
		
		Employee employeeOne = new Employee();
		employeeOne.setEmpId(11);
		employeeOne.setEmpName("Anjali Kumari");
		employeeOne.setSalary(155000.00);
		employeeOne.setAddress(addressOne);
		employeeOne.setDepartment(departmentFinance);
		
		//You can save above data in Database using JDBC or ORM framework
		//Here we are display the information on standard output console using System.out.println()
		System.out.println(employeeOne.getEmpName());
		
	}
}
