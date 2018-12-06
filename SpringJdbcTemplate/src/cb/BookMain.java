package cb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cb.beans.Book;
import cb.dao.BookDAO;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("connection.xml");
		BookDAO bookDAO = (BookDAO) context.getBean("brb");


		//add book
		int rows = bookDAO.addBook(new Book(7777777,"Java for faggots" , "Pakt de" , 40 , "Explore java" ,"Gv"));

		if (rows >0) {
			System.out.println("BOOK INSERT");	
		}else
			System.out.println("Sorry error");


		//update the book
		rows = bookDAO.updateBook(7777777, 105 );
		if (rows >0) {
			System.out.println("BOOK update");	
		}else
			System.out.println("Sorry no update");

		//delete book
		boolean deleted = bookDAO.deleteBook(7777777);
		if (deleted) {
			System.out.println("BOOK deleted");	
		}else
			System.out.println("Sorry no delted");


	}

}
