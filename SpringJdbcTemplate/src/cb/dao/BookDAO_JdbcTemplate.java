package cb.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;




@Repository(value = "brb")
public class BookDAO_JdbcTemplate implements BookDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public int addBook(cb.beans.Book book) {
		int rows = 0;
		String INSERT_BOOK = "insert into book values(?, ?, ?, ?, ?, ?)";
		
		rows = jdbcTemplate.update(INSERT_BOOK , book.getIsdn() , book.getBookName() , book.getPublication() ,
				book.getPrice() , book.getDescription() , book.getAuthor());
		return rows;
		
	}
	
	@Override
	public int updateBook(long isdn , int price) {
		int rows = 0;
		String Update_Book = "update book set price = ? where isdn = ?";
		
		rows = jdbcTemplate.update(Update_Book , price , isdn);
		return rows;
	}
	
	@Override
	public boolean deleteBook(long isdn) {
		int rows = 0 ;
		boolean flag = false;
		String Delete_Book = "delete from book where isdn=?";
		
		rows = jdbcTemplate.update(Delete_Book , isdn);
		if (rows > 0) {
			flag = true ;
		
		}
		return flag;
	}


	

}
