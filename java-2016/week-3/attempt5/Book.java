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

	public String getBookName(){
		System.out.println("asta e tuitlul ");
		return bookName;
	}


	public int getNumberOfPages(){
		System.out.println("asta e numaru de pagini");
		return pageNumbers;
	}
	
	
	public static void addBook(){
		System.out.println("choose novel or album");
		bookTypeChosen = userInputBook.nextLine();
		
			switch(bookTypeChosen){
			case "novel":
			Novel.addNovel();
			//da un numar de inventar obiectului
			//adauga obiectul in array
			
			return;
			case "album":
			ArtAlbum.addAlbum();
			//da un numar de inventar obiectului
			//adauga obiectul in array
			return;
			default:
			System.out.println("alege novel sau album  !!!");
			} 
		
	}	
	
	public static void listBook(){
		Novel.listNovel();
		ArtAlbum.listAlbum();
	}
	
	/* public static void removeBook(){
		System.out.println("Enter id of book to be removed");
		bookRemover = userInputBook.nextInt();
		//ia numarul de inventar al obiectului
		//asociaza-l cu indexul din array la care e alocat
		//sterge din array obiectul
	} */
}