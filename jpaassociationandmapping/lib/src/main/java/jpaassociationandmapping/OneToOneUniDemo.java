package jpaassociationandmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.onotooneuni.Address;
import jpaassociationandmapping.onotooneuni.Student;

public class OneToOneUniDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		/**
		Student student = new Student();
		Address homeAddress = new Address();
		
		student.setName("Suman Sarkar");
		homeAddress.setCity("Kolkatta");
		homeAddress.setState("West Bengal");
		homeAddress.setStreet("New Town");
		homeAddress.setZipCode("330001");
		
		//inject address into student
		student.setAddress(homeAddress);
		
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		**/
		
		Student student =em.find(Student.class, 2);
		System.out.println(student.getStudentId()+" , "+student.getName());
		System.out.println(student.getAddress().getCity());
	}	

}
