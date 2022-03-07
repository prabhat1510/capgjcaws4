package com.springmvcdatajpaapp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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

		//Retrieve
		@GetMapping("/retrieveemployees")
		public ModelAndView getAllEmployees(){
			List<Employee> listOfEmployee= employeeService.getAllEmployees();
			Map employeeModel = new HashMap();
			if(!listOfEmployee.isEmpty()) {
				employeeModel.put("listOfEmployee", listOfEmployee);
				return new ModelAndView("allemployee",employeeModel);
			}else {
				employeeModel.put("message","No employees found");
				return new ModelAndView("nodatafound",employeeModel);
			}
					
		}
		/**
		//Create
		@PostMapping("/addemployee")
		public ModelAndView addEmployee(Employee employee){
			return modelAndView;
		}**/
		//Retrieve
		@GetMapping("/employeeById/{empId}")
		public ModelAndView getEmployeeById(@PathVariable Integer empId){
			Employee employee= employeeService.getEmployeeById(empId);
			Map employeeModel = new HashMap();
			if(employee != null) {
				employeeModel.put("employee", employee);
				return new ModelAndView("employeedetails",employeeModel);
			}else {
				employeeModel.put("message","No employees found");
				return new ModelAndView("nodatafound",employeeModel);
			}
		}
		/**
		//Delete
		@GetMapping("/deleteemployeeById")
		public ModelAndView deleteEmployeeById(@RequestParam(value="id") Integer empId){
			return modelAndView;
		}
		//DeleteMapping annotation
		@DeleteMapping("/deleteemployee")
		public ModelAndView deleteEmployee(@ModelAttribute Employee employee){
			return modelAndView;
		}
		
		//Update --- RequestMapping(value="/updateemployee",method=RequestMethod.POST)
		@PostMapping("/updateemployee")
		public ModelAndView updateEmployee(Employee employee){
			return modelAndView;
		}
		**/
}
