package jpawithgradle.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	@Override
	public List<Employee> getAllEmployee() {
		//select * from employee -- SQL statement
		//SELECT emp from Employee emp -- Java Persistence Query
		//select alias from <enity_name> alias
		Query query = em.createQuery("SELECT emp from Employee emp");
		List<Employee> listOfEmployee = query.getResultList();
		return listOfEmployee;
	}

	@Override
	public Employee getEmployeeByName(String empName) {
		//select * from employee where empName="" --- sql statement
		Query query = em.createNamedQuery("Employee.findByName");
		query.setParameter("empName", empName);
		
		return (Employee) query.getSingleResult();
	}
	
	

}
