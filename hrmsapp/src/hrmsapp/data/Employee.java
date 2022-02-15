package hrmsapp.data;

public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private String department;
	public Employee(Integer employeeId, String employeeName, String department) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	
	
	

}
