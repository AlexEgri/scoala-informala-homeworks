public class Book {
	
	
	public string bookName;
	public int pageNumbers;

	public Book(string bookName, int pageNumbers){
		this.bookName = bookName;
		this.pageNumbers = pageNumbers;
	}
	
	public void setBookName (newBookName) {
		bookName = newBookName;
	}
	
	public void getBookName (){
		return bookName;
	}
	
	public void setPageNumbers (newPageNumbers) {
		pageNumbers = newPageNumbers;
	}
	
	public void getPageNumbers (){
		return pageNumbers;
	}
}