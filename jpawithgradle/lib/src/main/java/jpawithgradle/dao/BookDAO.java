package jpawithgradle.dao;

import java.util.List;

import jpawithgradle.data.Book;

public interface BookDAO {
	public List<Book> getAllBooks();
	public List<Book> getBookByAuthor(String author);
	public Book getBookByTitle(String title);
	public void addBook(Book book);
}
