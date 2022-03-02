package jpawithgradle.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name="getAllBooks",query="SELECT book FROM Book book"),
@NamedQuery(name="getBookByAuthor",query="SELECT book FROM Book book where book.author=:author"),
@NamedQuery(name="getBookByTitle",query="SELECT book FROM Book book where book.bookTitle=:bookTitle")})
public class Book {
	@Id
	private Long id;
	private String bookTitle;
	private String author;
	private Double price;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookTitle=" + bookTitle + ", author=" + author + ", price=" + price + "]";
	}

}
