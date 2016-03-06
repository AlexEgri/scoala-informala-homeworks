import java.util.*;

public class Book{


public static String bookName;
public static int pageNumbers;
private static String bookTypeChosen;
static Scanner userInputBook = new Scanner(System.in);

//constructor default al clasei - nu am inteles pana la capat de ce se foloseste
public Book(){
	}
//constructor cu parametri ai clasei, nu pricep de ce as avea nevoie de doi constructori
public Book(String bookName, int numberOfPages){
	this.bookName = bookName;
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

	public String retrieveBookName(){
		System.out.println("asta e tuitlul ");
		return bookName;
	}


	public int retrieveNumberOfPages(){
		System.out.println("asta e numaru de pagini");
		return pageNumbers;
	}
	
	
	public static void addBook(){
		System.out.println("choose novel or album");
		bookTypeChosen = userInputBook.nextLine();
		
			switch(bookTypeChosen){
			case "novel":
			Novel.addNovel();
			return;
			case "album":
			ArtAlbum.addAlbum();
			return;
			default:
			System.out.println("alege novel sau album  !!!");
			} 
		
	}	
	
}