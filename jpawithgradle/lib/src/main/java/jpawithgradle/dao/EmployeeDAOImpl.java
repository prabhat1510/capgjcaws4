package jpawithgradle.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

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
		//select alias from <enity_name> alias or object reference
		Query query = em.createQuery("SELECT emp.empName from Employee emp");
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

	@Override
	public void deleteEmployeeById(Integer empId) {
		em.getTransaction().begin();
		Query query = em.createQuery("delete from Employee emp where emp.empId=:empId");
		query.setParameter("empId", empId);
		int row = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println("Number of deleted row is ---"+row);
	}

	@Override
	public void updateEmployee(Employee employee) {
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE Employee emp  SET emp.empName =:empName where emp.empId=:empId");
		query.setParameter("empId", employee.getEmpId());
		query.setParameter("empName", employee.getEmpName());
		int row = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println("Number of updated row is ---"+row);
	}

	@Override
	public void updateEmployee(int id, String name) {
		em.getTransaction().begin();
		Query query = em.createQuery("UPDATE Employee emp  SET emp.empName =:empName where emp.empId=:empId");
		query.setParameter("empId", id);
		query.setParameter("empName", name);
		int row = query.executeUpdate();
		em.getTransaction().commit();
		System.out.println("Number of updated row is ---"+row);
		
	}

	@Override
	public Employee getEmployeeUsingTypedQuery(Integer empId) {
		TypedQuery<Employee> query = em.createQuery("SELECT emp from Employee emp where emp.empId=:empId",Employee.class);
		query.setParameter("empId", empId);
		return query.getSingleResult();
		
	}

	@Override
	public List<Employee> getEmployeesUsingTypedQuery() {
		TypedQuery<Employee> query =em.createQuery("SELECT emp from Employee emp", Employee.class);
		return query.getResultList();
	}
	
	

}
