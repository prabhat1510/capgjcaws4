package jpawithgradle.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author UD SYSTEMS The class must be annotated with the
 *         javax.persistence.Entity annotation The class must have a public or
 *         protected no-argument constructor. The class may have other
 *         constructors The class must not be declared final. No methods or
 *         persistence instance variables must be declared final
 *
 *         By using @Entity annotation we are telling JPA runtime environment
 *         that Employee class is an entity class whose instance we will be
 *         persisting in the relation database table
 */
@Entity
@Table(name = "employee_master")
@NamedQuery(name="Employee.findByName",query="select emp from Employee emp where emp.empName LIKE :empName")
public class Employee {
	@Id
	@Column(name = "emp_id")
	private Integer empId; // persistent field

	@Column(name = "emp_name")
	private String empName; // persistent field

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}
