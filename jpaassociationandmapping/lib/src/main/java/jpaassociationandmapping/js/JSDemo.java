package jpaassociationandmapping.js;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.tpc.EmployeeTPC;
import jpaassociationandmapping.tpc.ManagerTPC;

public class JSDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		EmployeeJS e1 = new EmployeeJS();
		e1.setName("Smith");
		e1.setSalary(67865.50);
		
		ManagerJS m1 =new ManagerJS();
		m1.setDepartmentName("Accounts");
		m1.setName("Ravi Kumar");
		m1.setSalary(123456.00);
		
		em.getTransaction().begin();
		em.persist(e1);
		em.persist(m1);
		em.getTransaction().commit();

	}

}
