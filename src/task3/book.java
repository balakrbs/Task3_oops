package task3;

public class book {
	private int bookid;
	private String title;
	private String author;
	private boolean isavailable;
	
	public book(int bookid, String title, String author) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
		this.isavailable = true;
	}
	
	public int getBookid() {
		return bookid;
	}

	
	public String getTitle() {
		return title;
	}

	
	public String getAuthor() {
		return author;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
	
	

	
}
