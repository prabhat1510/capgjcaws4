package jpawithgradle.mainapp;

import jpawithgradle.data.Book;
import jpawithgradle.service.BookService;
import jpawithgradle.service.BookServiceImpl;

public class BookMainApp {

	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		/**
		Book book = new Book();
		book.setId(1L);
		book.setAuthor("Chetan Bhagat");
		book.setBookTitle("ABCD");
		book.setPrice(1555.55);
		
		Book book2 = new Book();
		book2.setId(2L);
		book2.setAuthor("Amish Trivedi");
		book2.setBookTitle("ABCDEFGH");
		book2.setPrice(555.55);
		
		Book book3 = new Book();
		book3.setId(3L);
		book3.setAuthor("Amish Trivedi");
		book3.setBookTitle("Shiva");
		book3.setPrice(455.55);
		
		Book book4 = new Book();
		book4.setId(4L);
		book4.setAuthor("Robert C Martin");
		book4.setBookTitle("Clean Code");
		book4.setPrice(655.55);
		
		
		bookService.addBook(book);
		bookService.addBook(book2);
		bookService.addBook(book3);
		bookService.addBook(book4);
		**/
		System.out.println(bookService.getAllBooks());
		System.out.println(bookService.getBookByAuthor("Amish Trivedi"));
		System.out.println(bookService.getBookByTitle("Clean Code"));
	}

}
