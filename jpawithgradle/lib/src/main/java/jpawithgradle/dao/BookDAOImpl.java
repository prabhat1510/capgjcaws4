package jpawithgradle.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import jpawithgradle.data.Book;

public class BookDAOImpl implements BookDAO{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpawithgradle");
	EntityManager em = emf.createEntityManager();
	@Override
	public List<Book> getAllBooks() {
		TypedQuery<Book> query = em.createNamedQuery("getAllBooks",Book.class);
		List<Book> results = query.getResultList();
		//return query.getResultList();
		return results;
	}

	@Override
	public List<Book> getBookByAuthor(String author) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByAuthor",Book.class);
		query.setParameter("author", author);
		List<Book> results = query.getResultList();
		return results;
	}

	@Override
	public Book getBookByTitle(String title) {
		TypedQuery<Book> query = em.createNamedQuery("getBookByTitle",Book.class);
		query.setParameter("bookTitle", title);
		Book result = query.getSingleResult();
		return result;
	}
	@Override
	public void addBook(Book book) {
		//Inserting data in database using persist method of EntityManager
				em.getTransaction().begin();
				em.persist(book); 
				em.getTransaction().commit();
	}

}
