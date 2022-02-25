package jpawithgradle.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpawithgradle.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();

	@Override
	public Employee getEmployee(Integer empId) {
		
		//Retrieving data in database using find method of EntityManager
		
		em.getTransaction().begin();
		Employee employee =em.find(Employee.class,empId); 
		em.getTransaction().commit();
		return employee;
	}

	@Override
	public void addEmployee(Employee employee) {
		//Inserting data in database using persist method of EntityManager
		em.getTransaction().begin();
		em.persist(employee); 
		em.getTransaction().commit();
		
	}

	@Override
	public void deleteEmployee(Employee employee) {
		//Delete data in database using remove method of EntityManager
		
		em.getTransaction().begin();
		Employee emp = em.find(Employee.class, employee.getEmpId());
		if(emp !=null) {
			em.remove(emp); 
		}
		em.getTransaction().commit();
		
	}

}
