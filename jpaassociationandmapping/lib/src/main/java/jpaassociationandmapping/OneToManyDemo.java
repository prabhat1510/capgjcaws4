package jpaassociationandmapping;

import java.util.Iterator;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.onetomany.Department;
import jpaassociationandmapping.onetomany.Employee;

public class OneToManyDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		/**
		Department department = new Department();
		department.setDeptName("MARKETING");
		department.setLocation("NEW DELHI");
		EmployeeSTC emp1 = new EmployeeSTC();
		emp1.setDepartment(department);
		emp1.setEmpName("Amisha Patel");
		emp1.setHireDate(new Date());
		
		EmployeeSTC emp2 = new EmployeeSTC();
		emp2.setDepartment(department);
		emp2.setEmpName("Krutika");
		emp2.setHireDate(new Date());
		
		
		em.getTransaction().begin();
		em.persist(emp1);
		em.persist(emp2);
		em.getTransaction().commit();
		**/
		em.getTransaction().begin();
		Department dept = em.find(Department.class,2);
		Set<Employee> employees = dept.getEmployees();
		
		em.getTransaction().commit();
		//employees.stream().forEach(System.out::println);
		Iterator<Employee> iterator = employees.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			System.out.println(e.getEmpNo()+" , "+e.getEmpName());
		}
		employees.forEach(System.out::println);
	}

}
