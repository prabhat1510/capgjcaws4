package jpaassociationandmapping.stc;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee_stc")
//Following annotation must be written only in parent class
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//Following is additional column to parent and child
@DiscriminatorColumn(name="emp_type",discriminatorType = DiscriminatorType.STRING)
//parent rows will have this value Discriminator column
@DiscriminatorValue("EMP")
public class EmployeeSTC {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	private String name;
	private Double salary;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSTC [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
