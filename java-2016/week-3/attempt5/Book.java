public class Book{
public String bookName;
public int pageNumbers;

public Book(){
	}

public Book(String title, int numberOfPages){
	this.bookName = title;
	this.pageNumbers = numberOfPages;
	}
	public void setBookName(String newBookName){
		bookName = newBookName;
	}

	public void setPageNumbers(int newPageNumbers){
		pageNumbers = newPageNumbers;
	}

	public String retrieveBook(){
		System.out.println("asta e cartea");
		return bookName;
	}


	public int retrieveNumberOfPages(){
		System.out.println("asta e numaru de pagini");
		return pageNumbers;
	}
}