package jpaassociationandmapping.onetoonebi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import jpaassociationandmapping.onotooneuni.Address;

@Entity
@Table(name="student_bi")
public class StudentBi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	

	private String name;
	//Student class has an Address - HAS A relationship
	//One to one uni
	@OneToOne(cascade=CascadeType.ALL)
	private AddressBi addressBi;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressBi getAddressBi() {
		return addressBi;
	}

	public void setAddressBi(AddressBi addressBi) {
		this.addressBi = addressBi;
	}

	@Override
	public String toString() {
		return "StudentBi [studentId=" + studentId + ", name=" + name + ", addressBi=" + addressBi + "]";
	}
	
	
}
