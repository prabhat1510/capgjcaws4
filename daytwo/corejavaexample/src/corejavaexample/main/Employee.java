package corejavaexample.main;

public class Employee {

	// int is a primitive data type , Integer is a wrapper classes for int
	private Integer empId;
	private String empName;
	private Double salary;
	//HAS-A
	//'address' is a property of an Employee class referring to Address class object
	private Address address;
	//HAS-A
	//'department' is a property of an Employee class referring to Department class object
	private Department department;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
