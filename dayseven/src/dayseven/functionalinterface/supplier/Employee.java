package dayseven.functionalinterface.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
	private String name;
	private BigDecimal salary;
	private LocalDate startDate;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name) {
		this.name=name;
	}
	public Employee(String name, BigDecimal salary, LocalDate startDate) {
		this.name = name;
		this.salary = salary;
		this.startDate = startDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", startDate=" + startDate + "]";
	}
	
}
