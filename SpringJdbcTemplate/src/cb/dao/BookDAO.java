package cb.dao;

import cb.beans.Book;;

public interface BookDAO {
	
	public int addBook(Book book);
	public int updateBook(long isdn, int price);
	public boolean deleteBook(long isdn);

}
