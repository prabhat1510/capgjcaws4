package dayseven.stream;

public class Employee {
	private Integer empId;
	private String empName;
	private double salary;
	private String department;
	
	public Employee(Integer empId, String empName, double salary, String department) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.department = department;
	}

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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
	}
	
	
}
