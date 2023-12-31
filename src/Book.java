import java.lang.*;
public class Book implements Comparable<Book>{
	
	private String title;
	private String author;
	private Double price;
	
	public Book() {
		
	}
	

	public Book(String title, String author, Double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	public int compareTo(Book o) {
		return this.author.compareTo(o.getAuthor());
		
		
		
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}
