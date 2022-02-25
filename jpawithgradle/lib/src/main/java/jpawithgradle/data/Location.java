/**
package jpawithgradle.data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	private Integer locatioId;
	private String city;
	public Location() {
		// TODO Auto-generated constructor stub
	}
	public Integer getLocatioId() {
		return locatioId;
	}
	public void setLocatioId(Integer locatioId) {
		this.locatioId = locatioId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Location [locatioId=" + locatioId + ", city=" + city + "]";
	}
	
}
**/