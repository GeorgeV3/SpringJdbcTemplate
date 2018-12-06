package cb.beans;

public class Book {
	
	private long isdn;
	private String bookName;
	private String publication;
	private int price;
	private String description;
	private String author;
	
	
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(long isdn, String bookName, String publication, int price, String description, String author) {
		super();
		this.isdn = isdn;
		this.bookName = bookName;
		this.publication = publication;
		this.price = price;
		this.description = description;
		this.author = author;
	}

	public long getIsdn() {
		return isdn;
	}
	public void setIsdn(long isdn) {
		this.isdn = isdn;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [isdn=" + isdn + ", bookName=" + bookName + ", publication=" + publication + ", price=" + price
				+ ", description=" + description + ", author=" + author + "]";
	}
	
	
	
	



	
}
