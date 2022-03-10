package com.restclientapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.restclientapp.model.Student;

@RestController
public class ClientAppController {
	@Autowired
	RestTemplate restTemplate;
	
	//Get API
	@GetMapping("all-students")
	public ResponseEntity<List<Student>> getAllStudents(){
		Student[] studentArray = restTemplate.getForObject("/student/students", Student[].class);
		return new ResponseEntity<>(Arrays.asList(studentArray),HttpStatus.OK);
		
	}
}
