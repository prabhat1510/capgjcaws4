package com.httpentityexample.exception;

public class StudentNotFoundException extends Exception{
	String message;
	Integer studentId;
	public StudentNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public StudentNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	public StudentNotFoundException(Integer studentId) {
		super("Student not found with id ---"+studentId);
		// TODO Auto-generated constructor stub
	}
}
