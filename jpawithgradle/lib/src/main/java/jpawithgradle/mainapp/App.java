package jpawithgradle.mainapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpawithgradle.data.Employee;

public class App {

	public static void main(String[] args) {
		Employee employee = new Employee();
		//Department department = new Department();
		//Location location = new Location();
		
		employee.setEmpId(1);
		employee.setEmpName("Anjali Kumari");
		/**
		location.setCity("Bengaluru");
		location.setLocatioId(1);
		department.setDeptId(1);
		department.setDeptName("Marketing");
		**/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(employee); //Inserting data in database using persist method of EntityManager
		em.getTransaction().commit();
		
	}

}
