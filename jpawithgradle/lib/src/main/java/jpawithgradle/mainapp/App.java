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
		
		employee.setEmpId(6);
		employee.setEmpName("Imran Khan");
		/**
		location.setCity("Bengaluru");
		location.setLocatioId(1);
		department.setDeptId(1);
		department.setDeptName("Marketing");
		**/
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
		EntityManager em = emf.createEntityManager();
		//Inserting data in database using persist method of EntityManager
		
		em.getTransaction().begin();
		em.persist(employee); 
		em.getTransaction().commit();
		//Retrieve employee data from database relational table
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class, 15);
		System.out.println(emp);
		em.getTransaction().commit();
		//emp1 is entity just initialized. not available in the Persistence Context
		Employee emp1 = new Employee();
		emp1.setEmpId(15);
		emp1.setEmpName("Rakesh Kumar"); 
		//Till this stage entity emp1 is in New/Transient state 
		//in persistence life cycle of an entity
		em.getTransaction().begin();
		em.persist(emp1);
		em.getTransaction().commit();
		//After execution of above line emp1 entity has a 
		//database representation so now the entity emp1 is a managed entity
		
		//Remove the object from db relational table
		em.getTransaction().begin();
		em.remove(emp1);//We are deleting the managed entity emp1 from table
		em.getTransaction().commit();
		
		
		
		
	}

}
