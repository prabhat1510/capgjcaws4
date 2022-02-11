package dayseven.functionalinterface.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class EmployeeSupplierDemo {

	public static void main(String[] args) {
		//passing contructor reference to supplier factory
		Employee emp = supplierFactory(Employee::new);
		System.out.println(emp);
		
		Employee emp1 = supplierFactory(()->new Employee("Rakesh"));
		System.out.println(emp1);
	}

	public static Employee supplierFactory(Supplier<? extends Employee> s) {
		Employee employee= s.get();
		if(employee.getName() == null || "".equals(employee.getName())) {
			employee.setName("default");
		}
		employee.setSalary(BigDecimal.ONE);
		employee.setStartDate(LocalDate.of(2016, 10, 15));
		return employee;
	}
}
