package jpaassociationandmapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpaassociationandmapping.onetoonebi.AddressBi;
import jpaassociationandmapping.onetoonebi.StudentBi;

public class OneToOneBiDemo {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaassociationandmapping");
		EntityManager em = emf.createEntityManager();
		
		StudentBi studentBi = new StudentBi();
		AddressBi homeAddressBi = new AddressBi();
		
		studentBi.setName("Suman Sarkar");
		homeAddressBi.setCity("Kolkatta");
		homeAddressBi.setState("West Bengal");
		homeAddressBi.setStreet("New Town");
		homeAddressBi.setZipCode("330001");
		
		//inject address into student
		studentBi.setAddressBi(homeAddressBi);
		homeAddressBi.setStudentBi(studentBi);
		em.getTransaction().begin();
		em.persist(studentBi);
		em.getTransaction().commit();
		
		/**
		Student student =em.find(Student.class, 2);
		System.out.println(student.getStudentId()+" , "+student.getName());
		System.out.println(student.getAddress().getCity());
		**/
	}	

}
