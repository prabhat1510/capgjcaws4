package com.springmvcdatajpaapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcdatajpaapp.model.Employee;
import com.springmvcdatajpaapp.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	// Retrieve
	@GetMapping("/retrieveemployees")
	public ModelAndView getAllEmployees() {
		List<Employee> listOfEmployee = employeeService.getAllEmployees();
		Map employeeModel = new HashMap();
		/**
		 * Model model = null; model.addAttribute("listOfEmployee", listOfEmployee);
		 * return new ModelAndView("allemployee",model.asMap());
		 **/
		if (!listOfEmployee.isEmpty()) {
			employeeModel.put("listOfEmployee", listOfEmployee);
			return new ModelAndView("allemployee", employeeModel, HttpStatus.OK);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel, HttpStatus.NOT_FOUND);
		}

	}

	// GetEmployeeForm
	@GetMapping("/employee")
	public ModelAndView getEmployeeForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employeeform");
		return modelAndView;
	}

	// Create
	@PostMapping("/saveemployee")
	public ModelAndView addEmployee(Employee employee) {
		Employee emp = employeeService.addEmployee(employee);
		ModelAndView modelAndView;
		// Model in Spring Web MVC is a map
		Map messageModel = new HashMap();
		if (emp != null) {
			messageModel.put("emplData", emp);
			modelAndView = new ModelAndView("successWithData", messageModel);
		} else {
			messageModel.put("errormsg", "Unable to add employee");
			modelAndView = new ModelAndView("errorMsg", messageModel);
		}
		return modelAndView;
	}

	// Retrieve
	@GetMapping("/employeeById/{empId}")
	public ModelAndView getEmployeeById(@PathVariable Integer empId) {
		Employee employee = employeeService.getEmployeeById(empId);
		Map employeeModel = new HashMap();
		if (employee != null) {
			employeeModel.put("employee", employee);
			return new ModelAndView("employeedetails", employeeModel);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel);
		}
	}

	// Delete
	@GetMapping("/deleteemployeeById")
	public ModelAndView deleteEmployeeById(@RequestParam(value = "id") Integer empId) {
		Map model = new HashMap();
		if (employeeService.deleteEmployeeById(empId)) {
			model.put("deletemsg", "Employee deleted susccessfully");
			return new ModelAndView("successdelete", model);
		} else {
			model.put("message", "No employees found");
			return new ModelAndView("nodatafound", model);
		}

	}

	// GetEmployeeForm
	@GetMapping("/employeedeleteform")
	public ModelAndView getEmployeeDeleteForm(@ModelAttribute Employee employee) {
		ModelAndView modelAndView = new ModelAndView("employeeformdelete");
		return modelAndView;
	}

	// DeleteMapping annotation
	@DeleteMapping("/deleteemployee")
	public ModelAndView deleteEmployee(@ModelAttribute Employee employee) {
		Map model = new HashMap();
		if (employeeService.deleteEmployee(employee)) {
			model.put("deletemsg", "Employee deleted susccessfully");
			return new ModelAndView("successdelete", model);
		} else {
			model.put("message", "No employees found");
			return new ModelAndView("nodatafound", model);
		}
	}
	
	  //Update ---
	  //RequestMapping(value="/updateemployee",method=RequestMethod.POST) 
	  //@PutMapping("/updateemployee")
	  @PostMapping("/updateemployee")
	  public ModelAndView updateEmployee(Employee employee){ 
		  return modelAndView; 
	  }
	 
	
	@GetMapping("/employeeByName")
	public ModelAndView getEmployeeByName(@RequestParam(value="eName") String empName) {
		Employee employee = employeeService.getEmployeeByName(empName);
		Map employeeModel = new HashMap();
		if (employee != null) {
			employeeModel.put("employee", employee);
			return new ModelAndView("employeedetails", employeeModel);
		} else {
			employeeModel.put("message", "No employees found");
			return new ModelAndView("nodatafound", employeeModel);
		}
	}
}
