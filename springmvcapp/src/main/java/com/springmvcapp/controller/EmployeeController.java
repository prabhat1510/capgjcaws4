package com.springmvcapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcapp.model.Employee;
import com.springmvcapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employService;

	@RequestMapping("/employees") // Default HTTP get method will be handled here
	public ModelAndView getEmployees() {
		Map model = new HashMap();
		// Get data or mode from service layer
		List<Employee> emp = employService.getEmployees();
		model.put("emps", emp);
		ModelAndView modelAndView = new ModelAndView("employee", model);
		return modelAndView;
	}

	/**
	 * 
	 * We are explicitly declaring that getAllEmployees method will handle the http
	 * get request from url http://localhost:8080/allemployees
	 */
	@RequestMapping(value = "/allemployees", method = RequestMethod.GET)
	public ModelAndView getAllEmployees() {
		Map employeeModel = new HashMap();
		List<Employee> empList = employService.getAllEmployees();
		employeeModel.put("empList", empList);
		ModelAndView modelAndView = new ModelAndView("allemployee", employeeModel);
		return modelAndView;
	}

	// This annotation is a shortcut for the line number 36
	@GetMapping("/employes")
	public ModelAndView getAllEmployes() {
		Map employeeModel = new HashMap();
		List<Employee> empList = employService.getAllEmployees();
		employeeModel.put("empList", empList);
		ModelAndView modelAndView = new ModelAndView("allemployee", employeeModel);
		return modelAndView;
	}

	/**
	 * //@PostMapping("/addEmployee") public ModelAndView addEmployee(@RequestParam
	 * Employee employee) {
	 * 
	 * }
	 **/
	/**
	 * @RequestMapping(value="/allemployees",method=RequestMethod.POST) public
	 *                                                                  ModelAndView
	 *                                                                  addEmployee(@RequestParam
	 *                                                                  Employee
	 *                                                                  employee) {
	 * 
	 *                                                                  }
	 **/
	// Below Method receives data from URL
	// http://localhost:8080/addEmployee/21/Jyotika
	@GetMapping("/addEmployee/{empId}/{empName}")
	public ModelAndView addEmployeeUsingPathVariable(@PathVariable Integer empId, @PathVariable String empName) {
		// Created an employee object- by calling or invoking the Employee()
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);

		Boolean isEmployeeAdded = employService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("successmsg", "Employee added successfully");
			modelAndView = new ModelAndView("success", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// Below Method receives data from URL as parameter in the form key value pair
	// http://localhost:8080/addEmployee?id=21&name=Jyotika
	// http://localhost:8080/addEmployee?query string parameters
	@GetMapping("/addEmployee")
	public ModelAndView addEmployeeReceiveDataUsingRequestParam(@RequestParam(value = "id") Integer empId,
			@RequestParam(value = "name") String empName) {
		// Created an employee object- by calling or invoking the Employee()
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);

		Boolean isEmployeeAdded = employService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("successmsg", "Employee added successfully");
			modelAndView = new ModelAndView("success", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// URL- http://localhost:8080/employee
	@GetMapping("/employee")
	public ModelAndView getEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("addemployee");
		return modelAndView;
	}

	//RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	@PostMapping("/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute Employee employee){
		Boolean isEmployeeAdded = employService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (isEmployeeAdded) {
			messageModel.put("emplData", employee);
			modelAndView = new ModelAndView("successWithData", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

}
