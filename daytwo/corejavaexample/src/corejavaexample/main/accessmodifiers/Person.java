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
	 * 
	 * Non-access modifiers - static, final,abstract,synchronized,volatile
	 */
	private String firstName;
	private String lastName;
	protected String address;
	public int age;
	long mobileNo;
	public static String salary;
	
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
	
	public static void display() {
		System.out.println("I am a static method present in Person class");
	}
	
}
