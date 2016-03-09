import java.util.*;

public class Book{

// CODE REVIEW - andrei.hegedus - Why are these public and static?
public static String bookName;
public static int pageNumbers;
private static String bookTypeChosen;


// CODE REVIEW - andrei.hegedus - Why is this package visible and static?
static Scanner userInputBook = new Scanner(System.in);
// CODE REVIEW - andrei.hegedus - Think OOP. Can a book read stuff from a standard input? No it can't.

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
		System.out.println("asta e tuitlul ");//sa pot testa daca merge, inca nu am apucat sa testez
		return bookName;
	}


	public int getNumberOfPages(){
		System.out.println("asta e numaru de pagini");//sa pot testa daca merge, inca nu am apucat sa testez
		return pageNumbers;
	}
	
	
    // CODE REVIEW - andrei.hegedus - This method does not belong to the Book class. Moreover it should not be static.
	public static void addBook(){
		System.out.println("choose novel or album");
		bookTypeChosen = userInputBook.nextLine();
		
			switch(bookTypeChosen){
			case "novel":
			Novel.addNovel();
			//da un numar de inventar obiectului - nu face asa ceva deocsmdata
			//adauga obiectul in array
			
			return;
			case "album":
			ArtAlbum.addAlbum();
			//da un numar de inventar obiectului - nu face asa ceva deocsmdata
			//adauga obiectul in array
			return;
			default:
			System.out.println("alege novel sau album  !!!");
			} 
		
	}	
	
    // CODE REVIEW - andrei.hegedus - same as above
	public static void listBook(){
		Novel.listNovel();
		ArtAlbum.listAlbum();
	}
	
    /* CODE REVIEW - andrei.hegedus - NEVER commit commented code! How do I know that this is relevant or not? I don't.
    If you really need this code, keep a separate branch for it.
    You have GIT. Use it.
    */
    
	/* public static void removeBook(){
		System.out.println("Enter id of book to be removed");
		bookRemover = userInputBook.nextInt();
		//ia numarul de inventar al obiectului
		//asociaza-l cu indexul din array la care e alocat
		//sterge din array obiectul
	} */
}