package com.lm;

import org.springframework.beans.factory.annotation.Autowired;


public class Employee {
	private String empName;
	//@Autowired
	private Address address;
	
//	@Autowired
//	private Address address2;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
