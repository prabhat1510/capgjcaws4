package hrmsapp.presentation;

import java.time.LocalDate;

import hrmsapp.data.Employee;
import hrmsapp.data.Holiday;
import hrmsapp.exceptions.HolidayNotAddedException;
import hrmsapp.exceptions.HolidayNotFoundException;
import hrmsapp.service.EmployeeService;
import hrmsapp.service.EmployeeServiceImpl;
import hrmsapp.service.HolidayService;
import hrmsapp.service.HolidayServiceImpl;

public class HRMSUI {

	public static void main(String[] args) {
		Employee employee = new Employee(1,"Jyotika","IT");
		Employee employee1 = new Employee(2,"Piyusha","Finance");
		Employee employee3 = new Employee(3,"Aparna","Marketing");
		//Add the employee details in the system
		EmployeeService employeeService = new EmployeeServiceImpl();
		String message = employeeService.addEmployeeDetails(employee);
		System.out.println(message);
		
		Employee emp = employeeService.getEmployeeById(employee.getEmployeeId());
		System.out.println(emp);
		
		Holiday holiday = new Holiday(1, "Holi", "National", LocalDate.of(2022, 03, 28));
		Holiday holiday1 = new Holiday(2, "MahaShivratri", "Restricted", LocalDate.of(2022, 02, 27));
		
		HolidayService holidayService = new HolidayServiceImpl();
		try {
			holidayService.addHoliday(holiday1);
			holidayService.addHoliday(holiday);
		} catch (HolidayNotAddedException e) {
			
			e.getMessage();
		}
		
		
		try {
			System.out.println(holidayService.getAllHoliday());
		} catch (HolidayNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
