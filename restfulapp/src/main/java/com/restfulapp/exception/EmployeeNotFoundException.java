package com.restfulapp.exception;

public class EmployeeNotFoundException extends Exception{
	String message;
	Long id;
	public EmployeeNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public EmployeeNotFoundException(Long id) {
		super("Could not find employee "+id);
	}
}
