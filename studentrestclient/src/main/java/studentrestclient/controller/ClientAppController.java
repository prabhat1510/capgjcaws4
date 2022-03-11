package studentrestclient.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import studentrestclient.model.Student;

@RestController
public class ClientAppController {
	@Autowired
	RestTemplate restTemplate;
	
	//Get API
	@GetMapping("all-students")
	public ResponseEntity<List<Student>> getAllStudents(){
		Student[] objects = restTemplate.getForObject("http://localhost:8081/student/students", Student[].class);
		
		return new ResponseEntity<>(Arrays.asList(objects),HttpStatus.OK);
	}
	
	@GetMapping("student/{id}")
	public ResponseEntity<Student> retrieveStudentById(@PathVariable(value="id") Integer studentId){
		Student student = restTemplate.getForObject("http://localhost:8081/student/"+studentId, Student.class);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
}
