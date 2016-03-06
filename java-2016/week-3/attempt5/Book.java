public class Book{
private String bookName;
private int pageNumbers;


//constructor default al clasei - nu am inteles pana la capat de ce se foloseste
public Book(){
	}
//constructor cu parametri ai clasei, nu pricep de ce as avea nevoie de doi constructori
public Book(String title, int numberOfPages){
	this.bookName = title;
	this.pageNumbers = numberOfPages;
	}
	
	//setter si getter pentru a putea accesa din afara variabilele clasei in metode
	//nu s-au discutat la curs ca fiind setter si getter sau nu am inteles eu
	//din ce am inteles, encapsulation ma face sa am asa ceva
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