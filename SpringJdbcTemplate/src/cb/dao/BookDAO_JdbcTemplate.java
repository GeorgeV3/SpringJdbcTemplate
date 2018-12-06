package cb.dao;



import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


@Repository(value = "brb")
public class BookDAO_JdbcTemplate implements BookDAO {
	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedTemplate;
	
	
	@Override
	public int addBook(cb.beans.Book book) {
		int rows = 0;
//		String INSERT_BOOK = "insert into book values(?, ?, ?, ?, ?, ?)";
//		
//		rows = jdbcTemplate.update(INSERT_BOOK , book.getIsdn() , book.getBookName() , book.getPublication() ,
//				book.getPrice() , book.getDescription() , book.getAuthor());
		
		String INSERT_BOOK = "insert into book values (:isdn, :bookName, :publication , :price , :description , :author)";
		java.util.Map<String, Object>params = new HashMap<String , Object>();
		params.put("isdn", book.getIsdn());
		params.put("bookName", book.getBookName());
		params.put("publication", book.getPublication());
		params.put("price",book.getPrice());
		params.put("description", book.getDescription());
		params.put("author", book.getAuthor());
		rows = namedTemplate.update(INSERT_BOOK,params);
		
		return rows;
		
	}
	
	@Override
	public int updateBook(long isdn , int price) {
		int rows = 0;
//		String Update_Book = "update book set price = ? where isdn = ?";
//		
//		rows = jdbcTemplate.update(Update_Book , price , isdn);
		return rows;
	}
	
	@Override
	public boolean deleteBook(long isdn) {
		int rows = 0 ;
		boolean flag = false;
//		String Delete_Book = "delete from book where isdn=?";
//		
//		rows = jdbcTemplate.update(Delete_Book , isdn);
		if (rows > 0) {
			flag = true ;
		
		}
		return flag;
	}


	

}
