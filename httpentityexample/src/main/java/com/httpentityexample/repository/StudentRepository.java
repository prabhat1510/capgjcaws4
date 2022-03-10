package com.httpentityexample.repository;

import org.springframework.data.repository.CrudRepository;

import com.httpentityexample.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
