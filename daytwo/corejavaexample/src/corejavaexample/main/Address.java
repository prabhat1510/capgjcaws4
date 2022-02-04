package corejavaexample.main;

/**
 * 
 * @author UD SYSTEMS 
 * Java Beans are Java Classes that have properties
 *
 */
public class Address {
	// Porperties are private so these properties will be accessible outside the class through methods
	private String city;
	private String street;
	private String houseName;
	private String state;
	private String country;
	public String addressId;

	//Method that retrieve a property's value are called getter methods
	public String getCity() {
		return city;
	}

	//Method that change a property's value are called setter methods
	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
