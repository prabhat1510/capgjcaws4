package com.httpentityexample.service;

import java.util.List;

import com.httpentityexample.entities.Student;
import com.httpentityexample.exception.StudentNotFoundException;

public interface StudentService {

		public List<Student> retrieveAllStudent();
		
		public Student createStudentDetail(Student student);
		
		public Student retrieveStudentById(Integer studentId) throws StudentNotFoundException;
		
		public void deleteStudentById(Integer studentId);
		
		public Student updateStudentDetails(Student newStudent,Integer studentId);
}
