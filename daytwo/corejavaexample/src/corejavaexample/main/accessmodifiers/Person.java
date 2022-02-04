package corejavaexample.main.accessmodifiers;

public class Person {
	/*
	 * Access Modifiers :- default , private, public, protected
	 * 
	 * private -  fields(or properties or attributes),methods or constructors declared private 
	 * 				cannot be accessed outside an enclosing class.
	 * 
	 * protected - can be accessed only child class in other packages.
	 * 
	 * default - within same package
	 */
	private String firstName;
	private String lastName;
	protected String address;
	public int age;
	long mobileNo;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
