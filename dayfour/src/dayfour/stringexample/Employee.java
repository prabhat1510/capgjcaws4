package dayfour.stringexample;

import java.util.Objects;

public class Employee {
		private Integer empId;
		private String firstName;
		private String lastName;
		private String department;
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
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
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(empId, firstName, lastName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee e = (Employee) obj;
			/**
			return Objects.equals(department, other.department) && Objects.equals(empId, other.empId)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);
			**/
			return (this.getEmpId() == e.getEmpId());
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
					+ department + "]";
		}
		
		
}
