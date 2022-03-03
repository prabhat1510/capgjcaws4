package springexamplesusingannotation.model;

import org.springframework.stereotype.Component;

@Component("person")
public class Person {
	private Long adharCardNumber;
	private String personName;
	private Address residentialAddress;
	private Address permanentAddress;
	
	
	public Person(Long adharCardNumber, String personName, Address residentialAddress, Address permanentAddress) {
		this.adharCardNumber = adharCardNumber;
		this.personName = personName;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Long getAdharCardNumber() {
		return adharCardNumber;
	}
	public void setAdharCardNumber(Long adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	
}
