package com.httpentityexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.httpentityexample.entities.Student;
import com.httpentityexample.exception.StudentNotFoundException;
import com.httpentityexample.service.StudentService;
// http://localhost:8080/student/students
@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> retrieveAllStudent(){
		return new ResponseEntity<>(studentService.retrieveAllStudent(),HttpStatus.FOUND);
	}
	@PostMapping("/newstudent")
	public ResponseEntity<Student> createStudentDetail(@RequestBody Student student) {
		return  new ResponseEntity<>(studentService.createStudentDetail(student),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable(value="id") Integer studentId) throws StudentNotFoundException{
		return new ResponseEntity<>(studentService.retrieveStudentById(studentId),HttpStatus.OK);
	}

}
